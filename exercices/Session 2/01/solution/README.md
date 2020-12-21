
Instructions
--------------------------------------------------------------------------------

Pour compiler, exécuter et tester le programme de cet exercice, 
exécutez dans le terminal la commande :

    $ ./run


Exercice
--------------------------------------------------------------------------------

On a créé une fonction `testEquality(a,b)` dans `library/TestInteger.java` qui teste si deux entiers (de classe `Integer`) ont la même valeur. Il see trouve que le résultat renvoyé n'est pas toujours ce qui est attendu. 

Pouvez-vous trouver une façon de modifier `testEquality` qui permette de passer tous les tests ? Indice : on pourra chercher dans la liste des méthodes de la classe `Integer`.

Solution
--------------------------------------------------------------------------------
Le test `==` teste si deux **objets** sont identiques. Or, :
  - ```Integer a = new Integer(3) ;```
  - ```Integer b = 3 ;```
créent deux objets différents. À chaque fois qu'on utilise l'opérateur `new`, on crée un objet différent. En revanche, si on avait défini ```Integer b2 = 3```, le test ```b==b2``` serait passé car la construction avec un entier littéral renvoie le même objet (si on utilise le même entier).

Pour vérifier que les **valeurs** sont effectivement égales, on peut faire appel à la méthode `equals` de la classe `Integer`. On verra d'ailleurs par la suite que cette méthode est une méthode " spéciale " puisqu'elle est disponible pour tous les objets !

Note : Une autre façon aurait été de faire appel à la méthode `intValue()` de la classe `Integer` qui renvoie un `int` primitif et de réaliser le test avec `==`. Cette solution est proposée en commentaire.