public class Grade {
    // Définir la fonction "gradeLetter"
    // Ne pas oublier les mots clés "public static" devant la signature de la fonction.

    public static String gradeToLetter(double grade){
        if (grade >= 16){
            return "A";
        } // Les accolades sont inutiles si il n'y a qu'une seule instruction.
        // Elles seront omises pour les cas suivants.
        else if (grade >=14)
            return "B";
        else if (grade >= 11)
            return "C";
        else if (grade >= 8)
            return "D";
        else if (grade >=5)
            return "E";
        else return "F";
    }
}