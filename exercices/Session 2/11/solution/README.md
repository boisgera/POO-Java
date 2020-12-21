
Instructions
--------------------------------------------------------------------------------

Pour compiler, exécuter et tester le programme de cet exercice, 
exécutez dans le terminal la commande :

    $ ./run


Exercice
--------------------------------------------------------------------------------

Cette fois-ci, on a créé une fonction `megaBytesToBytes` qui convertit les Mo en Octets. Il se trouve que cette fonction ne donne pas le résultat attendu lorsque l'argument est trop grand...

Pouvez-vous modifier le fichier `library/ConvertByte.java` pour que le résultat attendu soit correct ?

Solution
--------------------------------------------------------------------------------

La solution est très proche de l'exercice précédent. Il faut faire en sorte que l'argument de la fonction `megaBytesToBytes` soit un `long`.

Remplacer 
```java
    public static long megaBytesToBytes(int mega){
````
par
```java
    public static long megaBytesToBytes(long mega){
````