% Programmation Orientée Objet

Introduction
================================================================================


Histoire
================================================================================

--------------------------------------------------------------------------------

[The Forgotten History of OOP](https://medium.com/javascript-scene/the-forgotten-history-of-oop-88d71b9b2d9f)

> “I made up the term ‘object-oriented’, 
>  and I can tell you I didn’t have C++ in mind.”  
>  Alan Kay, OOPSLA ‘97

Propriétés -- Vue d'Ensemble
================================================================================

--------------------------------------------------------------------------------

  > “OOP to me means only messaging, local retention and protection 
  > and hiding of state-process, and extreme late-binding of all things.”
  > Alan Kay

Autrement dit, envoi de messages, encapsulation et 
liaison dynamique ou tardive.

Envoi de Messages
================================================================================

<i class="far fa-paper-plane"></i>
--------------------------------------------------------------------------------

Les "objets" communiquent par envoi de messages.


Modèle Acteur
--------------------------------------------------------------------------------

"(...) considère des acteurs comme les seules fonctions primitives nécessaires 
pour la **programmation concurrente**.   
Les acteurs communiquent par échange de messages. 
En réponse à un message, un acteur peut effectuer un traitement local, 
créer d'autres acteurs, ou envoyer d'autres messages." 

<i class="fab fa-wikipedia-w"></i> [Modèle Acteur](https://fr.wikipedia.org/wiki/Mod%C3%A8le_d%27acteur)

--------------------------------------------------------------------------------

"Actors systems research was based on the assumption that massively parallel, 
distributed, computer systems could become prevalent, and therefore a 
convenient and efficient way to structure a computation was as a large 
number of **self contained processes**, called **actors**, communicating by sending 
messages to each other."

  [Smalltalk wiki](http://wiki.c2.com/?MessagePassing)

--------------------------------------------------------------------------------

"I realised that Erlang was the only true OO language   
-- **the big thing about OO is message passing** --   
Java/C++ are not OO."

Joe Armstrong [<i class="fab fa-twitter"></i>](https://twitter.com/joeerl/status/877609897730256901)

See also [Why OO Sucks](http://harmful.cat-v.org/software/OO_programming/why_oo_sucks)

--------------------------------------------------------------------------------

S'inscrivent dans cette philosophie:

Smalltalk, Erlang, Ruby, Elixir, etc.

--------------------------------------------------------------------------------

<i class="far fa-gem"></i> Ruby

    > 1 + 2
    => 3

L'opérateur `+` calcul la somme des valeurs `1` et `2`.

--------------------------------------------------------------------------------

<i class="far fa-gem"></i> Ruby

    > 1.+ 2
    => 3

Le calcul est délégué à la méthode `+` de l'objet `1`.

--------------------------------------------------------------------------------

<i class="far fa-gem"></i> Ruby

    > 1.send(:+, 2)
    => 3

L'addition est la réponse à un message  
-- contenant le symbole `+` et l'objet `2` --  
adressé à l'objet `1`.


Références
--------------------------------------------------------------------------------

  - [Ruby is a Message-Oriented Language](http://brisruby.org/message-oriented-language)

  - [Do your understand Ruby's Objects, Message and Blocks?](http://rubylearning.com/blog/2010/11/03/do-you-understand-rubys-objects-messages-and-blocks/)


Par extension ...
--------------------------------------------------------------------------------

On peut interpréter: 

<i class="fab fa-java"></i> Java

     myDictionary.put(key, value);

comme

  - l'envoi du message `"put"`, 

  - contenant les informations `key` et `value`,

  - à l'objet `myDictionary`.


Encapsulation
================================================================================

[<i class="fab fa-wikipedia-w"></i> Encapsulation](https://fr.wikipedia.org/wiki/Encapsulation_(programmation))
--------------------------------------------------------------------------------

  - "désigne le principe de **regrouper des données brutes avec un ensemble de 
     routines** permettant de les lire ou de les manipuler." 
     
  - "(...) souvent accompagné du **masquage de ces données brutes** 
    afin de s’assurer que l’utilisateur ne contourne pas l’interface qui lui 
    est destinée." 
    
  - "L’ensemble se considère alors comme une **boîte noire** ayant un comportement 
    et des propriétés spécifiés." 

--------------------------------------------------------------------------------

<i class="fab fa-python"></i> Python

    class Fraction:
        def __init__(self, num, den=None):
            self._num = num
            self._den = den if den is not None else 1
            self.simplify()

--------------------------------------------------------------------------------

        def simplify(self):
            ...

--------------------------------------------------------------------------------

        def __add__(self, other):
            other = Fraction(other)
            num = self._num + other._den + \
                  other._num * self._den
            den = self._den * other._den
            return Fraction(num, den)

--------------------------------------------------------------------------------

        def __repr__(self):
            return f"{self._num}/{self._den}"


--------------------------------------------------------------------------------

<i class="fab fa-python"></i> Python:

["We are all consenting adults"](https://python-guide-chinese.readthedocs.io/zh_CN/latest/writing/style.html#we-are-all-consenting-adults)


Liaison dynamique (ou tardive)
================================================================================


Héritage
================================================================================

Fondamental ?
--------------------------------------------------------------------------------

  - Smalltalk-72 ne permet pas l'héritage.

[What does Alan Kay think about inheritance in object-oriented programming?](What does Alan Kay think about inheritance in object-oriented programming?)

<style>

.reveal section img {
  border:0;
  height:50vh;
  width:auto;

}

.reveal section img.medium {
  border:0;
  max-width:50vh;
}

.reveal section img.icon {
  display:inline;
  border:0;
  width:1em;
  margin:0em;
  box-shadow:none;
  vertical-align:-10%;
}

.reveal code {
  font-family: Inconsolata, monospace;
}

.reveal pre code {
  font-size: 1.5em;
  line-height: 1.5em;
  /* max-height: 80wh; won't work, overriden */
}

input {
  font-family: "Source Sans Pro", Helvetica, sans-serif;
  font-size: 42px;
  line-height: 54.6px;
}

</style>

<link href="https://fonts.googleapis.com/css?family=Inconsolata:400,700" rel="stylesheet"> 

<!--
<link href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.css" rel="stylesheet">
 -->
<link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.8.2/css/all.css" integrity="sha384-oS3vJWv+0UjzBfQzYUhtDYW+Pj2yciDJxpsK1OYPAYjqT085Qq/1cq5FLXAZQ7Ay" crossorigin="anonymous">