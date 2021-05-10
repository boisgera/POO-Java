
Exercice
--------------------------------------------------------------------------------

Pour faciliter le débogage de notre classe `Point`, on nous suggère d'en
faire une classe implémentant l'interface `Debuggable` :

        import java.io.PrintStream;

        interface Debuggable {
            void setPrintStream(PrintStream stream);
            void setDebug(boolean debug);
        }

avec les instructions suivantes : il s'agit, si `debug` a été setté à `true` et
seulement dans ce cas, d'écrire sur le `stream` qui a été donné des 
informations sur les méthodes appelées et les valeurs renvoyées, par exemple,
pour la séquence d'appels

     Point point = new Point(1.0, 2.0);
     point.setStream(System.out);
     point.setDebug(true);
     double x = point.getX();
     double y = point.getY();

de faire en sorte que s'affiche à l'exécution :

    getX() --> 1.0
    getY() --> 2.0

Solution
--------------------------------------------------------------------------------

Cf. fichier `Point.java` joint.
