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