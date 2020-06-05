
Instructions
--------------------------------------------------------------------------------

Pour compiler, exécuter et tester le programme de cet exercice, 
exécutez dans le terminal la commande :

    $ ./run


Exercice
--------------------------------------------------------------------------------

On a ajouté une nouvelle constante de `ConvertByte`. Celle-ci devrait être égale au nombre d'octets dans un To. Mais il semble y avoir un problème.

Pouvez-vous modifier le fichier `library/ConvertByte.java` pour que le résultat attendu soit correct ?

Solution
--------------------------------------------------------------------------------

Le problème est dans cette ligne :
```java
  public static long  teraByte2 = 1_000_000*1_000_000;
```
Bien que `teraByte2` soit déclaré `long`, les littéraux `1_000_000` sont par défaut des `int` simples. Ainsi, leur multiplication donnera un résultat `int`, qui sera converti ensuite en `double`. Le problème est que  `1_000_000*1_000_000` dépasse la capacité des entiers simples, ce qui provoque un débordement. Ainsi, `2_147_483_647+1` donnera `-2_147_483_648` dans l'arithmétique des entiers. 

Si une expression (littérale ou non) fait apparaître des entiers et des longs, les calculs seront fait en convertissant tous les entiers en long. Ainsi, il suffit ici de modifier la ligne incriminée par :
```java
  public static long  teraByte2 = 1_000_000L*1_000_000;
```
    