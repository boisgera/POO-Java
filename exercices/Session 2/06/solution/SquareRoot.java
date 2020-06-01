public class SquareRoot {
    public static void printResult(double x){
        if (x>=0 && x != 1){
          double y = Math.sqrt(x)/(x-1);
          System.out.println(y);
        }else
          System.out.println("Résultat non calculable");
    }
}