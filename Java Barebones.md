% Java "Barebones"

Introduction
================================================================================

Objectifs
--------------------------------------------------------------------------------

Une introduction aux phases de

  - Compilation, 
  
  - Packaging, 
  
  - Execution,

**SANS** BlueJ, Visual Studio Code, Eclipse, etc.


1 -- Application minimale
================================================================================

Application
--------------------------------------------------------------------------------

  - Une application Java suppose un programme déclarant une méthode avec le 
    prototype:

        public static void main(String[] args)

   - Le tableau `args` contient les arguments passés à l'application lors de
     son invocation.


<i class="far fa-file-code"></i> `App.java`
--------------------------------------------------------------------------------

    public class App {
      public static void main(String[] args) {
        System.out.println("Hello, World!");
      }
    }

Compilation
--------------------------------------------------------------------------------

  - nécessite la commande `javac`.

  - elle est fournie par [Java Development Kit (JDK)](https://en.wikipedia.org/wiki/Java_Development_Kit).


<i class="fas fa-terminal"></i>
--------------------------------------------------------------------------------

        $ javac App.java

Distribution
--------------------------------------------------------------------------------

  - le fichier `App.class` généré par la compilation.

<i class="fas fa-cog"></i> Execution
--------------------------------------------------------------------------------

  - nécessite la commande `java`.

  - elle est fournie par [Java Runtime Environment (JRE)](https://en.wikipedia.org/wiki/Java_virtual_machine#Execution_environment).

<i class="fas fa-terminal"></i>
--------------------------------------------------------------------------------

Dans le répertoire contenant le fichier `App.class`:

    $ java App   
    Hello, World!

2 - Distribuer une archive
================================================================================


<i class="far fa-file-code"></i> `App.java`
--------------------------------------------------------------------------------

    public class App {
      public static void main(String[] args) {
        Printer.call("Hello, World!");
      }
    }


<i class="far fa-file-code"></i> `Printer.java`
--------------------------------------------------------------------------------

    public class Printer {
      public static void call(String text) {
        System.out.println(text);
      }
    }


<i class="far fa-file-code"></i> `Manifest.txt`
--------------------------------------------------------------------------------

    Main-Class: App

Archivage
--------------------------------------------------------------------------------

  - nécessite la commande `jar` (Java Archive Tool).

  - elle est fournie par [Java Development Kit (JDK)](https://en.wikipedia.org/wiki/Java_Development_Kit).


<i class="fas fa-terminal"></i>
--------------------------------------------------------------------------------

Après compilation, dans le répertoire contenant les fichiers `*.class`:

    $ jar cfm app.jar Manifest.txt *.class   


Voir aussi: [Packaging Programs in JAR Files](https://docs.oracle.com/javase/tutorial/deployment/jar/index.html)



<i class="fas fa-cog"></i> Execution
--------------------------------------------------------------------------------

Dans le répertoire contenant le fichier `app.jar`:

    $ java -jar app.jar   
    Hello, World!

3 - Distribuer une bibliothèque
================================================================================


<i class="far fa-file-code"></i> `printer/Printer.java`
--------------------------------------------------------------------------------

    package printer;

    public class Printer {
      public static void call(String text) {
        System.out.println(text);
      }
    }

<i class="fas fa-terminal"></i>
--------------------------------------------------------------------------------

    $ javac printer/Printer.java
    $ jar cf printer.jar printer


Class Path
--------------------------------------------------------------------------------

  - Pour utiliser la bibliothèque contenue dans l'archive `printer.par`, 
    il faudra indiquer à `java` d'explorer ce fichier au moyen de la
    variable `CLASSPATH`.

  - Par exemple: ajoutez `*` au class path pour que java prenne en compte 
    tous les fichiers jar contenus dans le répertoire courant.

  - Voir ausi [Setting the class path](https://docs.oracle.com/javase/7/docs/technotes/tools/windows/classpath.html)


<i class="far fa-file-code"></i> `App.java`
--------------------------------------------------------------------------------

    import printer.Printer;

    public class App {
      public static void main(String[] args) {
        Printer.call("Hello, World!");
      }
    }

<i class="fas fa-terminal"></i>
--------------------------------------------------------------------------------

    $ javac App.java
    $ ls
    App.class  App.java  printer.jar

<i class="fas fa-cog"></i> Execution
--------------------------------------------------------------------------------

    $ export CLASSPATH=".:*"
    $ java App 
    Hello, World!

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