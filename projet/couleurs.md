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



### Constructeur auxiliaire

### Représentation

Transparence
--------------------------------------------------------------------------------

`ColorAlpha`

**TODO.** Questionner sur l'opportunité de l'héritage ou de la composition.

Couleur nommées
--------------------------------------------------------------------------------

`NamedColor`

**TODO.** Questionner sur l'opportunité de l'héritage.