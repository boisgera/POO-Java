
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

Solution 3
--------------------------------------------------------------------------------

Voir fichiers `FizzBuzz.java`, `SaisieErroneeeExceptin.java` et `Main.java`

Dans cette seconde solution, on a créé une exception personnalisée dans le fichier `SaisieErroneeException.java`. 

Cette exception ayant besoin d'être traité, il est nécessaire d'ajouter ```throws SaisieErroneeException``` dans la signature de la fonction pour indiquer qu'elle peut **lever** cette exception.

La fonction `main` est soumise au même problème. La fonction `showSequence` pouvant lever une exception, il faut la traiter. Ici, contrairement à la solution 2, on choisit de la traiter dans un bloc `try catch`, de sorte à gérer manuellement ce problème.