XML - Extensible Markup Language
================================================================================

Ce projet fournit un paquetage `xml` minimaliste qui peut simplifier la
définition de structures de données XML et la génération des fichiers
correspondants.

Le format SVG de dessins vectoriels (Scalable Vector Graphics) que nous allons 
utiliser est un dialecte de XML ; c'est dans ce cadre que ce paquetage pourra
vous être utile. 

Anatomie d'un document XML/SVG
--------------------------------------------------------------------------------

Un exemple de document SVG, [issu de la documentation Mozilla](https://developer.mozilla.org/fr/docs/Web/SVG/Tutoriel/Premiers_pas) :

    <svg version="1.1"
        baseProfile="full"
        xmlns="http://www.w3.org/2000/svg">
      <rect width="100%" height="100%" fill="red"/>
      <circle cx="150" cy="100" r="80" fill="green"/>
      <text x="150" y="125" font-size="60" text-anchor="middle" fill="white">SVG</text>
    </svg>

et des éléments de vocabulaire :

  - la racine du document est un élement XML de type (ou "tag") `svg` ;
    il est délimité par les balises ouvrantes `<svg ...>` et fermantes
    `</svg>`,

  - `version` est un attribut de cet élément ; sa valeur est la chaîne
    de caractères `"1.1"`,

  - l'élément `svg` a pour enfants trois éléments, de type `rect`, `circle`
    et `text` ; le rectangle et le cercle n'ont aucun contenu, 
    mais comme leur parent, ils ont des attributs. Dans le cas des
    éléments sans contenu (éléments ou texte), on peut si on le désire 
    remplacer les balises ouvrantes ET fermantes 
    
        <rect ...></rect>
    
    par une unique balise

        <rect ... />

  - l'élément de type `text` n'a pas non plus d'enfants (qui soient des
    éléments), mais il a un contenu de type texte : la chaîne de caractère 
    SVG.

Générer du XML avec le paquetage `xml`
--------------------------------------------------------------------------------

Pour afficher la chaîne de caractère associée à ce document, vous pouvez
après avoir importé les symboles

    import xml.Element;
    import static xml.Element.E;

définir la structure de donnée :

    Element svg = 
      E("svg")
        .attr("version", "1.1")
        .attr("baseProfile", "full")
        .attr("xmlns", "http://www.w3.org/2000/svg")
        .sub(
          E("rect")
            .attr("width", "100%")
            .attr("height", "100%")
            .attr("fill", "red"),
          E("circle")
            .attr("cs", "150")
            .attr("cy", "100")
            .attr("r", "80")
            .attr("fill", "red"),
          E("text")
            .attr("x", "150")
            .attr("y", "125")
            .attr("font-size", "60")
            .attr("text-anchor", "middle")
            .attr("fill", "red")
            .text("SVG")
    );

puis afficher le document XML au moyen de 

    System.out.println(svg);

ou si vous souhaitez une forme moins compacte, indentée de 2 espaces,

    System.out.println(svg.toString("  "));

