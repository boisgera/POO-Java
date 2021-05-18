
Exercice - Encapsulation
--------------------------------------------------------------------------------

La class `Color` ci-joint qui répond au problème précédent est malheureusement 
susceptible d'être facilement "hackée" : ses instances peuvent être mises 
dans des états invalides, avec des des composantes RGB qui ne sont pas des 
entiers compris entre 0 et 255. La fonction `main` de la class `Main` présente 
deux exemples de tels usages dangereux (impropres ?) de la classe.

Pouvez-vous sécuriser la classe `Color` pour que les erreurs éventuelles
se manifestent dès qu'elles sont faites et non tardivement,
lorsque l'on appelle la méthode `toString` ? 
Les autres fonctionnalités de `Color` doivent rester inchangées.

Solution
--------------------------------------------------------------------------------

La première démarche consiste à rendre les champs `R`, `G` et `B` privés
pour éviter qu'on ne puisse les modifier depuis l'extérieur de `Color`.

    public class Color {
      private Integer R;
      private Integer G;
      private Integer B;
      ...
    }

Il convient également d'éviter que les valeurs `R`, `G` ou `B` soient en
dehors de l'intervalle [0, 255]. Cela peut être réalisé en "clippant" 
les valeurs dans cet intervalle

    import java.lang.Math;

    public Color {
      ...
      public Color(int R, int G, int B) {
        this.R = Math.min(255, Math.max(R, 0));
        this.G = Math.min(255, Math.max(G, 0));
        this.B = Math.min(255, Math.max(B, 0));
      }
    }

Une alternative, plus stricte, consisterait à détecter une valeur en dehors 
de l'intervalle admissible et à lever une exception pour éviter d'avoir à
instancier `Color`. Cette approche supposerait des fragment de code 
de la forme suivante dans le constructeur de `Color`:

    if (R < 0) || (R > 0) {
      throw new IllegalArgumentException("Valeur du canal R invalide.");
    }