
Exercice - Encapsulation
--------------------------------------------------------------------------------

Les designers qui utilisent les documents SVG ont pris l'habitude d'utiliser une
autre représentation des couleurs : au lieu de `"rgb(255,0,0)"` pour représenter
la couleur rouge, ils préfèrent la chaine hexadécimale `"#ff0000"` 
(se reporter par exemple [à la documentation Mozilla](https://developer.mozilla.org/fr/docs/Web/CSS/Type_color)).

Ils souhaiteraient désormais que vous ajoutiez une méthode `toHexString` à 
la classe `Color` et que vous utilisiez cette représentation dans les documents 
SVG qui sont générés.

Solution
--------------------------------------------------------------------------------

La classe `Integer` héberge une fonction  `toHexString` qui fait l'essentiel du 
travail, en donnant la représentation hexadécimale d'un entier. 
Mais si l'entier est compris entre 0 et 15, nous n'aurons pas la chaîne de 
caractère de longueur 2 nécessaire. 
Il nous faut donc détecter ce cas de figure et rajouter un 0
à gauche de la chaîne de caractère. Nous pouvons impémenter une fonction
pour nous assister dans cette tâche spécifique.

    class Color {
      ...
      public static String channelToHex(Integer integer) {
        String string = Integer.toHexString(integer);
        if (string.length() == 1) {
          string = "0" + string;
        }
        return string;
      }
    }

L'implémentation de `toHexString` devient alors très simple :

    public Color {
      ...
      public String toHexString() {
        return "#" + channelToHex(this.R) + channelToHex(this.G) + channelToHex(this.B);
      }
    }
