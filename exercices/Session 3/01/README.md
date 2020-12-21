
Exercice
--------------------------------------------------------------------------------

Le programme `Main` génère des fichiers SVG contenant des rectangles de couleur
variable. Pour cela, il s'appuie sur un squelette de document SVG (`template`)
et sur la classe `Color` que vous allez devoir implémenter.

Les instances de la classe `Color` doit pouvoir être initialisées en spécifiant
les composantes rouge, vert et bleu (des entiers entre 0 et 255) de la couleur :

    Color cyan = new Color(0, 255, 255);

Le programme compte sur la classe `Color` pour décrire les couleurs comme une
chaîne de caractères "rgb(?, ?, ?)" compatible avec le format SVG :

    cyan.toString() -> "rgb(255,0,0)"

Implémenter la classe Color de telle sorte que le programme génère bien des 
fichiers svg rouge, vert et bleu.
