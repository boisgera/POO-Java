
Instructions
--------------------------------------------------------------------------------

Pour compiler, exécuter et tester le programme de cet exercice, 
exécutez dans le terminal la commande :

    $ ./run


Exercice
--------------------------------------------------------------------------------

On travaille toiujours sur la fonction `showSequence` de la classe `FizzBuzz` dont le but est d'afficher la séquence des N premières valeurs de la séquence de **FizzBuzz** (voir les règles [ici](https://en.wikipedia.org/wiki/Fizz_buzz)).

On voudrait cette fois-ci que la fonction `showSequence` indique une anomalie si elle reçoit un argument négatif ou nul. Il va falloir pour cela renvoyer une **exception**.

Pouvez-vous modifier le fichier `FizzBuzz.java` (et éventuellement `Main.java` si cela est nécessaire) de sorte à retourner une exception de votre choix ([existante](https://programming.guide/java/list-of-java-exceptions.html) ou que vous aurez créé) lorsque l'argument n'est pas strictement positif ?


Solution 2
--------------------------------------------------------------------------------

Voir fichiers `FizzBuzz.java`, `SaisieErroneeeExceptin.java` et `Main.java`

Dans cette seconde solution, on a créé une exception personnalisée dans le fichier `SaisieErroneeException.java`. 

Cette exception ayant besoin d'être traité, il est nécessaire d'ajouter ```throws SaisieErroneeException``` dans la signature de la fonction pour indiquer qu'elle peut **lever** cette exception.

La fonction `main` est soumise au même problème. La fonction `showSequence` pouvant lever une exception, il faut la traiter. Ici, on choisit de la laisser " remonter " en indiquant ```throws SaisieErroneeException```. Le résultat sera alors un affichage du texte de l'exception dans le terminal (`main` étant la première fonction de la pile). On pourra alors voir la propagation de l'exception dans la pile d'appels.
