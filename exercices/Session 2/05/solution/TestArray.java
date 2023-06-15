public class TestArray {
    // Définir la fonction "replaceName"
    // Ne pas oublier les mots clés "public static" devant la signature de la fonction.

    public static double max(double[] tab){
        double M = Double.NEGATIVE_INFINITY;
        for (int i=0 ; i<tab.length;i++){
            if (tab[i]>M)
                M = tab[i];
        }
        return M ;
    }
}