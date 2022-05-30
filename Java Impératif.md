% Java Impératif

Introduction 
==================

Objectifs de cette session 
-----------------------------------------

Comment utiliser Java comme un langage impératif  ? 

  - **Pas de notion d'objet**
  
  - Être capable de développer une application faisant appel à une série d'instructions évaluées les unes après les autres

  - Être capable d'utiliser des **fonctions** issues d'une bibliothèque externe

  - Être capable d'écrire et d'utiliser ses propres **fonctions**


Points abordés dans cette session 
----------------------------------------

  - Les impératifs dans un fichier Java

  - Création de fonctions
  
  - Introduction aux différents **types** en Java

  - Introduction aux opérations de base

  - Introduction aux instructions de **flow control**

  - Introduction à la fonction main




Créer un fichier Java
=======================================

Retour sur le "Hello World" 
--------------------------------------

Fichier **App.java**:
```java
import java.lang.System;
public class App {
  public static void main(String[] args) {
    System.out.println("Hello, World!");
  }
}
```
  - Premières lignes : les importations de bibliothèques
  - Correspondance `public class XXX` / nom de fichier
  - Correspondance `public static void main` : création d'une fonction `main`  


Définition d'une fonction
---------------------------

```java
  public static void main(String[] args) {
      System.out.println("Hello, World!");
  }
```

  - `public static` : élément à insérer avant la déclaration d'une fonction

  - `void` : type de retour

  - `main` : nom de la fonction

  - `String[] args` : type et nom des arguments

---------------------------


  ```java
  TYPE_DE_RETOUR nom(TYPE1 arg1, TYPE2, arg2,...){
    Instruction1 ;
    Instruction2 ;
    ...
  }
  ```
  - Corps de la fonction entre les accolades

  - Une fonction ne peut retourner qu'un seul objet 
  
  - ou rien (type `void`)

---------------------------

```java
      System.out.println("Hello, World!");
```

  - `System.out.println` : instruction pour afficher quelque chose dans le terminal

  - `"Hello, World!"` : argument passé à la fonction `println` (ici une chaîne de caractères)



Quelques règles sur les instructions :
---------------------------

```java
Instruction ; // Ceci est un commentaire
/*
Ceci est un bloc de commentaires
Qui peut s'étendre sur plusieurs lignes
*/
Instruction_suivante ;
```
  - Se termine toujours par un point-virgule 

  - Les commentaires sont avec les symboles `//` (commentaire simple) ou `/* ...*/` (bloc)


Les types Java 
=======================================

Types de base
--------------------------------------
Java est un langage fortement typé. 

8 types de base : 


  - **byte**, **short**, **int**, **long**

  - **float**, **double**

  - **boolean**

  - **char**
  
 Les différents entiers
-------------------------------------

  - **byte** : entier signé sur 8 bits $[-128,127]$

  - **short** : entier signé sur 16 bits $[-32768,32767]$

  - **int** : entier signé sur 32 bits $[-2^{31},2^{31}-1]$

  - **long** : entier signé sur 64 bits $[-2^{63},2^{63}-1]$ 

Les entiers littéraux
-------------------------------------

  - Par défaut des **int** (ex. : 1, 2, 3,...)

  - **byte**, **short**, **int** et **long** peuvent être initialisés avec un entier littéral

  - Les **long** avec des valeurs supérieures à $2^31$ peuvent être initialisés avec des littéraux finissant par "L" (ex. : 1000000000L)

  - Possibilité d'ajouter des underscores "_" pour la lisibilité (ex. : 1_100) 

<!---
À essayer dans l'interpréteur BlueJ
------------------------------------
*Note : sans point-virgule, on récupère directement le résultat* 
    
    1_000_000 // On va afficher l'entier 1 million
    int i = 1_000_000 ; 
    10_000_000_000 // On essaye d'afficher 10 milliards (> 2^31)
    10_000_000_000L  
    int j = 10_000_000_000L // Que passe-t-il ?
    long k = 10_000_000_000L
    byte b = 128 ; // On tente d'affecter 128 à un byte
    byte b2 = 127 ;
    b2 = b2++ ;  // Que se passe-t-il ?
    b2
--->

Les différentes bases d'entiers 
----------------------------------

```java
// Le nombre 26 en décimal 
int decVal = 26;
//  Le nombre 26, en hexadécimal
int hexVal = 0x1a;
// Le nombre 26, en binaire
int binVal = 0b11010;
```

Les nombres flottants
-----------------------------------

  - **float** : Nombres flottants simple précision codés sur 32 bits 

  - **double** : Nombres flottants double précision codés sur 64 bits.

Exemples :

```java
double a = 1 ; 
double b = 1.0 ;
double c = 1.3e3 ;
```

Attention aux expressions littérales 
-----------------------------------

```java
double a = 3 ;
double b = 2 ;
double c = a/b ;

double d = 3/2 ; // --> Renvoie 1 !!!
```

Les booléens
-----------------------------------

  - **boolean** : ne peut valoir que **true** or **false**

  - À utiliser dans les tests logiques

  - "*Use this data type for simple flags that track true/false conditions. This data type represents one bit of information, but its "size" isn't something that's precisely defined.*"


Les caractères
-----------------------------------

  - **char** : caractère unicode codé sur 16 bits

  - Va de *\\u0000* à *\\uFFFF* 

Exemple : 
  
```java
  char a = 0 ; 
  char capitalC = 'C' ;
  (int)capitalC ; // Conversion de capitalC en entier (code unicode)
```


Échapper un symbole
---------------------------

  - Peut-on utiliser les caractères `"` et `'` ?

  - Les *échapper* avec un backslash `\`

  - Un caractère utile : le retour à la ligne `\n`

```java
char guillemet = '\"' ;
char apostrophe = '\'';
char backslash = '\\' ;
char retourLigne = '\n';
```


<!-- 
Les objets
-----------------------------------


  - Tous les autres types sont des objets

  - ex. : Chaînes de caractères, tableaux, listes,...

  - Un objet : des attributs et des méthodes : on y accède à l'aide de l'opérateur "`.`" 

  - On crée une nouvelle instance d'un objet grâce au mot clé `new` 


Le pendant Objet des entiers et flottants
-----------------------------------

Il s'agit des classes **Byte**, **Short**, **Integer**, **Long**, **Float**, **Double**

    Integer a ;
    a = new Integer(3) ;

  - On déclare une variable `a` de type `Integer`

  - On crée une nouvelle instance grâce à `new` puis le constructeur.

  - Ex. : [doc Java Integer](https://docs.oracle.com/javase/8/docs/api/java/lang/Integer.html)

-->


<!--------
Exercice 
--------------------

  - Essayer de voir avec BlueJ le nom du champ qui contient la valeur d'un entier dans **Integer**.
  - Essayer de lire cette valeur à l'aide de l'interpréteur
  - Trouver la méthode permettant de réaliser cette opération.
-->


Les tableaux 
--------------------

Les tableaux (**array**) permettent de stocker un nombre **connu** d'objets en mémoire. 

Ils peuvent être de n'importe quel type.

   - `int[]`

   - `double[]`

   - `char[]`

   - ...

---------------

 Déclaration :

```java
int[] tableau ; // Déclaration d'un tableau d'entiers
```

Initialisation avec le mot-clé `new`
 
```java
tableau = new int[N] ; // N est un entier
```

Accès : avec l'opérateur [] 
```java
    tableau[i] ; // i < N
```
---------------------------- 

Une autre façon d'initialiser un tableau lorsqu'on connaît les éléments : 

```java
int[] tableau2= {3,4,5,6} ;
```

Les tableaux peuvent être modifiés directement :

```java
tableau2[0] = 0 ; // tableau2 vaut donc {0,4,5,6}
```
----------------------------

Comment connaître la taille d'un tableau ?

  - Rappel : le type d'un tableau d'entier est int[] : la taille n'est pas mentionnée. 

  - **.length** après le nom du tableau

```java  
  int N = tableau.length ; 
```
------------------------

Il est possible de créer des tableaux sur plusieurs dimensions. Il s'agit alors d'un tableau de tableau.

```java
    int[][] tab1 = {{1 , 2 , 3},{4 , 5 , 6}} ;
    int[][] tab2 = {{1,2,3}, {4,5}}; // On a toujours un tableau de int[]
```

    
La classe **String**
--------------------------------------------------------------------------------

La classe **String** permet de manipuler les chaînes de caractère.

```java
    String chaine = "Hello World"; // Déclaration et initialisation

    String chaineSurPlusieurLignes = 
    """
      "Hello" avec des guillemets !!!
      World
    """;

```

------------------

Deux opérations utiles...

  - **length**() : donne la longueur de la chaîne

    ```java
      String s1 = "Hello"
      int N = s1.length(); // Une syntaxe un peu étrange
    ```

  - Opérateur **+** : permet de concaténer deux chaînes

    ```java
    String s2 = " World";
    System.out.print(s1+s2); // Affiche Hello World
    ```




<!--
------------------

Les chaînes de caractères Java sont immuables :

  - Il n'existe aucun moyen de modifier le contenu d'une chaîne.

  - L'opération **chaine = \"Hello World bis\"** revient à placer une **nouvelle** chaîne de caractères dans la variable chaine.

  - Autre exemple : la méthode **concat** ne modifie pas la chaîne initiale. 

----------------

Exemples

    String s1 = " Hello " ;
    char c = s1.charAt(0) // C vaut 'H'

    String s2 = s1.concat("World"); // Hello World

    String s3 = s1 + " World " ;  // Hello World
  
    String s4 =  " World ".replace("Wor","Bo") ; // Bold

-->

Les instructions de base en Java
===========================

Déclaration / Affectation
-------------------------

  - Déclaration : fournir le nom du type et de la variable

    ```java
    int  i ;
    ```

  - Affectation : avec le signe **=** 

    ```java
    i = 1 ;
    ```

---------

  - Combinaison déclaration/affectation  :
    ```java
    int j = 2 ;
    ```

Opérations mathématiques 
--------------------------

  - Opérations mathématiques de base  **+ , - , * , /** (avec les priorités mathématiques habituelles)

  
  - Opérations d'incrémentation/décrémentation  **++/-\-**
```java
i ++ ; // Équivalent à i = i + 1 ;
i -- ; // Équivalent à i = i-1 ;
i += 3 ; // Équivalent à i = i + 3 ;
i *= 3 ; // Équivalent à i = i*3 ;
```  

----------------------

Reste de la division entière **\%**

```java
int i = 11 % 3 ; // i vaut 2
```
    

Tests et logique booléenne
-------------------------------

  - Test d'égalité **==** ou de non égalité **!=**
    ```java
    if (i==3){
      // Instructions si i vaut 3
    }else{
      // Instructions sinon
    }
    ```
  - Tests comparatifs **<=**, **<**, **>=** et **>**
    ```java
    if (i>=3) ...
    ```

---------------- 

  - Opération de négation **!**  \ \ \ \ \ \ \ \ \ \ \ \ \ \ \ \ \ \ \ \ \ \ \ \ \ \ \ \ \ \ \ \ \ \ \ \ \ \ \ \ \ \ \ \ \ 
    ```java
    boolean b = !true ; // b = false donc...
    boolean b2 = i!=3 ; 
    //b2 = true ou false en fonction du test
    ```

  - Le ET et OU logique : **&&** et **||**
    ```java
    boolean b = true && false ; // false !
    boolean b = true || false ; // true !
    ```

Opérateur ternaire " ? "
----------------------

Si la condition vaut **true**, alors on retourne val1, sinon on retourne val2.
```java
condition ? val1 : val2 ;
````

Exemple
```java
int note = 15 ;
char grade = (note >= 16) ? 'A':'B'; 
```


Exemple
------------------------

Écrire en **une instruction** une fonction qui prend en entrée une note entre 0 et 20 et qui renvoie la lettre associée (**char**) en fonction de la répartition suivante :

  - [20 , 16] : A  \ \ \ \ \ \ \ \    ]16 , 14] : B

  - ]14 , 11] : C  \ \ \ \ \ \ \ \   ]11, 8]   : D

  - ]8 , 5]   : E  \ \ \ \ \ \ \ \ \ \ \ \ \  ]5, 0]    : F

Exemple
------------------------

Écrire en **une instruction** une fonction qui prend en entrée une note entre 0 et 20 et qui renvoie la lettre associée (**char**) en fonction de la répartition suivante :

  - [20 , 15] : A  \ \ \ \ \ \ \ \    ]15 , 10] : B

  - ]10 , 5] : C  \ \ \ \ \ \ \ \   ]5, 0]   : D


```java
int n = 7 ; // La note en chiffre
char l = n>=15 ? 'A':n>=10 ? 'B':n>= 5 ? 'C':'D';
```



Le Contrôle de Flux en Java
========================

 
--------------------------------------

Il s'agit ici de définir l'ordre d'exécution des instructions. 

Par défaut, au sein d'une méthode, les instructions sont exécutées **les une après les autres**. 


Le mot-clé **return**
--------------------------

Le mot-clé **return** permet d'interrompre définitivement l'exécution d'une méthode et de retourner la valeur précisée après le mot clé.

```java
int renvoie1(){
  return 1;
}
```

Ce mot clé est obligatoire pour les fonctions qui retournent autre chose que *void*

Les instructions **if/else**
-------------------
```java
    instruct1 ;
    if (x == 4)
    {
      instruct2 ;
    }else
    {
      instruct3 ;
    }
    instruct4 ;
```
------------

  - Si $x=4$, on aura instruct1 $\longrightarrow$ instruct2$\longrightarrow$ instruct4
  
  - Si $x\neq 4$, on aura instruct1 $\longrightarrow$ instruct3 $\longrightarrow$ instruct4

------------

On peut également avoir **if** sans **else** 
```java
if(x==4){
  instruct1 ;
}
instruct2 ;
```
  - Si $x=4$, on aura instruct1 $\longrightarrow$ instruct2
  
  - Si $x\neq 4$, on aura instruct2

Les boucles **for**
-----------------
```java
for (initialisation ; conditionFin ; increment){
  instructions;
}
instructionsSuivante ;
```
  - Réaliser des opérations un nombre défini de fois
  
  - Parcourir un tableau / une liste

  - Une fois la condition de fin réalisée, **instructionsSuivante** est exécutée

-----------------

```java
for (int i=0 ; i < = 10 ; i++){
  System.out.print("On affiche le nombre ");
  System.out.println(i);
}
System.out.println("On a compté jusqu'à 10")
```
```java
for (int i=10 ; i > = 0 ; i--){
  System.out.print("On affiche le nombre ");
  System.out.println(i);
}
System.out.println("Fin du compte à rebours !")
```

------------------

**for** comme en Python (*foreach*)

```java
int[] tab = {2,3,1,2}
for (int e:tab){
  System.out.println(e);
}
```
Attention : le contenu de la boucle ne doit pas modifier le tableau


Les boucles **while**
--------------------
```java
while (expressionTest) {
  instructions;
}
instructionsSuivantes ;
```
-----------

  - Réaliser des opérations tant qu'une condition est réalisée
  
  - Si **expressionTest** vaut **false** lors de sa première évaluation, on passe à **instructionsSuivantes**

  - **while(true)** $\longrightarrow$ boucle infinie

  - Une fois que **expressionTest** est faux, **instructionsSuivantes** est exécutée


Les boucles **do while**
--------------------

```java
do{
  instructions;
}while (expressionTest);
instructionsSuivantes ; 
```

---------

  - Similaire à **while**
  
  - Mais garantit que le bloc **instructions** est exécuté **au moins une fois**. 

  - Une fois que **expressionTest** est faux, **instructionsSuivantes** est exécutée



Le mot clé **break**
--------------------

Permet de sortir d'un bloc d'instruction **for**, **while** ou **do while** prématurément
```java    
String chaine = "Hello World" ;
// Recherche de la présence du caractère 'W'
boolean wPresent = false ;
for (int i = 0 ; i< chaine.length() ; i++){
  if (chaine.charAt(i) == 'W'){
    wPresent = true ;
    break ; // Il n'est plus utile de continuer le for
  }
}
```

Le mot clé **continue**
-----------------------------

Permet de "**sauter**" l'itération courante d'un bloc d'instruction **for**, **while** ou **do while**.
```java
    String chaine = "Hello world" ;
    // Comptage du nombre de 'l'
    int nb = 0 ;
    for (int i = 0 ; i< chaine.length() ; i++){
        if (chaine.charAt(i)!='l')
          continue ; // On passe à i+1
        // On traite le caractère 
        nb++;  
    }
```

L'instruction **switch**
--------------------
Permet de placer le contrôle de flux à un endroit spécifique en fonction de la valeur d'une variable parmi un ensemble donné : 
```java
switch(variable){
  case valeur1 : instr1 ; instr2 ; //...
  case valeur2 : instr3 ; instr4 ; //...
  case valeur3 : instr5 ; instr6 ; //...
}
```
-------

Dès qu'une des conditions est vérifiée, le code exécute **toutes les instructions suivantes**

Si variable = valeur2 alors instr3 $\longrightarrow$ instr4 $\longrightarrow$ instr5 $\longrightarrow$ instr6

----------------

Penser à l'instruction  **break** et à l'instruction **default** 
```java
switch(variable){
  case valeur1 : instr1 ; instr2 ; break 
  case valeur2 : instr3 ; instr4 ; break 
  case valeur3 : instr5 ; instr6 ; break 
  ...
  default: instrDefault;
}
```

<!---
Exercice
-------------
   Créer une classe TestSwitch implémentant cette la fonction suivante :

  - prototype : *String* **getDay**(*int* i) 

  - Retourne la chaîne de caractères associées au i<sup>ème</sup> jour de la semaine
  
  - Robuste à un utilisateur malicieux


---------------------------

  Cette version ne compilera pas (dayString potentiellement non initialisée) et est sémantiquement incorrecte (manque **break**)

    public String getDayBAD(int dayNumber){
      String dayString ;
      switch(dayNumber){
        case 1 : dayString = "Monday" ;
        case 2 : dayString = "Tuesday";
        case 3 : dayString = "Wednesday";
        case 4 : dayString = "Thursday";
        case 5 : dayString = "Friday";
        case 6 : dayString = "Saturday";
        case 7 : dayString = "Sunday";
      }
      return dayString ;
    }

------------------------

    public String getDay(int dayNumber){
       String dayString ; 
       // Plus besoin d'initialiser grâce au default.
       switch(dayNumber){
        case 1 : dayString = "Monday" ; break ;
        case 2 : dayString = "Tuesday"; break ;
        case 3 : dayString = "Wednesday"; break ;
        case 4 : dayString = "Thursday"; break ;
        case 5 : dayString = "Friday"; break ;
        case 6 : dayString = "Saturday"; break ;
        case 7 : dayString = "Sunday"; break ;
        default: dayString = "I am Groot";
      }
      return dayString ;
    }

  - Penser aux **break** et **default** 

  - Ne fonctionne qu'avec les **int** (et dérivés) et les **String**. Les valeurs testées doivent être constantes

--->

Les exceptions
==================

But
------------

  - Lors de la compilation, le compilateur vérifie surtout le respects de **contrats** (signature des fonctions).
    - ex. : on passe les bons types en arguments

  - Il ne vérifie pas la cohérence des valeurs

  - Le but des exceptions est de "signaler" les problèmes

  - Représente un cas particulier de contrôle de flux.


Exemple 
--------------

```java
public class Main {
  public static void main(String[] args) {
      System.out.println(1/0);
  }
}
```
Résultat dans le terminal :

    Exception in thread "main" java.lang.ArithmeticException: / by zero at Main.main(Main.java:3)

Que se passe-t-il ?
--------------

  - Je réalise une division par zéro avec des entiers

  - Il s'agit d'une erreur arithmétique détectée par la fonction qui encode la division des entiers

  - Cette fonction **lève une exception** et la transmet à la méthode appelante (ici **main**)

  - **main** reçoit cette exception. Par défaut, l'exécution de **main** s'arrête et le texte descriptif de l'exception s'affiche dans la console

Principe exceptions ?
---------------

  - C'est une mesure de protection pour éviter des comportements non prévus

  - Lorsqu'une exception est levée, la méthode appelante la reçoit. Si elle n'est pas traitée, l'exécution de la méthode est interrompue et l'exception remontre à la méthode appelante

  - Si l'exception n'est toujours pas traitée par la méthode principale (**main**), alors le programme s'arrête et le contenu de la pile d'exécution est affichée (on voit toutes les fonctions appelées)

Comment traiter les exceptions ?
-------------------

Il faut essayer !
```java
public class Main {
  public static void main(String[] args) {
      try{
        System.out.println(1/0);
      }catch(Exception e){
        System.out.println("Ce n'est pas très bien !");
      }
  }
}
```
----------------

```java
catch(Exception e)
```

  - **J'attrappe** l'exception **e** (de type **Exception**)
  
  - Je peux alors réaliser un traitement spécifique adapté à la situation

<!--
  - **Exception** est une classe Java. **e** est donc un objet avec des méthodes et attributs 
-->

-----------------

Attraper une exception spécifique 

```java
public class Main {
  public static void main(String[] args) {
    try{
      System.out.println(1/0);
    }catch(ArithmeticException e){
      System.out.println("Ce n'est pas très bien !");
    }
  }
}
```

---------------

Traiter plusieurs exceptions

```java
public class Main {
  public static void main(String[] args) {
    try{
      System.out.println(1/0);
    }catch(ArithmeticException e){
      System.out.println("C'est une exception arithm!");
    }catch(Exception e){
      System.out.println("C'est une autre exception !");
    }
  }
}
```


Le mot-clé "throws"
--------------------

  - Par défaut, les exceptions sont vérifiées par le compilateur

  - Si votre méthode est susceptible de ne pas traiter un type d'exception et de le renvoyer, il faut en principe le déclarer dans la signature.
```java
public static void main(String[] args) throws ArithmeticException {
  System.out.println(1/0);
}
```
        
------------------

  - Certaines exception étant très communes, les déclarer via **throws** est superflu. C'est le cas de *ArithmeticException*

  - Pour d'autres exceptions (ex. *IOException*), il faut les déclarer via **throws** sous peine d'erreur de compilation.

  - [Liste des exceptions par défaut ](https://programming.guide/java/list-of-java-exceptions.html)

Lever une exception
----------------

Utiliser le mot clé **throw** 

```java
public void printAge(int i){
  if (i<0){
    throw(new IllegalArgumentException("Age >0 !"))
  }else{
    System.out.println("Vous avez "+i+" ans !");
  }
} 
```
<!--
Créer une exception personnalisée
-------------------

  - Exemple : type **SaisieErroneeException**

  - Dans le fichier **SaisieErroneeException.java**

        public class SaisieErroneeException extends Exception {

          public SaisieErroneeException() {
            super();
          }
        
          public SaisieErroneeException(String s) { 
            super(s);
          }
        }

-------------------

    public void printAge(int i) throws SaisieErroneeException{
      if (i<0){
        throw(new SaisieErroneeException("Age >0 !"))
      }else{
        System.out.println("Vous avez "+i+" ans !");
      }
    } 

-->

La structure d'une application Java
=====================================
    

La fonction Main
---------------------------

Il est possible "d'exécuter" un fichier *.java* si et seulement si celui-ci contient une fonction **main** dont la signature est la suivante :

```java
public static void main(String[] args) ;
```

<!---
Retour sur le tutoriel BlueJ (slide précédente)
-------------------

  - Deux fichiers sources .java

  - Les versions compilées sont les .class

  - *Cat.java* décrit le fonctionnement de la classe **Cat**

  - Comment faire pour **créer un programme exécutable** ?
---->


<!--
-------------------------

  - **public ** : la méthode est publique (peut être appelée depuis une autre classe)

  - **static** : la méthode est statique. C'est une méthode de classe qui ne nécessite pas d'instance de l'objet.

  - **void** : la méthode ne retourne rien. 

  - **String[] args** : l'argument de main est un tableau de String.

-->

-------------------------

  - **public static** : nécessaire pour les fonctions 

  - **void** : la fonction ne retourne rien. 

  - **String[] args** : l'argument de main est un tableau de String.



Pourquoi String[] args?
---------------------------

  - Identification des arguments lors d'une commande textuelle dans un terminal
 
        $ ls -l *.java     (unix)
        $ dir *.java       (windows)

Liste tous les fichiers avec l'extension java et les présente sous forme de liste

Récupérer les arguments 
-------------------------

    $ ls -l *.java
    
 - Exemple avec la ligne de commande unix  
   
   - **ls** : nom de la commande 
   
   - **-l** : premier argument
   
   - ***.java** : deuxième argument

  - Du point de vue de Main : 
  
    - args[0] = \"-l\"  
  
    - args[1] = "*.java"

<!--
Règle d'usage pour Main
--------------------------

En général, il est préférable de définir une classe particulière qui contient le Main. Il est rarement approprié de définir cette fonction dans une classe normale. 
-->

Pour exécuter
------------------------

Se mettre dans le répertoire contenant le fichier .class (ex. MainClass.class) issu de la compilation à l'aide de la commande **cd**.

    $ java MainClass argument1 argument2....

<!---
Une classe MainClass pour les chats
-------------------------
 
   - Arguments autorisés : listen, happy?, feed, adopt_another

   - Être robuste à un utilisateur maladroit... 

   - Ajouter une méthode publique **getName()** à **Cat** pour que Main puisse accéder au nom du chat


<i class="fas fa-terminal"></i>
-------------------------


      $ java MainClass
      You adopt a tabby cat named Bob
      
      $ java MainClass happy? listen feed listen adopt_another happy? mauvaisArgument feed happy?
      You adopt a white cat named Cole
      Cole is not happy
      Cole meows at you.
      Cole purrs.
      You abandon Cole
      You adopt a white cat named Marmalade
      Marmalade is not happy 
      My name is Groot!
      Marmalade is happy 

 *Note : opérateur new pour initialiser un objet (cf tuto)*
----->

<!--
<link href="https://fonts.googleapis.com/css?family=Inconsolata:400,700" rel="stylesheet"> 
-->

<link rel="preconnect" href="https://fonts.gstatic.com">
<link href="https://fonts.googleapis.com/css2?family=Fira+Code:wght@300;400;500;600;700&display=swap" rel="stylesheet"> 


<style>

.reveal section img {
  border:0;
  height:50vh;
  width:auto;

}

.reveal section img.medium {
  border:0;
  max-width:50vh;
}

.reveal section img.icon {
  display:inline;
  border:0;
  width:1em;
  margin:0em;
  box-shadow:none;
  vertical-align:-10%;
}

.reveal code {
  font-family: Inconsolata, monospace;
}

.reveal pre {
}

.reveal pre code {
  font-size: 1.25em;
  line-height: 1.5em;
  /* max-height: 80wh; won't work, overriden */
}

input {
  font-family: "Source Sans Pro", Helvetica, sans-serif;
  font-size: 42px;
  line-height: 54.6px;
}

</style>



<!--
<link href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.css" rel="stylesheet">
 -->
<link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.8.2/css/all.css" integrity="sha384-oS3vJWv+0UjzBfQzYUhtDYW+Pj2yciDJxpsK1OYPAYjqT085Qq/1cq5FLXAZQ7Ay" crossorigin="anonymous">
