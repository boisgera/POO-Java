
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

Solution
--------------------------------------------------------------------------------

L'implémentation de ce second constructeur est rapide si l'on ne fait pas
attention à la validation, en utilisant la fonction `Integer.parseInt` qui
fait le gros du travail :

    public Color(String hexString) {
      ... // validation code

      R = Integer.parseInt(hexString.substring(1, 3), 16);
      G = Integer.parseInt(hexString.substring(3, 5), 16);
      B = Integer.parseInt(hexString.substring(5, 7), 16);
    }

  Le code de validation peut prendre la forme suivante :

    if (hexString == null) {
      throw new NullPointerException();
    } else if (hexString.length() != 7) {
      throw new IllegalArgumentException("invalid : hexString should have a length of 7.");
    } else if (hexString.charAt(0) != '#') {
      throw new IllegalArgumentException("invalid : hexString should start with a '#'.");
    } else {
      hexString = hexString.toLowerCase();
      for (int i=1; i <= 6; i++) {
        if ("0123456789abcdef".indexOf(hexString.charAt(i)) == -1) {
          throw new IllegalArgumentException("invalid character in hexString.");
        }
      }
    }