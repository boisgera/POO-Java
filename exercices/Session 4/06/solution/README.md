
Exercice - classe abstraite
--------------------------------------------------------------------------------

Un concepteur a réalisé les classes `Circle` et `Square` ci-joint. Il vient de se rendre compte que ces classes ont pas mal de choses en commun. Il aimerait bien trouver un moyen de maintenir son code plus facilement maintenable en factorisant un maximum de choses.

Par ailleurs, il aimerait bien une classe `ListShape` avec les propriétés suivantes :

  - Possède un `ArrayList` d'objets pouvant être aussi bien des `Circle` que des `Square`. Pourquoi pas des `Shape` ?

  - Possède un constructeur par défaut qui initialise une liste vide

  - Possède une méthode `add` qui permet d'ajouter un élément dans la liste

  - Possède une méthode `translate` qui translate tous les objets de la liste

  - Possède une méthode `printContent` qui affiche successivement chaque élément de la liste

  - Possède une méthode `getTotalArea` qui donne l'aire cumulée de toutes les formes.

  Pouvez-vous aider notre concepteur à modifier ses classes et créer `ListShape` ?

Note : la première consiste à mettre à jour `Circle`, `Square` et à les faire dériver d'une nouvelle classe `Shape` à écrire. Le fichier `Main.java` est compatible avec l'implémentation initiale et doit rester compatible avec les nouvelles versions. **Décommentez* ensuite les dernières instructions pour tester les fonctionnalités liées à `ListShape`.


Solution
-----------------------

Voir fichiers `Circle.java`, `Square.java`, `Shape.java` et `ListShape.java`.
