Usage des Objets Standards
================================================================================

L'objectif de cette partie est de prendre en main les objets de base, en tant qu'**utilisateur**. Pour l'ensemble de ces exercices, on va travailler dans un fichier unique nommé `tutorialObject.java` qui consistera en une application simple et différentes fonctions qui seront appelées en fonction de l'exercice traité. À ce stade, on ne créera pas encore de *classe* au sens de la *programmation orientée objet*.

Par ailleurs, à partir de cette partie, on essayera de se détacher autant que possible des fonctions *helpers* créées dans la bibliothèque `utils`. En particulier, les fonctions `print` et `str` ne seront plus utilisées. On s'autorisera uniquement les fonctions de lecture et écriture dans des fichiers (`read` et `write`).   


## Préparation

Créer un fichier `tutorialObject.java` exécutable avec une fonction `main`qui ne fait rien. 

## Les extensions des types primitifs 


### Première initialisation d'un `Integer`
Il s'agit ici de prendre en main le type `Integer`, l'équivalent objet du type primitif `int`. On s'intéresse ici à 3 façons différentes d'initialiser un `Integer` :
  - Directement à l'aide d'un littéral
  - À l'aide de l'opérateur `new` (note : cette façon est dépréciée pour Java >9)
  - À l'aide de la fonction `Integer.valueOf` (regarder dans la liste des méthodes de [`Integer`](https://docs.oracle.com/en/java/javase/12/docs/api/java.base/java/lang/Integer.html) ce que cette fonction fait)

Créez une fonction de signature
```java
public static void testInteger()
```
qui instancie dans 3 variables différentes (`a`, `b` et `c`) un `Integer` égal à 3, puis qui affiche sur 3 lignes le contenu des 3 variables. Faire en sorte que `main` appelle la fonction `testInteger`. On pensera à utiliser `System.out.print` ou `System.out.println` pour l'affichage. 

Complétez `testInteger` pour afficher le résultat des tests d'égalité entre `a` et `b`, `b` et `c`,...

Changez la valeur des variables à 400 au lieu de 3. Quels sont les résultats des tests ? 

Tous les objets ont en fait une méthode nommée `equals` qui permet de tester l'égalité de deux objets. Reprenez `testInteger` pour que les tests précédents renvoient tous `true`.

### Quelques méthodes de Integer (passer en première lecture)

La classe `Integer` a un certain nombres de champs et méthodes dits `static`. Il s'agit soit de variables qui ne dépendent pas de l'instance, soit de **fonctions** également indépendantes de l'instance. On y accède directement grâce au nom de la classe puis un point :
```java
  Integer.BYTES ; // Variable représentant le nombre d'octets pour représenter un int
```
Compléter `testInteger` pour afficher les valeurs min et max représentables par les entiers.

Enfin, les objets de type `Integer` ont également des méthodes non statiques. Il s'agit de méthodes qui *dépendent de l'objet créé*. Pour rappel, on les appelle avec le nom de l'objet suivi d'un point. Par exemple :
```java
  a.doubeValue(); // Retourne une valeur de type double aussi proche que possible de a
```
L'une de ces méthodes permet par exemple de comparer deux entiers. Trouvez la méthode correspondante et affichez quelques résultats typiques d'usages (lorsque `a` et `b` sont égaux, lorsque `a>b`,...). 

### Découverte de Double

La classe `Double` est quant à elle le pendant Objet du type primitif `double`. Par rapport aux variables de type entières, les variables `Double` peuvent prendre deux valeurs spéciales : l'infini (et -l'infini) et NaN (Not A Number). Un calcul sur les doubles donne l'infini si on divise une valeur positive par 0 ou si on arrive à une valeur trop grande à représenter. Not a number est retourné lorsque certains calculs ne peuvent être résolus (0/0, infini-infini par exemple).

Créez une fonction de signature
```java
public static void testDouble()
```
et y initialiser quelques `Double` (fini, infini et NaN). Trouvez les méthodes permettant de tester si un double est infini ou NaN, puis faites en sorte que `testDouble` affiche les résultats dans le terminal (n'oubliez pas d'appeler `testDouble` dans `main` !)

## API String

L'objectif de cette partie est de prendre en main la classe [`String`](https://docs.oracle.com/en/java/javase/12/docs/api/java.base/java/lang/String.html) qui a de très nombreuses utilités. La plupart des exercices suivants se nécessitent que peu de code si on s'appuie sur les bonnes méthodes de la classe `String`

### La lettre à compléter

On vous donne un modèle de lettre dans le fichier [`lettre.txt`](./lettre.txt). On voudrait pouvoir générer de manière automatique une lettre adressée à la bonne personne. Ajoutez une fonction dont le prototype est:
```java
static void completeLetter(String name, boolean isFemale)
```
qui permet d'enregistrer la lettre adressée au nom `name` sous le nom de fichier `lettre.txt`. **N'oubliez pas de mettre à jour `main`**.

On voudrait pouvoir spécifier le nom de fichier de modèle et faire en sorte que le nom de fichier final soit composé du nom du fichier de base, puis un "underscore" puis le nom de la personne, avec enfin l'extension `txt`. On supposera que les fichiers de modèles sont toujours stockés dans un fichier avec l'extension `.txt`. L'utilisateur pourra donner soit le nom complet avec extension, soit le nom sans extension. Mettez à jour `completeLetter` avec le prototype suivant :
```java
static void completeLetter(String filename,String name, boolean isFemale)
```
Un appel de 
```java
completeLetter("lettre","Java",True);
```
ou un appel de 
```java
completeLetter("lettre.txt","Java",True);
```
devront produire le même fichier `lettre_Java.txt`.

### Découper un `String`

Tous les objets viennent avec la méthode `toString()` 

TODO :
  - `Integer`, `Double`, `Boolean` etc. APIs, comme prolongement des types
    primitifs.
  
  - `String` API (`length`, `replace`, etc.),

  - `System.out` (`PrintStream`), plutôt que la fonction `print`

  - Méthode usuelles : `toString`, `equals`, `clone`, etc.

  - Listes, Maps (concrêtes et interfaces), etc.
