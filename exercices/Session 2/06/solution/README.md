
Instructions
--------------------------------------------------------------------------------

Pour compiler, exécuter et tester le programme de cet exercice, 
exécutez dans le terminal la commande :

    $ ./run


Exercice
--------------------------------------------------------------------------------

Dans le fichier `Main.java` qui contient le programme principal, on fait appel à la fonction `numberToDay` de la classe `Day` dont le but est de donner le nom du jour de la semaine sous forme d'une chaîne de caractères. Si la valeur en argument vaut 1, on veut récupérer la chaîne `"Lundi"`, si la valeur en argument vaut 2, on veut récupérer la chaîne `"Mardi"`... Si l'argument est un nombre en dehors de l'intervalle [1-7], on renverra `"Vendremanche"`.

On vous demande d'ajouter le fichier manquant sur la base des exercices vus précédemment. 


Solution
--------------------------------------------------------------------------------
Voir le fichier `Day.java` ajouté. On propose ici une solution utilisant l'instruction `switch`, qui est ici plus pratique qu'un `if`...`else` (qui fonctionne aussi).

On notera bien l'utilisation de l'instruction `break`. Sans cette instruction, les instructions **après** la première instruction validée seraient toutes exécutées. Dans l'architecture proposée qui n'utilise pas de `return` dans chaque cas testé, on se retrouverait finalement à toujours exécuter ce qu'il y a dans `default` si les `break` sont absents. Ainsi, on retournerait toujours `"Vendremanche"`. Le `default` est par ailleurs ici impératif, sinon `dayString` pourrait ne pas avoir de valeur ; le compilateur renverrai une erreur. Ici, on pourrait toutefois se passer du `default` en initialisant dès le départ `dayString` à `"Vendremanche"`. 
