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
document XML. Cette interface déclare la méthode
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
ces attributs sont bien définis (non `null`).

### Hiérarchie des Elements

On souhaite introduire des classes telles que `SVG`, `Rectangle`, `Circle`, etc.
qui seront des éléments, mais dont les fonctionnalités seront propres au type
de l'élément considéré. Comment se traduit dans le paradigme objet de Java le
fait que ces objets sont des éléments ? Implémentez ces trois classes et
des constructeurs de signature adaptée dans chaque cas ; on fera appel dans
ces constructeurs au constructeur de `Element` pour réutiliser le code déjà
écrit.

La liste des éléments SVG reconnus est disponible dans [la documentation SVG](https://developer.mozilla.org/fr/docs/Web/SVG/Element). Par exemple, il n'existe aucun élement
appelé `rect1`. Et pourtant à ce stade, rien ne va prévenir le développeur
de son erreur lorsqu'il écrira le code
```java
Element rect1 = new Element("rect1");
```
Quel modification est-ce que vous pourriez faire à votre programme pour mieux
prendre en compte cette situation ?

### Noeuds

Réfléchissez à l'implémentation de la classe `Text` qui correspond aux éléments
de type `text` en SVG. Est-ce que le constructeur de la classe `Element` est
adapté ? On rappelle que contrairement à l'élément `svg` par exemple, les
données "enfants" de `text` ne sont pas (nécessairement) des éléments, mais
peuvent être du texte (sans balise).

Implémentez une class `Text` qui se déclare conforme à l'interface `XML` et dont
le constructeur aura la forme
```java
public Text(String text)
```

Introduir ensuite un concept de `Node` dans votre programme qui puisse désigner 
indifférement une instance de `Element` ou de `Text`. Modifiez en conséquence
le constructeur de `Element`.

Testez votre code en créant un fichier contenant le contenu XML associé à :

```java
XML xml = new SVG(new Rect(), new Circle, new Text());
```
## Attributs

