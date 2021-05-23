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

**TODO :**

  - Ajout spécification d'attributs sachant se représenter comme XML à
    `Element`. `Attributes` pourrait supporter les `String[][]` en entrée
    et donc réutiliser le code déjà développé pour valider le tableau.
    Récupérer aussi le code de builder `kv` à cette occasion (?).

    Tester.

    `Attributs` à vocation, contrairement à `String[][]` à ne plus nécessiter
    de validation! Produire un `String[][]` en sortie ? Histoire de réutiliser
    le "vieux" code de représentation XML ?

  - Idée de la spécialisation par type d'element des attributs considérés
    valides (a priori juste le nom ? Mais le principe des valeurs serait
    le même). C'est bien mais il faut aussi après s'assurer que les clés
    valeurs ne puissent être modifiées, juste lues. Ou tout filtrer par
    une tripotée d'accesseurs. Réfléchir en détail au "blindage".

    En gros, c'est immutabilité tout du long ou pas. Et si immutabilité,
    implémentée avec ou sans accesseurs (intérêt de l'accesseur: ne pas
    avoir à se prononcer sur les choix internes, par exemple de type conteneur,
    de façon définitive). Noter qu'on peut aussi opter pour de l'immutabilité
    publique et de la mutabilité pour les descendants et c'est sans doute ce
    qui est le plus pratique pour développer la lib.

  - Réfléchir à la mise en commun du code de validation en découpant les
    attributs par "famille" réutilisables à plusieurs endroits (telles que:
    `Fill`, `Strike`, etc.). Faire de la validation de valeurs à cette occasion?
    (par exemple en réutilisant la class `Color` ?)
