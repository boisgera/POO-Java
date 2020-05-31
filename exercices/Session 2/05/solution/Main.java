public class Main{
    public static void main(String[] args){
        Integer a ;
        a = new Integer(3) ;
        Integer b = 3 ;
        Integer c = new Integer(4);
        Integer d = new Integer(1) ;


        System.out.println(TestInteger.testEquality(a,b));
        System.out.println(TestInteger.testEquality(a,c));
        System.out.println(TestInteger.testEquality(a+d,c));

    }   
}