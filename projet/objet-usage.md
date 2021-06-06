Usage des Objets Standards
================================================================================

L'objectif de cette partie est de prendre en main les objets de base, en tant qu'**utilisateur**. Pour l'ensemble de ces exercices, on va travailler dans un fichier unique nommé `TutorialObject.java` qui consistera en une application simple et différentes fonctions qui seront appelées en fonction de l'exercice traité. À ce stade, on ne créera pas encore de *classe* au sens de la *programmation orientée objet*.

Par ailleurs, à partir de cette partie, on essayera de se détacher autant que possible des fonctions *helpers* créées dans la bibliothèque `utils`. En particulier, les fonctions `print` et `str` ne seront plus utilisées. On s'autorisera uniquement les fonctions de lecture et écriture dans des fichiers (`read` et `write`).   


## Préparation

Créez un fichier `TutorialObject.java` exécutable avec une fonction `main`qui ne fait rien. 

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

### Quelques méthodes de `Integer` (passer en première lecture)

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

### Découverte de `Double`

La classe `Double` est quant à elle le pendant Objet du type primitif `double`. Par rapport aux variables de type entières, les variables `Double` peuvent prendre deux valeurs spéciales : l'infini (et -l'infini) et NaN (Not A Number). Un calcul sur les doubles donne l'infini si on divise une valeur positive par 0 ou si on arrive à une valeur trop grande à représenter. Not a number est retourné lorsque certains calculs ne peuvent être résolus (0/0, infini-infini par exemple).

Créez une fonction de signature
```java
public static void testDouble()
```
et y initialiser quelques `Double` (fini, infini et NaN). Trouvez les méthodes permettant de tester si un `Double` est infini ou NaN, puis faites en sorte que `testDouble` affiche les résultats dans le terminal (n'oubliez pas d'appeler `testDouble` dans `main` !)

## API de `String`

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
completeLetter("lettre","Java",true);
```
ou un appel de 
```java
completeLetter("lettre.txt","Java",true);
```
devra produire le même fichier `lettre_Java.txt`.

### Découper un `String`

Tous les objets viennent avec la méthode `toString()` qui permet de représenter l'objet sous la forme d'une chaîne de caractères. C'est notamment cette méthode qui est appelée par `println` pour afficher un objet dans le terminal.

On va s'intéresser ici à la représentation des `Double` : on voudrait séparer la partie qui vient avant la virgule de la partie qui vient après. Écrivez la fonction 
```java
public static void readDouble(Double x)
```
qui permet d'afficher dans le terminal les partie avant la virgule et la partie après la virgule. Par exemple, un appel à 
```java
readDouble(3.14);
```
devra afficher 

    Partie entière   : 3 
    Partie décimale  : .14 

Que se passe-t-il si j'appelle `readDouble(1_000_000d)`? Corriger l'implémentation de `readDouble` pour que le résultat de `readDouble(1_000_000d)` soit convaincant tout en garantissant que le résultat de `readDouble(3.14)` **reste inchangé**.

Enfin, on voudrait faire en sorte que le nombre de chiffres après la virgule puisse être défini par l'utilisateur et passé en argument de `readDouble`. On veut que le prototype de `readDouble` soit désormais
```java
public static void readDouble(Double x,int size)
```  
Par exemple, un appel à 
```java
readDouble(3.14,1);
```
devra afficher

    Partie entière   : 3 
    Partie décimale  : .1 

alors qu'un appel à 
```java
readDouble(3.14,6);
```
devra afficher

    Partie entière   : 3 
    Partie décimale  : .140000
  
Note : si le deuxième argument est inférieur ou égal à 0, alors on le remplacera par 1.

Mettez à jour `readDouble` et faites en sorte que le fichier `main` réalise (entre autres) les appels suivants :
```java
readDouble(3.,-2);
readDouble(3.,2);
readDouble(3.14159,4);
readDouble(1./3.,1);
readDouble(1.4564e15,10);
```

## Utilisation d'une liste
Pour cette partie, il faut réaliser l'import de `java.util` : rajoutez la ligne suivante dans l'en-tête de votre fichier :
```java
import java.util.*;
```

On voudrait créer une fonction qui retourne la liste des diviseurs d'un entier, sous la forme d'un *container* dynamique (la taille n'est pas connue à l'avance). Créez la fonction
```java
public static List<Integer> listDiv(int N)
```
qui permet de retourner la liste de tous les diviseurs du nombre `N`. Réalisez un appel de `listDiv` dans la fonction `main` et affichez le nombre de diviseurs et la liste dans le terminal. 

## La duplication d'objets
On propose dans ce dernier exercice d'étudier la duplication d'objets. En particulier, nous voudrions qu'un objet dupliqué ne soit pas lié à sa copie. Nous allons utiliser les tableaux en guise de support. 
### Un tableau d'entiers
Créez la fonction 
```java
public static void testArray()
```
qui réalise les opérations suivantes :
  - Enregistrement du tableau `{1,2,3}` dans la variable `a1`
  - Déclaration d'un tableau `a2`puis copie de `a2`à `a1` (avec `a2=a1`)
  - Affichage sur une ligne de `a1`, puis `a2` sur une autre ligne
  - Modification du premier élément de `a1`
  - Affichage sur une ligne de `a1`, puis `a2` sur une autre ligne
puis réalisez l'appel de `testArray` dans la fonction `main`. Que se passe-t-il ?

**Certains objets** ont en fait une méthode `clone` dont le but est de recopier l'objet. C'est effectivement le cas pour les tableaux Java. Reprenez le code de `testArray` pour que le tableau `a1` soit indépendant de sa copie.

### Un tableau de tableaux
Créez la fonction 
```java
public static void testArray2()
```
qui réalise les opérations suivantes :
  - Enregistrement du tableau `{{1,2,3},{10,20},{100}}` dans la variable `a1`
  - Déclaration d'un tableau `a2`puis affectation de `a2`à `a1` (de façon "propre")
  - Modification de `a1[0][0]`
  - Affichage de `a1[0][0]`, puis `a2[0][0]` 
puis réalisez l'appel de `testArray` dans la fonction `main`. Que se passe-t-il ?

Essayez d'affecter **directement** le tableau `{30,40}` à la place de `{10,20}`dans `a1`, puis vérifiez que les éléments `10` et `20` sont bien présents au bon endroit dans `a2`. 

Pouvez-vous expliquer ce qu'il s'est passé lorsqu'on a modifié `a1[0][0]` ?
