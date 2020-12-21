
Instructions
--------------------------------------------------------------------------------

Pour compiler, exécuter et tester le programme de cet exercice, 
exécutez dans le terminal la commande :

    $ ./run


Exercice
--------------------------------------------------------------------------------

Dans le fichier `Main.java` qui contient le programme principal, on fait appel à la fonction `replaceName` de la classe `TestString` dont le but est de substituer les sous-chaînes **NOM** et **PRENOM** dans une chaîne d'entrée afin de personnaliser un message.

Pouvez-vous compléter le fichier `TestString.java` avec la fonction `replaceName` de sorte à ce qu'on ait le comportement voulu ? On pourra s'intéresser à la documentation de la classe `String`. Il y a certainement une méthode qui pourrait nous aider.


Solution
--------------------------------------------------------------------------------

Voir fichier de correction.

Ici, la méthode qui nous intéresse est `replace`. Mais attention, un `String` est un objet immuable. Ainsi, utiliser `replace` renvoie une nouvelle chaîne de caractères ! C'est toutefois intéressant ici car cela nous permet d'appliquer une nouvelle fois `replace` directement sur l'objet retourné. Ainsi, les deux substitutions peuvent êtres réalisées en une seule et unique instruction.