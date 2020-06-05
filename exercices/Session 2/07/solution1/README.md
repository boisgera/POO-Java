
Instructions
--------------------------------------------------------------------------------

Pour compiler, exécuter et tester le programme de cet exercice, 
exécutez dans le terminal la commande :

    $ ./run


Exercice
--------------------------------------------------------------------------------

Dans le fichier `Main.java` qui contient le programme principal, on fait appel à la fonction `showSequence` de la classe `FizzBuzz` dont le but est d'afficher la séquence des N premières valeurs de la séquence de **FizzBuzz** (voir les règles [ici](https://en.wikipedia.org/wiki/Fizz_buzz)).

Ainsi, l'exécution de `FizzBuzz.showSequence(20);` doit faire apparaître la chaîne suivant dans le terminal (suivi d'un retour à la ligne) : 
1, 2, Fizz, 4, Buzz, Fizz, 7, 8, Fizz, Buzz, 11, Fizz, 13, 14, Fizz, 16, 17, Fizz, 19, Buzz

Si une valeur négative est fournie en paramètre, rien ne doit s'afficher.

On vous demande d'ajouter le fichier manquant sur la base des exercices vus précédemment. 

Solution 1
--------------------------------------------------------------------------------
Voir fichier `FizzBuzz.java`. Dans cette solution, on affiche les résultats au fur et à mesure. On utilise `System.out.print` pour afficher sans retour à la ligne. On vérifie à chaque fois si on est en train de traiter le dernier élément ou non, pour savoir si on a joute la virgule ou si on termine par l'instruction `System.out.println` qui permet de passer à la ligne. 

Les tests sont réalisés grâce à l'opérateur `%` qui sert pour les modulos.