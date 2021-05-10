
Exercice
--------------------------------------------------------------------------------

 1. Créer une archive `printer.jar` pour les sources de la bibliothèque
    du répertoire `printer-src` (package `printer`) puis la copier dans
    le répertoire racine.

 2. Compilez l'application `App` en utilisant cette bibliothèque.

 3. Exécutez l'application.


Solution
--------------------------------------------------------------------------------

On peut générer l'archive `printer.jar` par les commandes suivantes :

    cd printer-src 
    javac printer/Printer.java
    jar cf printer.jar printer
    cp printer.jar .. 
    cd -

La compilation de `App.java` se fait de façon habituelle, à ceci près que
l'on doit indiquer au compilateur d'utiliser les ressources présentes dans
le fichier `printer.jar` en plus des fichiers `*.class` du répertoire courant :

    javac -cp .:printer.jar App.java

L'exécution de l'application doit suivre la même modification :

    java -cp .:printer.jar App
