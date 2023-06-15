
Instructions
--------------------------------------------------------------------------------

Pour compiler, exécuter et tester le programme de cet exercice, 
exécutez dans le terminal la commande :

    $ ./run


Exercice
--------------------------------------------------------------------------------

L'exécution du programme `Main` produit pour le moment l'affichage d'un message 
incorrect:

`Hello wirld!`.

Le test associé vous informe de cet erreur.

Pouvez-vous modifier le fichier `library/Message.java` pour que le message 
correct, `Hello world!` s'affiche ?
    

Solution
--------------------------------------------------------------------------------

Modifier la ligne
```java
    public static String content = "Hello wirld!";
```
du fichier `library/Message.java` et la remplacer par
```java
    public static String content = "Hello world!";
```    