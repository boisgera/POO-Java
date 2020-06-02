public class Tests {

    public static void main(String[] args) {
        Integer a ;
        a = new Integer(3) ;
        Integer b = 3 ;
        Integer c = new Integer(4);
        Integer d = new Integer(1) ;

        boolean status1 = TestInteger.testEquality(a,b);
        boolean status2 = !TestInteger.testEquality(a,c); // a et c sont bien différents
        boolean status3 = !TestInteger.testEquality(a+d,c);


        if (!status1 || !status2 || status3) {
            System.err.println("Un (au moins) des trois tests a échoué !");
            throw new AssertionError();
        }
    }
}