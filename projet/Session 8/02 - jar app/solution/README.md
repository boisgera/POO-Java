
Exercice
--------------------------------------------------------------------------------

  1. Modifiez le script `run` afin de packager l'application `App` 
    en un fichier `app.jar` qui puisse être distribué aux clients,
    
  2. Modifiez le script `run` pour exécuter l'application contenue
     dans cette archive.

Solution
--------------------------------------------------------------------------------

Créez le manifeste associé au programme :

    echo "Main-Class: App" > Manifest.txt

puis archivez-le avec les fichiers `.class` du projet dans `app.jar` :

    jar cfm app.jar Manifest.txt *.class

Pour exécuter l'application contenue dans l'archive :

    java -jar app.jar