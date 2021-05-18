public class TestString {
    // Définir la fonction "replaceName"
    // Ne pas oublier les mots clés "public static" devant la signature de la fonction.

   public static String replaceName(String in,String fstName, String lstName){
       return in.replace("PRENOM",fstName).replace("NOM",lstName);
   }
}