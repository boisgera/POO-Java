
Exercice - Constructeurs multiples
--------------------------------------------------------------------------------

Les designers aiment tellement les couleurs spécfifées en hexadecimal
qu'ils souhaitent désormais pouvoir spécifier une couleur directement 
dans ce format, c'est-à-dire écrire par exemple :

    Color red = new Color("#ff0000");

Pouvez-vous implémenter ce second constructeur ? Il vous est demandé de 
faire particulièrement attention au code de validation de la chaine de
caractères en entrée : une chaine `null`, ne commençant pas par `'#'`,
de la mauvaise longueur ou ne représentant pas un code hexadécimal
doivent engendrer un exception avec un message d'erreur approprié.
