import java.lang.Math;
import java.lang.NullPointerException;
import java.util.Arrays;

public class Color {
  private Integer R;
  private Integer G;
  private Integer B;

  public Color(int R, int G, int B) {
    this.R = Math.min(255, Math.max(R, 0));
    this.G = Math.min(255, Math.max(G, 0));
    this.B = Math.min(255, Math.max(B, 0));
  }

  public Color(String hexString) {
    if (hexString == null) {
      throw new NullPointerException();
    } else if (hexString.length() != 7) {
      throw new IllegalArgumentException("invalid : hexString should have a length of 7.");
    } else if (hexString.charAt(0) != '#') {
      throw new IllegalArgumentException("invalid : hexString should start with a '#'.");
    } else {
      hexString = hexString.toLowerCase();
      for (int i=1; i <= 6; i++) {
        if ("0123456789abcdef".indexOf(hexString.charAt(i)) == -1) {
          throw new IllegalArgumentException("invalid character in hexString.");
        }
      }
    }
    R = Integer.parseInt(hexString.substring(1, 3), 16);
    G = Integer.parseInt(hexString.substring(3, 5), 16);
    B = Integer.parseInt(hexString.substring(5, 7), 16);
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
}