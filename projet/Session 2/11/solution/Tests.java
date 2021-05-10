
import library.ByteConverter;

public class Tests {

    public static void main(String[] args) {
        boolean status = ByteConverter.megaBytesToBytes(1_000_000)==ByteConverter.teraByte;
        if (!status) {
            System.err.println("Mauvaise conversion pour un million de Mo");
            throw new AssertionError();
        }
    }
}
