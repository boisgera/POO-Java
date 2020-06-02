
Exercice - equals
--------------------------------------------------------------------------------

On vous donne le fichier `Point.java`. On voudrait créer une classe fille `Disque` qui aurait pour attribut supplémentaire privé `r` (le rayon) ainsi qu'une méthode `getR()` retournant le rayon. `Disque` a deux constructeurs, le premier ne prend que `x`et `y` et met `r` à zéro. Le second prend les 3 valeurs `x`, `y` et `r` et affecte les variables dans `Disque`. 

Pouvez-vous écrire le fichier `Disque.java` ? 

Il faudrait également ajouter les méthodes `equals` et `hashcode()`pour fair en sorte que l'on puisse tester que deux objets sont égaux ?

Note : il se peut qu'un des tests de la fonction `main` vous surprendra certainement (`System.out.println(point1.equals(disque1))`). Si c'est le cas, on vous autorise à modifier le code de `Point.java` ponctuellement dans la fonction `equals`. 