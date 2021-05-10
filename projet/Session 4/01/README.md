
Exercice - Constructeurs multiples
--------------------------------------------------------------------------------

On veut créer une classe `ColorAlpha` qui prenne en charge le canal alpha (opacité) en plus du code RGB. Le code d'opacité est une valeur numérique comprise entre 0 (complètement transparent) et 1 (opaque).

Il paraît inutile de recoder une classe `ColorAlpha` à partir de zéro. On vous propose d'en faire une classe fille de `Color`. Par contre, on s'impose de ne pas modifier la classe `Color`.

On ne va pas intégrer toutes les fonctionnalités immédiatement. Pour l'instant, on veut :
  - Un constructeur qui prend les valeurs R,G et B et mets la valeur alpha à 1
  - Un constructeur qui prend les valeurs R,G,B et alpha
  - Une méthode "printAlpha()" qui ne renvoie rien mais affiche dans le terminal la valeur alpha (pour réaliser des tests).

Pouvez-vous coder cette classe ? Si vous appréhendez l'écriture d'une classe complète par vous-même, le dossier `skeleton` vous donne un point de départ.
