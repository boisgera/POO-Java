
import library.ByteConverter;

public class Tests {

    public static void main(String[] args) {
        boolean status = ByteConverter.teraByte2==ByteConverter.teraByte;
        if (!status) {
            System.err.println("teraByte2 n'est pas à la bonne valeur");
            throw new AssertionError();
        }
    }
}