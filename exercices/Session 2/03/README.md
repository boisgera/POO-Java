
Instructions
--------------------------------------------------------------------------------

Pour compiler, exécuter et tester le programme de cet exercice, 
exécutez dans le terminal la commande :

    $ ./run


Exercice
--------------------------------------------------------------------------------

Dans le fichier `Main.java` qui contient le programme principal, on fait appel à la fonction `gradeToletter` de la classe `Grade` dont le but est de convertir en lettre une note entre 0 et 20 selon le code suivant :

  - [20,16] : A
  - ]16,14] : B
  - ]14,11] : C
  - ]11,8]  : D
  - ]8,5]   : E 
  - ]5,0]   : F

Pouvez-vous compléter le fichier `Grade.java` avec la fonction `gradeToLetter` de sorte à ce qu'on ait le comportement voulu ? 

Quelques conseils :
  - On ne s'intéresse pas au cas où la note en entrée est impromptue. Si le code retourne A pour une note plus grande que 20 et F pour une note en entrée inférieure à zéro, on s'en satisfera.
  - Ne pas oublier les mots clés "magiques" `public static` avant la signature de la fonction.
  - On ne vous donne pas le type de retour de la fonction dans l'énoncé... Mais quelques indices sont présents dans le fichier `Main.java` lors de l'utilisation de la fonction...

**Challenge :** il existe une solution qui permet de coder le fonction en une seule ligne de code ! Arriverez-vous à la trouver ?
