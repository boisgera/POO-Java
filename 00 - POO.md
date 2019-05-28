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

  - Envoi de Messages

  - Encapsulation

  - Extensibilité

--------------------------------------------------------------------------------

Dynamic dispatch, late binding, inheritance, polymorphism, classes, objects,
abstraction, composition, héritage, délégation, 

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


Objet = Acteur
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
    
  - "L’ensemble se considère alors comme une **boîte noire** 
    ayant un comportement et des propriétés spécifiés." 

Exemple: Fractions
--------------------------------------------------------------------------------

<i class="fab fa-python"></i> Spécification (boîte noire):

    >>> Fraction(7)
    7
    >>> Fraction(2, 3)
    2/3
    >>> Fraction(1, 3) + Fraction(1, 6)
    1/2
    ...


--------------------------------------------------------------------------------


<i class="fab fa-python"></i> Constructeur

    class Fraction:
        def __init__(self, num, den=1):
            self._num = num
            self._den = den
            self._simplify()

--------------------------------------------------------------------------------

<i class="fab fa-python"></i> Méthode utilitaire

        def _simplify(self):
            gcd = math.gcd(self.num, self.denom)
            self.num = self.num / gcd
            self.denom = self.denom / gcd
            if self.denom < 0:
                self.num = - self.num
                self.denom = - self.denom

--------------------------------------------------------------------------------

<i class="fab fa-python"></i> Méthode d'addition

        def __add__(self, other):
            num = self._num + other._den + \
                  other._num * self._den
            den = self._den * other._den
            return Fraction(num, den)

--------------------------------------------------------------------------------

<i class="fab fa-python"></i> Méthode de représentation

        def __repr__(self):
            if self._den == 1:
                return f"{self._num}"
            else:
                return f"{self._num}/{self._den}"

--------------------------------------------------------------------------------

  - Les données des fractions sont stockées dans les **attributs** 
   (ou **champs**) `_num` et `_den`, 

  - Les **méthodes** `__init__`, `simplify`, `__add__`, ... 
    permettent de les manipuler.

--------------------------------------------------------------------------------

<i class="fab fa-python"></i> En Python:

  - Le caractère privé des données ou méthodes est indiqué par une convention:
    l'identifiant commence par un caractère de soulignement.  
    Seules les méthodes de l'objet doivent accéder 
    au champ `_num` ou appeler la méthode `_simplify`.
  
--------------------------------------------------------------------------------

  - Vous pouvez décider de ne pas vous conformer à cette indication
    **à vos risque et périls**
    (["We are all consenting adults"](https://python-guide-chinese.readthedocs.io/zh_CN/latest/writing/style.html#we-are-all-consenting-adults))

Par exemple:

    >>> f = Fraction(4, 6)
    >>> f._num = 7
    >>> f 
    ???



--------------------------------------------------------------------------------

<i class="fab fa-java"></i> En Java:

  - Les mots-clés  
    
        public, protected, private   

    contrôlent l'accès aux attributs et méthodes des objets.

--------------------------------------------------------------------------------

  - Selon le langage, l'accès aux données peut être rendu 
    possible -- de façon controllée -- 
    par des **accesseurs** (méthodes) et/ou des **propriétés.**

--------------------------------------------------------------------------------

<i class="fab fa-python"></i> En Python (lecture seule ou "getter"):

    def get_numerator(self):
        return self._num

et optionnellement:

    numerator = property(get_numerator)

--------------------------------------------------------------------------------
    
Usage:

    >>> f = Fraction(2, 3)
    >>> f.get_numerator()
    2
    >>> f.numerator
    2

Encapsulation -- Bénéfices
--------------------------------------------------------------------------------

  - **Architecture.** Le logiciel est structuré en composants en interaction
    pour maîtriser la complexité de l'ensemble.

  - **Abstraction.** Ce que fait un objet (son **interface**)
    est plus important que comment il le fait (son **implémentation**); 
    cette "ignorance sélective" contribue également à abaisser la
    complexité de l'ensemble.

Liaison dynamique (ou tardive)
================================================================================


Extensibilité
================================================================================

--------------------------------------------------------------------------------

  - Class-based vs prototype

  - Inheritance vs composition (& délégation)

  - Polymorphism, late binding


Héritage Fondamental ?
--------------------------------------------------------------------------------

  - Smalltalk-72 ne permet pas l'héritage.

[What does Alan Kay think about inheritance in object-oriented programming?](What does Alan Kay think about inheritance in object-oriented programming?)

Classes
--------------------------------------------------------------------------------

La classe `list`
--------------------------------------------------------------------------------

<i class="fab fa-python"></i>

    >>> [1, 2, 3]
    [1, 2, 3]
    >>> type([1, 2, 3])
    <class 'list'>
    >>> repr([1, 2, 3])
    '[1, 2, 3]'
    >>> sum([1, 2, 3])
    6


--------------------------------------------------------------------------------

    class List(list):
        def __repr__(self):
            list_repr = list(self)
            return f"List({list_repr})"


--------------------------------------------------------------------------------

    >>> l = List([1, 2, 3]); l
    List([1, 2, 3])
    >>> type(l)
    <class 'List'>
    >>> repr(l)
    'List([1, 2, 3])'
    >>> sum(l)
    6

Prototypes
--------------------------------------------------------------------------------


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