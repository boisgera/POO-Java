SVG en Java impératif
================================================================================

L'objectif de cette étape du projet est de construire une première version des 
outils pour produire des fichiers graphiques SVG similaires à celui des 
[Premier pas](https://developer.mozilla.org/fr/docs/Web/SVG/Tutorial/Getting_Started) 
du [tutoriel SVG de Mozilla](https://developer.mozilla.org/fr/docs/Web/SVG/Tutorial).

![SVG](images/demo1.svg)

L'emphase sera mise sur les constructions impératives (procédurales) du langage
Java.


Hello SVG!
--------------------------------------------------------------------------------

Créez un fichier `SVGTutorial.java` important les fonctions de `utils.Utils`,
puis faites en sorte qu'une fois ce fichier compilé, l'exécution de 
l'application `SVGTutorial` affiche le message `Hello SVG World!`.

Puis, remplacez ce premier message par 

    <svg version="1.1" baseProfile="full" width="300" height="200" xmlns="http://www.w3.org/2000/svg">
        <rect width="100%" height="100%" fill="red"></rect>
        <circle cx="150" cy="100" r="80" fill="green"></circle>
        <text x="150" y="125" font-size="60" text-anchor="middle" fill="white">SVG</text>
    </svg>

Enfin, faites en sorte que ce contenu soit écrit dans le fichier `demo1.svg`.
Ouvrez ensuite ce fichier avec votre navigateur Web pour vérifier que ce
fichier décrit l'image vectorielle souhaitée.

Primitives graphiques
--------------------------------------------------------------------------------

Créez une fonction `rect` permettant de décrire les rectangles. On souhaite
que cette fonction prenne en arguments les tableaux bi-dimensionnels de chaînes
de caractères caractérisant les attributs du rectangle, de telle sorte que si
la variable `rectAttributes` désigne le tableau
```java
String[][] rectAttributes = {
    {"width", "100%"}, 
    {"height", "100%"}, 
    {"fill", "red"}
};
```
alors après l'exécution du code
```java
String rect = rect(rectAttributes);
```
la variable `rect` est une chaîne de caractère qui désigne le fragment SVG
```svg
<rect width="100%" height="100%" fill="red"></rect>
```
Pour simplifier la vie de l'utilisateur de votre fonction, faites ensuite en 
que le code
```java
String rect = rect();
```
soit équivalent au code plus verbeux suivant :
```java
String[][] noAttributes = {};
String rect = rect(noAttributes);
```



