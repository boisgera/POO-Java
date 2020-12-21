
import library.Message;

public class Tests {

    public static void main(String[] args) {
        boolean status = Message.content.equals("Hello world!");
        if (!status) {
            System.err.println("Message.content invalide: " + Message.content);
            throw new AssertionError();
        }
    }
}