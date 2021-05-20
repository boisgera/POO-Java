Couleurs
================================================================================

L'objectif de cette étape du projet est de développer un support pour la
représentation des couleurs qui seront exploitées pour décrire un aspect
des éléments graphiques SVG.

Classe `Color`
--------------------------------------------------------------------------------

### Constructeur

Construire une classe `Color` dont le constructeur prend comme argument
trois entiers compris entre 0 et 255 représentant les intensités de la
couleur dans les canaux rouge, vert et bleu.

```java
Color red = new Color(255, 0, 0);
```

On souhaite que les instances de `Color` exposent publiquement ces
intensités sous la forme d'attributs entiers `R`, `G` et `B`:

```java
int R = color.R;
int B = color.B;
int G = color.G;
```

Pour simplifier l'usage des couleurs (et éviter une large classe de bugs
potentiels) on souhaite que les instances de `Color` soient immuables : une
fois une instance de couleur initialisée, il ne devra plus être possible de modifier
son contenu (c'est la même stratégie qui est adoptée pour les types standard 
`Integer`, `Double`, `String`, etc.)

### Paramètres invalides

Sans précaution supplémentaire, il est possible d'initialiser des couleurs qui
sont invalides. En particulier, il est sans doute possible d'utiliser un argument 
entier qui n'est pas compris entre 0 et 255. Selon la façon dont vous avez
construit la class `Color`, il est peut-être également possible d'utiliser
un argument `null`.

Adressez cette situation pour prémunir aux maximum l'utilisateur contre les
erreurs (en particulier les erreurs qui ne seront détectées que tardivement) ! 
Notez qu'il n'existe pas de solution unique à cette problématique : vous pourrez
choisir de "corriger" automatiquement les paramètres invalides ou bien d'être
plus stricts et de signaler les problèmes systématiquement par la génération 
d'une erreur.

Le cas échéant, vous pourrez rechercher parmi [les classes dérivant de
`RuntimeException`](https://docs.oracle.com/javase/8/docs/api/java/lang/RuntimeException.html)
les exceptions qui vous semblent les plus appropriées, ou définir et exploiter 
votre propre exception.

### Représentation 

Créez une méthode `toString` permettant de représenter les couleurs par une
chaîne de caractère. On souhaite que cette chaîne de caractère prennent la
forme `"rgb(255, 0, 0)"` pour un rouge pur par exemple.

Vérifiez qu'une fois cette méthode implémentée, vous pouvez facilement
afficher cette représentation de vos couleurs sur la sortie standard.

```java
Color red = new Color(255, 0, 0);
java.lang.System.out.println(red);
```

### Egalité

Créez deux instances de "rouge" et testez leur égalités avec l'opérateur `==`.
Quel est le résultat ? Pouvez-vous l'expliquer ?

Implémentez une méthode `equals` [dont la signature est conforme à la méthode
`equals` de `Object`](https://docs.oracle.com/javase/8/docs/api/java/util/Objects.html)
et qui se comporte de façon plus conforme au besoin (deux couleurs sont considérées
égales si et seulement si les intensités de tous leurs canaux sont égales).

Renseignez-vous également sur le rôle de la méthode `hashCode` de `Object` 
(et en particulier, ses liens avec la méthode `equals`) et proposez 
une surcharge de `hashCode` adaptée, propre à `Color`.

Couleurs et Hexadécimal
--------------------------------------------------------------------------------

Dans le monde du Web, il existe une représentation alternative aux couleurs,
basée sur l'hexadécimal : le rouge pur `rgb(255, 0, 0)` devient alors 
`#ff0000` (`255` donne `ff` en hexadécimal, `0` devient `00`).

### Constructeur auxiliaire

Développer un second constructeur pour la classe `Color` qui accepte les
chaînes de caractères hexadécimales décrites ci-dessus. Comme pour le
constructeur principal, on fera en sorte de traiter soigneusement le
risque de création de couleurs invalides.

### Représentation

Introduire une méthode
```java
public String toHexString()
```
renvoyant la représentation hexadécimale d'une couleur.

Transparence
--------------------------------------------------------------------------------

En SVG (comme en HTML), les couleurs sont parfois assorties d'un niveau de 
transparence, décrit par le canal alpha (`A`) ; `A = 0` correspond à une
couleur totalement transparente, `A = 255` correspond à une couleur totalement
opaque.

### Faire ...
Développer une classe `ColorAlpha` similaire en tout point à la classe `Color`
mais possédant quatre canaux `R`, `G`, `B` et `A`.

### ... puis améliorer !

On s'efforce en général, pour faciliter la maintenance du code et limiter 
les risques d'erreurs, d'éviter autant que possible de dupliquer du code.

L'héritage de classe est parfois utilisé à cet effet. Est-ce une bonne idée
ici de faire dériver `ColorAlpha` de `Color` ? Quels seraient les risques ?

Quelles alternatives éventuelles avez-vous pour remanier votre code afin 
d'éviter la duplication ?

### Conversions `ColorAlpha` / `Color`.

Pour faciliter les allez-retours entre couleur "normale" et couleur avec 
transparence :

  - Ajoutez aux champs publics de `ColorAlpha` un champ public constant `color`
    synchronisé aux contenus `R`, `G`, `B`.

  - Ajoutez aux constructeurs de `ColorAlpha` un constructeur acceptant une
    instance de `Color` et optionnellement un champ entier `A` (par défaut,
    on interprétera l'absence de champ alpha comme une couleur opaque).

Couleur nommées
--------------------------------------------------------------------------------

Dans le contexte du SVG (et plus largement du Web), de nombreuses couleurs
sont désignées par leur nom : `white`, `black`, `red`, `green`, `blue`, etc.

La couleur `#663399` <img src="images/rebeccapurple.svg" width="25%" style="display:inline;"/>: [`rebeccapurple`][rebeccapurple]

[rebeccapurple]: https://medium.com/@valgaze/the-hidden-purple-memorial-in-your-web-browser-7d84813bb416

<p align="center"><figure>
<img src="images/rebeccapurple.svg" width="25%" />
<figcaption>La couleur <code>#663399</code>: <a href="https://medium.com/@valgaze/the-hidden-purple-memorial-in-your-web-browser-7d84813bb416" ><code>rebeccapurple</code></a>.</figcaption>
</figure></p>

`NamedColor`

**TODO.** Questionner sur l'opportunité de l'héritage.