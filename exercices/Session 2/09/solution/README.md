
Instructions
--------------------------------------------------------------------------------

Pour compiler, exécuter et tester le programme de cet exercice, 
exécutez dans le terminal la commande :

    $ ./run


Exercice
--------------------------------------------------------------------------------

La compilation du programme `Main` provoque une erreur. Celui-ci devrait normalement afficher le nombre d'octets dans respectivement 1Mo, 1Go et 1To.  


Pouvez-vous modifier le fichier `library/ConvertByte.java` pour que le résultat attendu soit correct ?

Solution
--------------------------------------------------------------------------------

Il y a ici deux erreurs :
  1 - L'entier littéral `1_000_000_000_000` est trop gros et ne peut pas être interprété. Il faut ajouter le suffique `L`

  2 - Une fois ce problème corrigé, le compilateur indique une erreur du fait qu'on essaye de rentrer un nombre littéral trop grand dans une variable de typr `int`. Il faut donc la déclarer en `double`.

Au final : 

Modifier la ligne
```java
    public static int teraByte = 1_000_000_000_000;
```
du fichier `library/ByteConverter.java` et la remplacer par
```java
    public static long teraByte = 1_000_000_000_000L;
```    
