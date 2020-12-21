
import library.TestFraction;

public class Tests {

    public static void main(String[] args) {
        boolean status = TestFraction.f==TestFraction.f2;
        if (!status) {
            System.err.println("f2 n'est pas égal à 1.5 !");
            throw new AssertionError();
        }
    }
}