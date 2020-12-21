
Exercice - Encapsulation
--------------------------------------------------------------------------------

La class `Color` ci-joint qui répond au problème précédent est malheureusement 
susceptible d'être facilement "hackée" : ses instances peuvent être mises 
dans des états invalides, avec des des composantes RGB qui ne sont pas des 
entiers compris entre 0 et 255. La fonction `main` de la class `Main` présente 
deux exemples de tels usages dangereux (impropres ?) de la classe.

Pouvez-vous sécuriser la classe `Color` pour que les erreurs éventuelles
se manifestent dès qu'elles sont faites et non tardivement,
lorsque l'on appelle la méthode `toString` ? 
Les autres fonctionnalités de `Color` doivent rester inchangées.
