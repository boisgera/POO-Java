
Instructions
--------------------------------------------------------------------------------

Pour compiler, exécuter et tester le programme de cet exercice, 
exécutez dans le terminal la commande :

    $ ./run


Exercice
--------------------------------------------------------------------------------

Dans le fichier `Main.java` qui contient le programme principal, on fait appel à la fonction `printSquareRoot` de la classe `SquareRoot` dont le but est d'afficher dans le terminal la racine carrée du nombre donné en argument.

Pouvez-vous compléter le fichier `SquareRoot.java` avec la fonction `printSquareRoot` de sorte à ce qu'on ait le comportement voulu ? 

Quelques indices :
  - Ici, vous aurez à définit entièrement une fonction, de son prototype au corps de la fonction. À vous de bien identifier les types d'entrées et de sortie.

  - Pour que la fonction soit "appelable", il faut ajouter les mots clés ```public static``` devant le prototype de la fonction. On verra plus tard leur signification.

  - Pour la racine carrée, vous pouvez jeter un oeil au package `Math`.


Solution
--------------------------------------------------------------------------------

  La fonction proposée est la suivante :
```java
public static void printSquareRoot(double x){
    System.out.println(Math.sqrt(x));
}
```
Ici, la fonction ne renvoie "rien" : le type de retour est donc `void`. En Java, il est obligatoire de la préciser. La fonction prend un `double` en entrée. On utilise `System.out.prinln` pour écrire quelque chose dans le terminal. Enfin, la racine carrée s'obtient avec `Math.sqrt`.