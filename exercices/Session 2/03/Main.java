import library.ByteConverter;

public class Main{
    public static void main(String[] args){
        System.out.println("Affichage des constantes");
        System.out.println(ByteConverter.megaByte);
        System.out.println(ByteConverter.gigaByte);
        System.out.println(ByteConverter.teraByte);

        System.out.println("Quelques tests");
        System.out.println(ByteConverter.megaBytesToBytes(1));
        System.out.println(ByteConverter.megaBytesToBytes(1_000));
        System.out.println(ByteConverter.megaBytesToBytes(1_000_000));

    }   
}