
Exercice
--------------------------------------------------------------------------------

On vous a fourni un code de "gestion et d'exécution de tâches" sous la forme
du code source `TaskQueue.java`. Les tâches que vous devez programmer puis
exécuter sont des actions d'affichage de message `PrintAction` : vous
devez programmer puis exécuter l'affichage des messages "Message 1", 
"Message 2" et "Message 3".

    PrintAction p1 = new PrintAction("Message 1");
    PrintAction p2 = new PrintAction("Message 2");
    PrintAction p3 = new PrintAction("Message 3");

Pouvez-vous adaptez la classe `PrintAction` pour que ces messages puissent
être pris en charge par la class `TaskQueue` ?

    TaskQueue queue = new TaskQueue();
    queue.schedule(p1);
    queue.schedule(p2);
    queue.schedule(p3);
    queue.run();

Vous remarquez que `TaskQueue` implémente elle-même l'interface `Runnable`. 
Montrer comment exploiter cette fonctionnalité pour programmer 
avec un minimum de code l'affichage des messages

        Message 1
        Message 2
        Message 3
        Message 1
        Message 2
        Message 3
        Message 1
        Message 2
        Message 3

Solution
--------------------------------------------------------------------------------

La méthode `schedule` de `TaskQueue` accepte des `Runnable`, une interface
standard Java qui demande que soit implémentée une fonction

    void run()

Il suffit donc de déclarer que `PrintAction` implémente `Runnable`, puis de
définir une méthode `run` qui va invoquer l'action d'affichage :

    public class PrintAction implements Runnable {
        ...
        public void run() {
            print();
        }
    }

Pour programmer l'affichage trois fois de suite des messages 1, 2 et 3, 
comme ils sont déjà programmés dans `queue`, il suffit de programmer
`queue` elle-même trois fois dans une nouvelle queue, plus de l'exécuter :

    TaskQueue newQueue = new TaskQueue();
    newQueue.schedule(queue);
    newQueue.schedule(queue);
    newQueue.schedule(queue);
    newQueue.run();
