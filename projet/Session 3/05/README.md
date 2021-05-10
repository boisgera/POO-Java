
Exercice - Encapsulation
--------------------------------------------------------------------------------

La class `Point` qui est fournie dans cet exercice possèdes des champs `x`
et `y` qui sont publics et donc modifiables sans restriction à tout moment.
Or, nous souhaitons utiliser `Point` comme un objet immuable, dont le
contenu ne doit pas changer après son initialisation (instanciation).

Pouvez-vous modifier la classe `Point` pour aller dans ce sens en vous
assurant que seules les méthodes de la classe `Point` ont accès aux champs
`x` et `y` ?

Pour permettre tout de même de lire les coordonées d'un point sans restriction,
rajouter à la classe des méthodes de lecture des champs :
`public int getX()` et `public int getY()`

**Bonus:** `System.out.println` ne fait pas un très bon travail quand il essaie
d'afficher un point, mais nous ne l'avons pas aidé, car nous n'avons pas
implémenté de méthode de représentation des points sous forme de chaîne
de caractère.
Implémentez une méthode `public String toString()` dans
la classe `Point` qui renvoie une chaîne de caractère du type `"Point(1.0, 2.0)`
et vérifiez que `System.out.println` affiche alors cette représentation
compréhensible des points.

