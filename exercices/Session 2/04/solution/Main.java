public class Main{
    public static void main(String[] args){
        String sIn = "Cher PRENOM NOM, vous avez réussi avec succès cet exercice sur les chaînes de caractères.";
        String prenom = "Darth" ;
        String nom = "Vader";
        String sOut = TestString.replaceName(sIn,prenom,nom);
        System.out.println(sOut);
    }   
}