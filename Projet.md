% Projet : générer des fichiers SVG

Objectifs progressifs
======================

Objectifs
--------------------

  1. Créer différentes classes pour les primitives de base (rectangle, cercle/ellipse) permettant de générer un SVG avec des attributs simples (position, couleur, éventuellement bordure)

  2. Générer un SVG avec plusieurs primitives graphiques
  
  3. Avoir la possibilité de réaliser des opérations complexes (mettre en noir et blanc, inverser les couleurs, optimiser la zone d'affichage, ...)
  
  4. Utiliser des primitives plus complexes (groupes, ...)

Y aller étape par étape !
--------------------

  - Commencer par un rectangle ou un cercle uniquement

  - Créer un fichier de classe, y mettre les attributs strictement nécessaires

  - Définir **toXML()** qui permet de renvoyer la chaîne de caractères XML

  - Quand ça marche, complexifier un peu la classe


Des méthodes utiles à envisager :
--------------------

  - Une méthode pour définir la position et une pour translater

  - Une méthode pour gérer la rotation

  - Méthodes pour changer certains paramètres (**couleur**, bordures...)

Ressources (fichiers [ici](https://github.com/boisgera/POO-Java/tree/master/ressources_projet))
----------------

  - Un squelette de fonction **main** à personnaliser (*App.java*)

  - Une classe **File** pour l'écriture dans les fichiers

  - Un script **run**

  - Une librairie **XML** pour ceux qui ont un **niveau avancé** (*XML.java* et *Element.java*)

Script run
-----------------

Si le script ne s'exécute pas en raison d'un problème de droits d'exécution 

    sudo chmod u+x run


Conseils
================

Entraînez-vous à manipuler le SVG
------------

  - Avant d'implémenter une nouvelle fonction dans votre classe, testez là "manuellement"

  - Créez un fichier ".xml", mettez-y le code de votre figure, renommez en SVG pour visualiser le résultat

  - Inspirez-vous du [tutoriel Mozilla](https://developer.mozilla.org/fr/docs/Web/SVG/Tutoriel)


Écrivez du XML "simple"
-------------

  - Ne pas se préoccuper des indentations

  - En cas de doute, inspectez votre sortie avec un navigateur Web


Attributs ViewBox, Width et Height de SVG
---------------

Si vos dessins ont des problèmes de mise à l'échelle automatique dans Repl.it :

  - Vérifier en ouvrant le fichier dans le navigateur

  -  Ajuster ViewBox, width et height (attributs du noeud svg) pour contrôler finement les échelles et unités (voir [cette page du tutoriel](https://developer.mozilla.org/fr/docs/Web/SVG/Tutoriel/Positionnement))  




<link href="https://fonts.googleapis.com/css?family=Inconsolata:400,700" rel="stylesheet"> 

<!--
<link href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.css" rel="stylesheet">
 -->
<link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.8.2/css/all.css" integrity="sha384-oS3vJWv+0UjzBfQzYUhtDYW+Pj2yciDJxpsK1OYPAYjqT085Qq/1cq5FLXAZQ7Ay" crossorigin="anonymous">
