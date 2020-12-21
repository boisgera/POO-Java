import java.lang.Math;
import java.lang.NullPointerException;
import java.util.Arrays;

public class ColorAlpha extends Color {
  private Double alpha ; 

  public ColorAlpha(int R, int G, int B) {
    super(R,G,B);
    this.alpha = 1. ;
  }

  public ColorAlpha(int R, int G, int B,double alpha) {
    super(R,G,B);
    this.alpha = alpha ;
  }

  public ColorAlpha(String hexString){
      super(hexString.substring(0,7));
      if (hexString.length() !=9){
        throw new IllegalArgumentException("invalid : hexString should have a length of 9.");
      }

    Integer alphaInt ;
    try{
      alphaInt= Integer.parseInt(hexString.substring(7, 9), 16);
    }catch(NumberFormatException e){
      throw new IllegalArgumentException("invalid character in hexString.");
    }
    this.alpha = alphaInt/255.0 ;
  }

  public static String alphaToHex(Double alpha) {
    if (alpha >1)
      alpha = 1. ;
    if (alpha <0)
      alpha = 0. ;
    Integer integer = Math.round(alpha.floatValue()*255);
    // Math.round renvoie un entier long si son argument est double
    // Du coup, on force une valeur float (--> Math.round renverra un int)
    // Sinon, erreur de compilation
    return Color.channelToHex(integer);
  }

  public void printAlpha(){
    System.out.println(alpha);
  }

  public String toString(){
    String s = super.toString() ;
    s = s.replace(")",","+alpha.toString()+")");
    return s;
  }

  public String toHexString(){
    String s = super.toHexString();
    s = s+alphaToHex(alpha);
    return s;
  }
}