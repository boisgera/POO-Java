import java.lang.Math;
import java.lang.NullPointerException;
import java.util.Arrays;

public class Color {
  private final Integer R;
  private final Integer G;
  private final Integer B;

  
  public Color(String hexString) {
    if (hexString==null)
        throw new NullPointerException("C'est nul");
    else if (hexString.length() != 7)
        throw new IllegalArgumentException("hexString should have 7 caracters");
    else if (hexString.charAt(0) != '#')
        throw new IllegalArgumentException("hexString shoud start with '#'");
    else {
      try{
        this.R = Integer.decode("0x"+hexString.substring(1,3));
        this.G = Integer.decode("0x"+hexString.substring(3,5));
        this.B = Integer.decode("0x"+hexString.substring(5,7));
      }catch(NumberFormatException e){
        throw new IllegalArgumentException("hexString should contain only caracters 0-9, A-F and a-f");
      }
    }
  }


  public Color(int R, int G, int B) {
    this.R = Math.min(255, Math.max(R, 0));
    this.G = Math.min(255, Math.max(G, 0));
    this.B = Math.min(255, Math.max(B, 0));
  }

  public static String channelToHex(Integer integer) {
    String string = Integer.toHexString(integer);
    if (string.length() == 1) {
      string = "0" + string;
    }
    return string;
  }
  
  public String toHexString() {
      return "#" + channelToHex(this.R) + channelToHex(this.G) + channelToHex(this.B);
  }

  public String toString() {
    return "rgb(" + R.toString() + ", " + G.toString() + ", " + B.toString() + ")";
  }
  
  public Color blackAndWhite(){
      double intensity = 0.3*R + 0.59*G + 0.11*B ;
      int approxInt = (int)(Math.floor(intensity));
      return new Color(approxInt,approxInt,approxInt);
  }
  
  public Color reverse(){
      return new Color(255-this.R,255-this.G,255-this.B);
  }
  
}