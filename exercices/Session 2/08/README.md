
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