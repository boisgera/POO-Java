
Exercice
--------------------------------------------------------------------------------

Le code de `Main` qui exploite la classe `Point` affiche un résultat surprenant :
par défaut, deux points dont les coordonnées sont égales ne sont pas nécessairement
égaux (ce que nous souhaiterions).

Expliquez ce comportement (chercher sur le Web les informations nécessaires) ;
puis, modifiez la classe `Point` pour corriger ce phénomène.

**Bonus:** regardez la documentation des méthodes `equals` et `hashCode` de
Object et faites en sorte que la nouvelle fonctionnalité de `Point` soit
plus conforme à ce qu'on attend d'un `Object`.

Solution
--------------------------------------------------------------------------------

Le phénomène s'explique parce que la méthode `equals` qui est invoquée est
celle héritée de la classe `Object` dont `Point` dérive implicitement.
[La documentation Java de `Object`](https://docs.oracle.com/javase/8/docs/api/java/lang/Object.html#equals-java.lang.Object-) nous informe que c'est l'identité des deux objets qui est comparée.
Or ici `point1` et `point2` contiennent les mêmes informations, mais à des
emplacements différents en mémoire, ils sont distincts (`point1 != point2`).

On peut corriger la situation en surchargeant la méthode `equals` d"`Object`
dans `Point`, cf le fichier `Point.java` joint.

**Bonus.** Cette modification est problématique dans la mesure où nous pouvons
désormais avoir des points égaux mais dont le hash code est différent ; si nous
voulons parer au plus pressés, pour restaurer cet invariant, nous pouvons faire
en sorte que les hash codes de tous les points renvoient la même valeur, par
exemple 0. Une solution moins rudimentaire est proposée dans le fichier
`Point.java`.