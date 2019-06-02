% Java sans BlueJ

1 -- Application minimale
================================================================================

Application
--------------------------------------------------------------------------------

  - Une application Java suppose un programme déclarant une méthode avec le 
    prototype:

        public static void main(String[] args)

   - Le tableau `args` contient les arguments passé à l'application lors de
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

        $ java App.java

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

Etape 2
================================================================================

--------------------------------------------------------------------------------

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