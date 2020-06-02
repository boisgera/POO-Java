
Instructions
--------------------------------------------------------------------------------

Pour compiler, exécuter et tester le programme de cet exercice, 
exécutez dans le terminal la commande :

    $ ./run


Exercice
--------------------------------------------------------------------------------

Dans le fichier `Main.java` qui contient le programme principal, on fait appel à la fonction `max` de la classe `TestArray` dont le but est de donner la valeur maximale d'un tableau de `double`.

On vous demande cette fois-ci d'ajouter le fichier manquant sur la base des premiers exercices vus précédemment. 

Note : si le tableau est de longueur nulle, on renverra "-l'infini". Il s'agit d'une valeur représentable, tout comme l'est "+l'infini". Ces valeurs respectent une arithmétique particulière (ex. inf + inf = inf ; inf + 3 = inf ; inf - inf = "not a number" ; inf*0 = "not a number).

Pour affecter une variable `x` de type `double` à "-l'infini", on écrit :
```java
x = Double.NEGATIVE_INFINITY ;
```

Solution
--------------------------------------------------------------------------------
Voir le fichier `TestArray.java` ajouté. On se sert de l'attribut `length` qui permet d'obtenir la longueur du tableau. On initialise la valeur de sortie `M` à `Double.NEGATIVE_INFINITY` puis on parcourt tout le tableau à l'aide d'une boucle `for` en mettant à jour `M` lorsque c'est nécessaire. 

Si le tableau n'a pas d'éléments, sa longueur est nulle et les instructions de la boucle `for` ne sont alors jamais exécutées. La valeur de sortie vaut alors `Double.NEGATIVE_INFINITY`.