Documents SVG
================================================================================

Les objectifs de cette étape du projets sont similaires aux précédents :
permettre de décrire de façon programmatique un document SVG. Néanmoins,
on souhaite désormais exploiter le support objet de Java pour incarner les
différents concepts intervenant dans les documents (attributs, élements, 
etc.).

## XML

Définir une interface XML qui permettra de distinguer les objets sachant se
représenter (comme une chaîne de caractères) sous la forme de (fragment de)
document XML comme les éléments ou les attributs d'un élément. 
Cette interface déclare la méthode
```java
public String toXML()
```

## Elements

Les éléments XML (et donc SVG) sont les objets décrits par les balises
ouvrantes et fermantes `<tag ...>`, `</tag>`, tels que `svg`, `rect`,
`circle`, `text`, etc. Dans un premier temps on s'intéresse à la hiérarchie
des éléments XML uniquement, et pas à leur attributs.

Définir une classe `Element` munie d'un constructeur
```java
public class Element(String name, Element... children)
```
Implémenter une fonction `toXML` conforme à l'interface `XML` et déclarer
que `Element` implémente bien cette interface. Pour le moment, `Element`
exposera ses attributs `name` et `children` sans restriction. Assurez-vous
que quel que soit le scénario de construction d'un élément, 
ces attributs sont bien définis (différents de `null`).

### Hiérarchie des élements

On souhaite introduire des classes telles que `SVG`, `Rectangle`, `Circle`, etc.
qui seront des éléments, mais dont les fonctionnalités seront propres au type
de l'élément considéré. Comment se traduit dans le paradigme objet de Java le
fait que ces objets sont des éléments ? Implémentez ces trois classes et
des constructeurs de signature adaptée dans chaque cas ; on fera appel dans
ces constructeurs au constructeur de `Element` pour réutiliser le code déjà
écrit.

Testez votre code en affichant le contenu XML associé au document
```java
XML xml = new SVG(new Rect(), new Circle());
```
(créez une application `App` et une fonction `main` associée hébergeant ce
code).

### Elements inconnus

La liste des éléments SVG reconnus est disponible dans [la documentation SVG](https://developer.mozilla.org/fr/docs/Web/SVG/Element). Par exemple, il n'existe aucun élement
appelé `rect1`. Et pourtant à ce stade, rien ne va prévenir le développeur
de son erreur lorsqu'il écrira le code
```java
Element rect1 = new Element("rect1");
```
Quel modification est-ce que vous pourriez faire à votre programme pour mieux
prendre en compte cette situation ? Vérifiez que le code d'exemple que vous 
avez écrit marche encore sans nécessiter de modification.

### Noeuds

Réfléchissez à l'implémentation de la classe `Text` qui correspond aux éléments
de type `text` en SVG. Est-ce que le constructeur de la classe `Element` est
adapté ? On rappelle que contrairement à l'élément `svg` par exemple, les
données "enfants" de `text` ne sont pas (nécessairement) des éléments, mais
peuvent être du texte (sans balise), comme dans l'exemple de fragment XML
`<text>SVG</text>`.

Introduire pour résoudre cette difficulté un concept de `Node` dans votre 
programme qui puisse désigner indifférement une instance de `Element` 
ou de `Text` (classe qu'il nous faut encore implémenter) ;
est-ce qu'il vous semble préférable de faire de `Node` une interface ou
une classe abstraite ?
Faites votre choix, puis modifiez en conséquence le constructeur de `Element`.
Vérifiez que le code que vous aviez écrit qui exploitait ce constructeur 
marche encore sans modification.

Implémentez une class `Text` qui se déclare conforme à l'interface `XML` 
et dont le constructeur aura la forme
```java
public Text(String text)
```

Testez votre code en affichant le contenu XML associé au document

```java
XML xml = new SVG(new Rect(), new Circle(), new Text("SVG"));
```

## Attributs

### Attributs génériques

Définir une classe attributs comportant un constructeur acceptant 
un tableau bidimensionnel `String[][]` qui décrivent une collection d'attributs
[avec les conventions déjà exploitées dans la version procédurale](impératif.md).

Faire en sorte que le constructeur opère les sur le tableau les validations 
élémentaires déjà considérées dans [la version procédurale](impératif.md).

Pour que cette validation reste valable une fois faite, 
on souhaite que les instance de la classe `Attributes` soient immuables : 
une fois initialisée, une collection d'attributs doit être scellée ;
il ne doit plus y avoir de moyen de changer son contenu.

Symétriquement, faire en sorte qu'une instance de la classe `Attributes` puisse 
être convertie en tableau de type `String[][]` au moyen d'une méthode `toArray`.

Proposer ensuite un constructeur alternative acceptant un nombre arbitraires
d'instances de la classe `Attributs` et qui construit la réunion de toutes
ces collections.

Pour finir, implémenter l'interface `XML` pour la classe `Attributes`.

### Element

Ajouter à `Element` un constructeur acceptant des attributs en plus
des noeuds enfants. 
Puis adapter en conséquence les constructeurs des types dérivés 
pour lesquels c'est nécessaire.

```java
    String[][] svgAttributesArray = {
      {"xmlns", "http://www.w3.org/2000/svg"},
      {"version", "1.1"},
      {"baseProfile", "full"},
      {"width", "300"},
      {"height", "200"},
      {"viewbox", "0 0 300 200"}
    };
    Attributes svgAttributes = new SVGAttributes(svgAttributesArray);

    String[][] rectangleAttributesArray = {
      {"width", "100%"},
      {"height", "100%"},
      {"fill", "red"}
    };
    Attributes rectangleAttributes = new RectangleAttributes(rectangleAttributesArray);

    String[][] circleAttributesArray = {
      {"cx", "150"},
      {"cy", "100"},
      {"r", "80"},
      {"fill", "green"}
    };
    Attributes circleAttributes = new CircleAttributes(circleAttributesArray);

    String[][] textAttributesArray = {
      {"x", "150"},
      {"y", "125"},
      {"font-size", "60"},
      {"text-anchor", "middle"},
      {"fill", "white"}
    };
    Attributes textAttributes = new TextAttributes(textAttributesArray);

 SVG svg = new SVG(svgAttributes,
        new Rectangle(rectangleAttributes),
        new Circle(circleAttributes),
        new Text(textAttributes, new TextNode("SVG"))
    );
```

### Attributs spécialisés



  - Réfléchir à la mise en commun du code de validation en découpant les
    attributs par "famille" réutilisables à plusieurs endroits (telles que:
    `Fill`, `Strike`, etc.). Faire de la validation de valeurs à cette occasion?
    (par exemple en réutilisant la class `Color` ?)

