import library.ByteConverter;

public class Main{
    public static void main(String[] args){
        System.out.println("Affichage des constantes intiales");
        System.out.println(ByteConverter.megaByte);
        System.out.println(ByteConverter.gigaByte);
        System.out.println(ByteConverter.teraByte);

        System.out.println("Une nouvelle constante");
        System.out.println(ByteConverter.teraByte2);
    }   
}