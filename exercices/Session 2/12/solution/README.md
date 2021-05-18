
Instructions
--------------------------------------------------------------------------------

Pour compiler, exécuter et tester le programme de cet exercice, 
exécutez dans le terminal la commande :

    $ ./run


Exercice
--------------------------------------------------------------------------------

On a créé deux variables dans `library/TestFraction.java` qui devrait valoir la même chose. Cependant, le test ne passe pas.

Pouvez-vous modifier le fichier `library/TestFraction.java` pour que le résultat attendu soit correct ?

Solution
--------------------------------------------------------------------------------

Vous avez ici un dernier exemple d'erreur typique qu'on peut commettre en utilisant les expressions littérales. `3/2` est interprété ici comme l'entier 3 divisé par l'entier 2. Le résultat de `3/2` est donc l'entier 1. 

La ligne 
```java
    public static double f2 = 3/2 ;
````
est donc équivalente à 
```java
    public static double f2 = 1 ;
```
Ainsi, `f2` va donc valoir `1.0` (en `double` car `f2` est un `double`).

Pour corriger ce problème, il faut faire en sorte qu'il y ait au moins un `double` dans l'expression :
```java
    public static double f2 = 3/2. ;
````
