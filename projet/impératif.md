SVG en Java impératif
================================================================================

L'objectif de cette étape du projet est de construire une première version des 
outils pour produire des fichiers graphiques SVG similaires à celui des 
[Premier pas](https://developer.mozilla.org/fr/docs/Web/SVG/Tutorial/Getting_Started) 
du [tutoriel SVG de Mozilla](https://developer.mozilla.org/fr/docs/Web/SVG/Tutorial).

![SVG](images/demo1.svg)

L'emphase sera mise sur les constructions impératives (procédurales) du langage
Java.


Hello SVG!
--------------------------------------------------------------------------------

Créez un fichier `SVGTutorial.java` important les fonctions de `utils.Utils`,
puis faites en sorte qu'une fois ce fichier compilé, l'exécution de 
l'application `SVGTutorial` affiche le message `Hello SVG World!`.

Puis, remplacez ce premier message par 

    <svg version="1.1" baseProfile="full" width="300" height="200" xmlns="http://www.w3.org/2000/svg">
        <rect width="100%" height="100%" fill="red"></rect>
        <circle cx="150" cy="100" r="80" fill="green"></circle>
        <text x="150" y="125" font-size="60" text-anchor="middle" fill="white">SVG</text>
    </svg>

Enfin, faites en sorte que ce contenu soit écrit dans le fichier `demo1.svg`.
Ouvrez ensuite ce fichier avec votre navigateur Web pour vérifier que ce
fichier décrit l'image vectorielle souhaitée.


Primitives graphiques
--------------------------------------------------------------------------------

### Fondation
Créez une fonction `rect` permettant de décrire les rectangles. On souhaite
que cette fonction prenne en arguments les tableaux bi-dimensionnels de chaînes
de caractères caractérisant les attributs du rectangle, de telle sorte que si
la variable `rectAttributes` désigne le tableau
```java
String[][] rectAttributes = {
    {"width", "100%"}, 
    {"height", "100%"}, 
    {"fill", "red"}
};
```
alors après l'exécution du code
```java
String rect = rect(rectAttributes);
```
la variable `rect` est une chaîne de caractère qui désigne le fragment SVG
```svg
<rect width="100%" height="100%" fill="red"></rect>
```

### Des erreurs !

Il est très facile à ce stade de "faire planter le programme" en donnant des
attributs invalides. Trois exemples typiques :

```java
String[][] rectAttributes = {
    {"width"}
    {"100%"}, 
    {"height"}, 
    {"100%"}, 
    {"fill"}, 
    {"red"}
};
```

```java
String[][] rectAttributes2 = {
    {"width", "100%", "Euh, qu'est-ce que je fais là?"}, 
};
```

```java
String[][] rectAttributes3= {
    {"width", null}, 
};
```

Tester les trois différents cas. Qu'est-ce qui se passe dans chaque cas ?
A-t'on une erreur à la compilation, à l'exécution, un résultat invalide ?
Ici nous considérons que dans les trois cas la spécification des attributs
est incorrecte que le client du code doit être prévenu par une erreur.
Faites en sorte que cela soit ce qui se passe !



### Argument optionnel
Pour simplifier la vie de l'utilisateur de votre fonction, faites ensuite en 
sorte que le code
```java
String rect = rect();
```
soit équivalent au code plus verbeux suivant :
```java
String[][] noAttributes = {};
String rect = rect(noAttributes);
```

### Génération de SVG

Définir deux constantes de l'application `SVGTutorial` nommées `SVGSTART` et `SVGEND`
désignant les chaînes de caractères 
```xml
<svg version="1.1" baseProfile="full" width="300" height="200" xmlns="http://www.w3.org/2000/svg">
```
et 
```xml
</svg>
```
Puis, utilisez votre fonction `rect` ainsi que les chaînes de caractères 
pour générer un fichier `rectangles.svg` contenant des rectangles 
de formes et positions variées. 
On pourra se reporter à [la référence SVG sur les rectangles](https://developer.mozilla.org/en-US/docs/Web/SVG/Element/rect) pour découvrir les attributs des rectangles.

### Autres primitives.

Reproduisez une démarche analogue pour les cercles en introduisant une fonction
`circle`.

### Généralisation

On souhaiterait se doter de code facilitant l'écriture de fonctions décrivant
des primitives graphiques supplémentaires (car il y en a beaucoup en SVG !)
en évitant autant que possible de dupliquer du code.

Introduire une fonction de signature

    public static String element(String name, String[][] attributes) 

renvoyant la chaîne de caractère renvoyant l'élément SVG nommé `name` et 
d'attributs `attributes`. Puis, changer l'implémentation de vos fonctions 
`rect` et `circ` pour qu'elles exploitent cette fonction `element`.


Elements SVG "conteneurs"
--------------------------------------------------------------------------------

### Document SVG

Contrairement aux éléments `rect` et `circ`, l'élément `svg` peut avoir des 
enfants qui sont eux-mêmes des éléments SVG.
Définissez une fonction `svg` permettant de décrire un élément SVG de type
`svg`, possédant des attributs mais aussi des enfants, décrits comme des
chaînes de caractères. On souhaite avoir la signature

```java
public static String svg(String[][] attributes, String... children)
```
et que le schéma d'usage soit le suivant :
```java
String[][] svgAttributes = {
    {"version", "1.1"},
    {"baseProfile", "full"},
    {"width", "300"},
    {"height", "200"},
    {"xmlns", "http://www.w3.org/2000/svg"}
};
String[][] rectAttributes = {
    {"width", "100%"}, 
    {"height", "100%"}, 
    {"fill", "red"}
};
String[][] circleAttributes = {
    {"cx", "150"},
    {"cy", "100"},
    {"r", "80"}, 
    {"fill", "green"}
};

String elt = svg(svgAttributes,
    rect(rectAttributes),
    circle(circleAttributes),
);
```
Vérifiez en générant un fichier SVG contenant le contenu `elt` que le résultat 
est bien valide.

### Texte

L'élément `text` a des attributs et un contenu, qui peut être composé de 
plusieurs fragments (on peut par exemple considérer le contenu `"Hello SVG!"` 
comme la collection des fragments `"Hello"`, `" "` et `"SVG!"`).     

Implémentez la fonction
```java
public static String text(String[][] attributes, String... children) 
```
permettant de décrire les fragments de SVG de type texte.

Vérifiez le résultat en générant le fichier basé sur la chaîne de caractère
`elt` obtenue par le code suivant :

```java
String[][] svgAttributes = {
    {"version", "1.1"},
    {"baseProfile", "full"},
    {"width", "300"},
    {"height", "200"},
    {"xmlns", "http://www.w3.org/2000/svg"}
};
String[][] rectAttributes = {
    {"width", "100%"}, 
    {"height", "100%"}, 
    {"fill", "red"}
};
String[][] circleAttributes = {
    {"cx", "150"},
    {"cy", "100"},
    {"r", "80"}, 
    {"fill", "green"}
};
String[][] textAttributes = {
    {"x", "150"}, 
    {"y", "125"}, 
    {"font-size", "60"},
    {"text-anchor", "middle"},
    {"fill", "white"}
};

String elt = svg(svgAttributes,
    rect(rectAttributes),
    circle(circleAttributes),
    text(textAttributes, 
        "SVG"
    )
);
```

### Généralisation

Les fonctions `svg` et `text` sont similaires. Comme de très nombreux autres
éléments SVG ont des enfants, on souhaite à nouveau se doter d'une fonction
simplifiant leur implémentation. Généraliser la fonction `element` déjà
codée pour supporter les éléments avec enfants ; comme certains éléments
(comme `svg`) se prêtent à du contenu indenté et d'autres (comme `text`) non, 
on choisira une signature de la forme
```java
public static String element(
    String name, 
    String[][] attributes, 
    boolean indent, 
    String... children) 
```
laissant le choix d'indenter ou non le contenu selon la valeur du paramètre `indent`. Réimplémenter les fonctions `svg` et `text` en utilisant cette fonction.
Vérifiez ensuite le résultat comme à la question précédente.

Configuration
--------------------------------------------------------------------------------

Etendez votre programme pour que son utilisateur puisse remplacer le texte
`"SVG"` par un message de son choix, en faisant :

```shell
$ java SVGTutorial Hello
```