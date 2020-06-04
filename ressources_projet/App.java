public class App {
    public static void main(String[] args) {
        
        String filename = "sortie.svg"; // Le nom de votre fichier de sortie
        
        // Étape 1 (exemple pour un rectangle, mais vous pouvez faire autre chose)
      
        double x,y,width,height ;
        x =10. ; y = 3. ; width = 10. ; height = 5. ; // À personnaliser !
        Rectangle rect = new Rectangle(x,y,width,height) ; 
        
        System.out.println(rect) ; // Pas obligatoire
        // redéfinir toString() pour que le rectangle puisse "se présenter" de façon lisible 
        // pour un humain peut être utile pour débugger.

        // Ces deux lignes doivent toujours être à la fin du fichier
        String xmlRectangle = rect.toXML();
        File.write(filename, xmlRectangle); // Permet de sauvegarder votre xml
        

        /*
        //--------------------------------------------------------
        // Étape 2 
        // Ajouter quelques propriétés (ex. : couleurRemplissage, couleurContour)

        Color couleurRemplissage, couleurContour ; // Vous pouvez aussi utiliser ColorAlpha !!!
        Color rectColor = rect.getCouleurRemplissage() ; 
        Color nouvelleCouleurRemplissage = new Color(255,255,0);
        rect.changeRemplissage(nouvelleCouleurRemplissage) ; // Une façon possible de gérer la couleur

        //---------------------------------------------------------
        // Étape 3
        //
        // Implémenter une autre primitive sur un modèle similaire
        //
        //---------------------------------------------------------
        // Étape 4
        //
        // Faire des dessins avec plusieurs primitives 
        // 
        // toXML() des précédentes primitives ne peut plus retourner le XML global
        //
        // Idée : prévoir une classe SVG capable de conduire une liste de primitives
        //        son "toXML()" renverra le SVG global en appelant le toXML() des objets à afficher
        //
        // --------------------------------------------------------
        // Étape 5
        //
        // Si ce n'est déjà fait, se poser la question de factoriser le code grâce à l'héritage et les interfaces
        
        */




      

    }
  }