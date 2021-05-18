Préambule
================================================================================

Première exécution
--------------------------------------------------------------------------------

Créez le code source d'une application `Preamble` dont le point d'entrée `main` 
... ne fait rien ! Puis La compiler et l'exécuter.

```java
// File: Preamble.java
public class Preamble {
    public static void main(String[] args) {
        // Nothing is going on here. Yet.
    }
}
```

Utilitaires
--------------------------------------------------------------------------------

Incluez le fichier `Utils.java` dans un répertoire `utils` à la racine de votre
projet (ou se trouve déjà votre fichier `Preamble.java`). Puis, le compiler.

En ajoutant la ligne

```java
import static utils.Utils.*;
```
au début de votre fichier `Preamble.java`, vous avez désormais accès à une
petite collection de fonctions utilitaires qui va simplifier le développement
d'applications dans le style "Java procédural".

Affichage
--------------------------------------------------------------------------------

Les utilitaires comportent la fonction
```java
public static void print(String string)
```
qui affiche une chaîne de caractère dans le terminal. Utiliser-là pour coder
une application affichant le fameux `"Hello World!"`.

Notez que par défaut, cette fonction ne fait pas de "retour chariot" (elle ne
crée pas de nouvelle ligne). Développez votre propre fonction `println`,
dont les fonctionnalités sont similaires à `print` mais qui affiche une
nouvelle ligne après le message.

Conversions
---------------------------------------------------------------------------------

Les utilitaires comportent une fonction 
```java
public static String str(int i)
```
qui convertit un entier de type `int` en chaîne de caractères. Elle comporte
en fait des fonctions similaires pour tous les types primitifs Java : 
`boolean`, `byte`, `char`, `short`, `int`, `long`, `float` and `double`.

Pouvez-vous implémenter des nouvelles variantes `printInt` et `printlnInt` 
de la fonction dont les arguments sont des entiers ? Puis, utilisez `printlnInt`
pour afficher l'entier `42`.

Lecture et écriture de fichiers
--------------------------------------------------------------------------------

Deux fonctions utilitaires permettent de lire et d'écrire des fichiers texte
(en utilisant unicode et [l'encodage utf-8](https://fr.wikipedia.org/wiki/UTF-8)).

```java
public static String read(String filename)
```

```java
public static void write(String filename, String content) 
```

Les utiliser pour créer un fichier `Hello.txt` contenant la chaîne de 
caractères "Hello world!", puis vérifier que vous pouvez bien relire son
contenu et l'afficher.

Si le fichier `filename` existe déjà, la fonction `write` écrase son contenu
avec `content`. Développez une fonction `append` qui au contraire ajoute 
la chaîne de caractères `content` à la fin du fichier. 
Puis testez-là par le code de votre choix !

Gestion des erreurs
--------------------------------------------------------------------------------

Les utilitaires comporte une fonction pour générer une erreur
```java
public static void error(String message)
```
Pour conclure en beauté ce préambule, créez une fonction qui fasse planter
votre programme puis invoquez-là.
Je vous suggère [une fonction `openThePodBayDoors` et le message d'erreur 
"I am afraid I can't do that Dave."](https://www.youtube.com/watch?v=Mme2Aya_6Bc)).