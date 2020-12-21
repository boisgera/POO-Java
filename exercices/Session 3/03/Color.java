import java.lang.Math;

public class Color {
  private Integer R;
  private Integer G;
  private Integer B;

  public Color(int R, int G, int B) {
    this.R = Math.min(255, Math.max(R, 0));
    this.G = Math.min(255, Math.max(G, 0));
    this.B = Math.min(255, Math.max(B, 0));
  }

  public String toHexString() {
      return null;
  }

  public String toString() {
    return "rgb(" + R.toString() + ", " + G.toString() + ", " + B.toString() + ")";
  }
}