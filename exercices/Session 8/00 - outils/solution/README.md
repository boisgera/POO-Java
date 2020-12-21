
L'exécution d'une application Java peut nécessiter qu'un 
"Java Runtime Environnement" (JRE) soit installé. 
Ce JRE fournit la commande `java`.

Pour compiler et packager une telle application, 
d'autres outils sont nécessaires au développeur :
le compilateur `javac` et l'archiveur `jar`.
Ils sont fournis avec le "Java Development Kit" (JDK).

Exercice
--------------------------------------------------------------------------------

Tester de façon simple que le JRE, puis le JDK sont installés dans votre
environnement.

Solution
--------------------------------------------------------------------------------

Il suffit d'essayer d'invoquer les programmes fournis par le JRE et le JDK 
dans le terminal :

    $ java --version

pour tester la présence du JRE et

    $ javac --version
    $ jar --version

pour le JDK.