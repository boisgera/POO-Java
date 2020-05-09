
Exercice - Encapsulation
--------------------------------------------------------------------------------

Les designers qui utilisent les documents SVG ont pris l'habitude d'utiliser une
autre représentation des couleurs : au lieu de `"rgb(255,0,0)"` pour représenter
la couleur rouge, ils préfèrent la chaine hexadécimale `"#ff0000"` 
(se reporter par exemple [à la documentation Mozilla](https://developer.mozilla.org/fr/docs/Web/CSS/Type_color)).

Ils souhaiteraient désormais que vous ajoutiez une méthode `toHexString` à 
la classe `Color` et que vous utilisiez cette représentation dans les documents 
SVG qui sont générés.
