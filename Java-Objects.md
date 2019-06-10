% Les objets en Java

Définir un objet 
=====================

Exemple de la classe Point
--------------------------

    public class Point {
      double x, y;
      public Point(double x, double y) {
        this.x = x;
        this.y = y;
      } 
      public double distance() {
        return Math.sqrt(x*x + y*y);
      }
    }

Les attributs
--------------

Ici $x$ et $y$. Ce sont les variables internes associées à la classe. 

Les méthodes "classiques"
---------------
Ici **distance** est une méthode qui ne prend pas d'argument et qui permet de calculer la distance à l'origine du point.  

  - **double** réfère ici au type de sortie. 

  - Si une fonction ne retourne rien, le type de sortie est **void**

  - **()** signifie que la fonction ne prend pas d'arguments en entrée.

Constructeur
----------------
Une classe doit définir un constructeur dont le but est de définir les attributs (l'état) de l'instance. Si elle n'en définit pas, le compilateur définira un **constructeur par défaut** qui initialisera tous les attributs de classe aux valeurs par défaut.

C'est un choix qui peut prêter à confusion.

-----------------

Le constructeur porte toujours le même nom que la classe. Ce cas particulier de méthode **n'a pas de type de sortie** (même pas *void*). Ici, son prototype est :

    Point(double x, double y)

  - Le constructeur utilise deux arguments nommés x et y dans le corps de la fonction

  - Il est possible de définir plusieurs constructeurs avec des prototypes différents.


Nom des variables
-------------------
Au sein d'une classe, les attributs peuvent être utilisés directement et font référence à l'instance courante (en général)

Si au sein d'une méthode, une variable est définie avec un nom identique, c'est la nouvelle variable qui sera associée à ce nom localement.

Pour référencer à nouveau l'attribut : le mot clé **this** 

------------------

    public double distance2() {
        int x = 0 ;
        int y = x+1 ;
        return Math.sqrt(x*x + y*y);
    }

et

    public double distance3(){
        int x = 0 ;
        int y = x+1 ;
        return Math.sqrt(this.x*this.x + this.y*this.y);
    }

Accéder aux attributs et méthodes d'une classe
-----------------------------------------

Avec l'opérateur "**.**" (lorsque cela est possible)

    // Si p est de classe Point 
    p.x  ; retourne x
    p.distance() ; // retourne la distance à l'origine


Instancier une classe
----------------------------------------

Avec le mot clé **New** et l'appel au constructeur

    Point myPoint = new Point() ;

ou

    Point myPoint,myPoint2 ;
    myPoint = new Points(1,0) ;
    myPoint2 = myPoint ; // Attention, même référence


Règles de nommage
---------------------------------


  - **variables** : commencent par une minuscule puis une majuscule sur les mots suivants accolés
    - ex. : x, isFed,...

  - **constantes** : en capitales avec underscore si différents mots
    - ex. : PI, ARRAY_SIZE,...

----------------------

  - **methodes** : commencent par une minuscule puis une majuscule sur les mots suivants accolés
    - ex.: getArea(), isHappy(),...


  - **classes** : commencent par une majuscules puis une majuscule sur les mots suivants accolés
    - ex. : Cat, Point, MainClass,...


La surcharge de méthodes
========================


Définition
------------------


Il s'agit de définir au sein d'une même classe (ou ses dérivées) une méthode dont le nom existe mais avec une signature différente.

    public double distance(Point p){
        double dx = this.x - p.x ;
        double dy = this.y - p.y ;
        return Math.sqrt(dx*dx + dy*dy);
    }


----------------


On peut aussi surcharger le constructeur.

    Point(){
        x = 0 ;
        y = 0 ;
    }


Héritage
======================

Une classe Disque1 qui ressemble à Point...
--------------

    public class Disque1 {
        double x, y , r;
        public Disque1(double x, double y) {
            this.x = x;
            this.y = y;
        } 
        public double distance() {
            return Math.sqrt(x*x + y*y);
        }
        public double distance(Disque1 d) {
            double dx = x - d.x ;
            double dy = y - d.y ;
            return Math.sqrt(x*x + y*y) ;
        }
        public double area(){
            return r*r*Math.PI ;
        }
        public double perimeter(){
            return 2*r*Math.PI ;
        }
    }

Principe de l'héritage
-----------------------

Trouver un lien naturel entre deux classes :

  - Permet du factoriser le code

  - On n'implémente que les nouvelles fonctionnalités

  
Implémentation de l'héritage : 
--------------------

Grâce au mot clé **extends**

    public class Disque2 extends Point{
        double r ;
        public Disque2(double x,double y)
        {
            this.x = x ; this.y = y ;
        }
        public double area(){
            return r*r*Math.PI ;
        }
        public double perimeter(){
            return 2*r*Math.PI ;
        }
        
    }

---------------------

**super** permet l'appel du constructeur de la classe parente 

    public class Disque2 extends Point{
        double r ;
        public Disque2(double x,double y)
        {
            super(x,y);
        }
        public double area(){
            return r*r*Math.PI ;
        }
        public double perimeter(){
            return 2*r*Math.PI ;
        }
        
    }



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