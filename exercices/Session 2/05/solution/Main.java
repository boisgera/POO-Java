public class Main{
    public static void main(String[] args){
        double[] tab1= {1,5,3,4,6,3,5,1};
        double[] tab2 = new double[0]; // Tableau vide
        double max1 = TestArray.max(tab1);
        double max2 = TestArray.max(tab2);
        System.out.println(max1);
        System.out.println(max2);

    }   
}