% Compilation, Exécution, Archivage

Introduction
================================================================================

Objectifs
--------------------------------------------------------------------------------

Une introduction aux phases de

  - Compilation, 

  - Exécution,

  - Archivage, 
  
en ligne de commande.

Application
================================================================================

Application
--------------------------------------------------------------------------------

Une application Java nommée `App` se déclare
```java
public class App {
    ...
}
```
dans un fichier `App.java`.

--------------------------------------------------------------------------------

Elle déclare une fonction `main` de signature
```java
public static void main(String[] args) {
  ...
}
```
(Sinon, c'est un module, pas une application.)

--------------------------------------------------------------------------------

  - `main` : point d'entrée de l'application,

   - `args` : arguments passés à l'application.


<i class="far fa-file-code"></i> `App.java`
--------------------------------------------------------------------------------

```java
import java.lang.System;
public class App {
  public static void main(String[] args) {
    System.out.println("Hello, World!");
  }
}
```

Compilation
================================================================================

Compilation
--------------------------------------------------------------------------------

  - nécessite la commande `javac`,

  - fournie par [Java Development Kit (JDK)](https://en.wikipedia.org/wiki/Java_Development_Kit).


<i class="fas fa-terminal"></i>
--------------------------------------------------------------------------------

```
$ javac App.java
```

Artefact
--------------------------------------------------------------------------------

  - le fichier `App.class` généré par la compilation.

Execution
================================================================================

<i class="fas fa-cog"></i> Execution
--------------------------------------------------------------------------------

  - nécessite la commande `java`,

  - fournie par [Java Runtime Environment (JRE)](https://en.wikipedia.org/wiki/Java_virtual_machine#Execution_environment).

<i class="fas fa-terminal"></i>
--------------------------------------------------------------------------------

Dans le répertoire contenant le fichier `App.class`:

```
$ java App   
Hello, World!
```

Applications composites
================================================================================

Application composite
--------------------------------------------------------------------------------

  - module `Printer`,

  - application `App`.

<i class="far fa-file-code"></i> `Printer.java`
--------------------------------------------------------------------------------

```java
import java.lang.System;
public class Printer {
  public static void call(String text) {
    System.out.println(text);
  }
}
```

<i class="far fa-file-code"></i> `App.java`
--------------------------------------------------------------------------------

```java
public class App {
  public static void main(String[] args) {
    Printer.call("Hello, World!");
  }
}
```

Compilation
--------------------------------------------------------------------------------

```
$ javac Printer.java App.java
```

<i class="fas fa-cog"></i> Execution
--------------------------------------------------------------------------------

```
$ java App
Hello world!
```

Archivage
================================================================================

Objectif
--------------------------------------------------------------------------------

Distribuer le programme comme un fichier unique.


<i class="far fa-file-code"></i> `Manifest.txt`
--------------------------------------------------------------------------------

Spécifier le point d'entrée de l'application :

```
Main-Class: App
```

Archivage
--------------------------------------------------------------------------------

  - nécessite la commande `jar` (Java Archive Tool),

  - fournie par [Java Development Kit (JDK)](https://en.wikipedia.org/wiki/Java_Development_Kit).


<i class="fas fa-terminal"></i>
--------------------------------------------------------------------------------

Compilez vos fichiers `.java`, puis :

    $ jar cfm app.jar Manifest.txt *.class   


Voir aussi : [Packaging Programs in JAR Files](https://docs.oracle.com/javase/tutorial/deployment/jar/index.html)



<i class="fas fa-cog"></i> Execution
--------------------------------------------------------------------------------

Dans le répertoire contenant le fichier `app.jar` :

    $ java -jar app.jar   
    Hello, World!

Bibliothèques
================================================================================

Bibliothèque
--------------------------------------------------------------------------------

  - Ensemble de fonctionnalités, 
  
  - Disponibles sous forme de package(s),

  - Pas de point d'entrée (pas une application).

<i class="far fa-file-code"></i> `printer/Printer.java`
--------------------------------------------------------------------------------

```java
package printer;
import java.lang.System;
public class Printer {
  public static void call(String text) {
    System.out.println(text);
  }
}
```

<i class="fas fa-terminal"></i> Compilation et Archivage
--------------------------------------------------------------------------------

```
$ javac printer/Printer.java
$ jar cf printer.jar printer
```

Classpath
--------------------------------------------------------------------------------

Pour utiliser la bibliothèque contenue dans l'archive `printer.par`, 
il faut indiquer à `java` de prendre en compte ce fichier au moyen
du classpath

  - à la compilation de l'application,

  - lors de son exécution.

Exemples
--------------------------------------------------------------------------------

Ajoutez au classpath

  - `"."` pour les fichiers `.class` du répertoire courant,

  - `"*"` pour les fichiers `.jar` du répertoire courant.

Voir ausi [Setting the class path](https://docs.oracle.com/javase/7/docs/technotes/tools/windows/classpath.html).


<i class="fas fa-terminal"></i> Spécifier le classpath
--------------------------------------------------------------------------------

Comme :

  - une variable d'environnement
    ```
    $ export CLASSPATH=".:*"
    ```
  - une option en ligne de commande de `java/javac` :
    ```
    $ javac -cp ".:*" *.java
    ```


<i class="far fa-file-code"></i> `App.java`
--------------------------------------------------------------------------------

```java
import printer.Printer;
public class App {
  public static void main(String[] args) {
    Printer.call("Hello, World!");
  }
}
```

<i class="fas fa-terminal"></i>
--------------------------------------------------------------------------------

```
$ javac -cp ".:*" App.java
$ ls
App.class  App.java  printer.jar
```

<i class="fas fa-cog"></i> Execution
--------------------------------------------------------------------------------

```
$ java -cp ".:*" App 
Hello, World!
```

<style>

.reveal section img {
  border:0;
  height:50vh;
  width:auto;

}

.reveal section img.medium {
  border:0;
  max-width:50vh;
}

.reveal section img.icon {
  display:inline;
  border:0;
  width:1em;
  margin:0em;
  box-shadow:none;
  vertical-align:-10%;
}

.reveal code {
  font-family: Inconsolata, monospace;
}

.reveal pre code {
  font-size: 1.5em;
  line-height: 1.5em;
  /* max-height: 80wh; won't work, overriden */
}

input {
  font-family: "Source Sans Pro", Helvetica, sans-serif;
  font-size: 42px;
  line-height: 54.6px;
}

</style>

<link href="https://fonts.googleapis.com/css?family=Inconsolata:400,700" rel="stylesheet"> 

<!--
<link href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.css" rel="stylesheet">
 -->
<link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.8.2/css/all.css" integrity="sha384-oS3vJWv+0UjzBfQzYUhtDYW+Pj2yciDJxpsK1OYPAYjqT085Qq/1cq5FLXAZQ7Ay" crossorigin="anonymous">