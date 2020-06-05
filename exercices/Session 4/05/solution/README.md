
Exercice - equals
--------------------------------------------------------------------------------

On vous donne le fichier `Point.java`. On voudrait créer une classe fille `Disque` qui aurait pour attribut supplémentaire privé `r` (le rayon) ainsi qu'une méthode `getR()` retournant le rayon. `Disque` a deux constructeurs, le premier ne prend que `x`et `y` et met `r` à zéro. Le second prend les 3 valeurs `x`, `y` et `r` et affecte les variables dans `Disque`. 

Pouvez-vous écrire le fichier `Disque.java` ? 

Il faudrait également ajouter les méthodes `equals` et `hashcode()`pour fair en sorte que l'on puisse tester que deux objets sont égaux ?

Note : il se peut qu'un des tests de la fonction `main` vous surprendra certainement (`System.out.println(point1.equals(disque1))`). Si c'est le cas, on vous autorise à modifier le code de `Point.java` ponctuellement dans la fonction `equals`. 

Solution
-----------------

Voir `Disque.java` et `Point.java`. Sans modifier `Point.java`, les tests `point1.equals(disque1)` et `disque1.equals(point1)` donnent des résultats différents. On perd la reflexivité de `equals`.

Cela est dû au fait que du point de vue de la classe `Point`, `point1` et `disque1` sont égaux (même valeurs de `x` et `y` et `disque1` est bien une instance de `Point`). Pour résoudre ce problème, on utilise `getClass` à la place d'`instanceof`. Dans `Point`, on remplace  

```java  
if (!(object instanceof Point))
```

par

```java
if(object.getClass() != this.getClass())
```

De façon générale, si une classe a des classes filles qui ajoutent des paramètres, il est préférable d'utiliser `getClass`. Si la classe mère utilise la statégie `instanceof`, la méthode `equals` ne devrait pas être redéfinie dans la classe fille (`equals` déclarée `final` dans la classe mère). Les nouvelles propriétés ne seraient alors plus discriminantes dans le test d'égalité avec la classe fille.  Plus de détails [ici](https://jmdoudoux.developpez.com/cours/developpons/java/chap-techniques_java.php) (paragraphe 97.2.6.2).