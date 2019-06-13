% Java Aujourd'hui

Contexte
================================================================================

--------------------------------------------------------------------------------

<!--
[<i class="fab fa-wikipedia-w"></i> Encapsulation](https://fr.wikipedia.org/wiki/Encapsulation_(programmation))
-->

La plate-forme Java a été développé par:
  
  - James Gosling dans les années 1990,
    
  - pour [Sun Microsystems](https://en.wikipedia.org/wiki/Sun_Microsystems)  
    (OpenOffice, VirtualBox, Solaris, NFS, etc.).

API Java
--------------------------------------------------------------------------------

**Application Programming Interfaces**   
Interfaces des Bibliothèques

  - **Standard Edition (Java SE)**   
    (bases, interfaces graphiques, ...),

  - **Enterprise Edition (Java EE)**  
    (serveurs, ...),

  - **Micro Edition (Java ME)**   
    (embarqué, mobile, ...).
    
Rachat de Sun Microsystems
--------------------------------------------------------------------------------

En 2010, **Oracle Corporation** rachète Sun Microsystems:

  - <https://www.oracle.com/SUN/>

  - <https://en.wikipedia.org/wiki/Sun_acquisition_by_Oracle>

Oracle Corp. est une entreprise "profit-driven" ...


Java est encore "free" ?
================================================================================

--------------------------------------------------------------------------------

...

Java sur les mobiles
================================================================================

--------------------------------------------------------------------------------

  - Oubliez Java "Mobile Edition" ...

  - Bienvenue à [Android](https://en.wikipedia.org/wiki/Android_(operating_system)) !

Android
--------------------------------------------------------------------------------

  - basé initialement sur "Java-le-language" mais ...
  
  - [Kotlin est désormais le langage préféré de Google pour Android](https://techcrunch.com/2019/05/07/kotlin-is-now-googles-preferred-language-for-android-app-development/)
    (mai 2019).

  - [Kotlin](https://kotlinlang.org/) (2011) "modernise" le langage Java;
    il est également une option pour programmer avec des bibliothèques
    Java sur le bureau ou le serveur.

--------------------------------------------------------------------------------

  - Android n'est pas basé sur la JVM (Java Virtual Machine, mais sur l'ART ([Android Runtime](https://en.wikipedia.org/wiki/Android_Runtime), et avant sur la [VM Dalvik](https://en.wikipedia.org/wiki/Dalvik_(software))); en particulier, le format de bytecode n'est pas compatible.


  - les bibliothèques standards Android ne sont pas compatibles avec 
    les bibliothèques standards Java (ni Standard Edition, ni Mobile Edition).

Oracle America, Inc. v. Google, Inc.
--------------------------------------------------------------------------------

([sur Wikipedia](https://en.wikipedia.org/wiki/Oracle_America,_Inc._v._Google,_Inc.))

  - Google affirme que **les APIs de Java** (une partie de Java SE) 
    ne sont pas soumises au copyright.

--------------------------------------------------------------------------------

  - En mai 2012 un premier jugement lui donne raison, mais ...

  - en mai 2014, le niveau fédéral révoque partiellement cette décision mais ...

  - en mai 2016, un nouveau jugement donne raison à Google mais ...

  - [**The Case That Never Ends: Oracle Wins Latest Round vs. Google**](https://www.wired.com/story/the-case-that-never-ends-oracle-wins-latest-round-vs-google/) (mars 2018)

  - Actuellement en appel auprès de la Cour Suprême des Etats-Unis.

Java "Enterprise Edition"
================================================================================

--------------------------------------------------------------------------------

([J2EE ou Java EE ou Jakarta EE](https://www.baeldung.com/java-enterprise-evolution) ou [EE4J](https://projects.eclipse.org/projects/ee4j))

2017
--------------------------------------------------------------------------------

[**Oracle doesn't want Java EE any more**](https://www.infoworld.com/article/3217347/oracle-doesnt-want-java-ee-any-more.html)

  - "Oracle wants someone else to lead enterprise Java, 
    though it says it will stay involved." 

  - "Apache and Eclipse are likely candidates to take over Java EE."

  - **Sept. 2017:** transfert des droits pour Java EE à la fondation Eclipse.

2018
--------------------------------------------------------------------------------

  - [**How the Eclipse Foundation is saving enterprise Java.**](https://www.techrepublic.com/article/how-the-eclipse-foundation-is-saving-enterprise-java/)
    "The Eclipse Foundation is quiet and doesn't brag about its work 
    on enterprise Java, but this approach just might save the standard."

------

  - [**Java EE renamed 'Jakarta EE' after Big Red brand spat.**](https://www.theregister.co.uk/2018/03/04/java_ee_is_now_jakarta_ee/)
    "Oracle released the code, but not the name, so now devs have to make sure package names make sense"



    "One important argument for allowing the libre version to keep the Java name was compatibility, 
    but that didn't sway Oracle. [...] while **javax** package names and namespaces would remain for compatibility, new API technologies would need to adopt the new name."


2019
--------------------------------------------------------------------------------

  - [**Oracle: Eclipse can’t use Java EE trademarks**](https://www.infoworld.com/article/3393233/oracle-eclipse-cant-use-java-ee-trademarks.html)

    "But Oracle 'remains committed' to working with the Jakarta EE working group 
     and Jakarta EE specification process."

  - [**Negotiations Failed: How Oracle killed Java EE.**](https://headcrashing.wordpress.com/2019/05/03/negotiations-failed-how-oracle-killed-java-ee/)

  - [**It’s Java just, not as we know it: Oracle-Jakarta name talks fail**](https://devclass.com/2019/05/07/java-eclipse-oracle-jakarta-name-talks-fail/)

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

<link href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.css" rel="stylesheet">
