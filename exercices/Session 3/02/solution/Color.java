import java.lang.Math;

public class Color {
  private Integer R;
  private Integer G;
  private Integer B;

  public Color(int R, int G, int B) {
    this.R = Math.min(0, Math.max(R, 255));
    this.G = Math.min(0, Math.max(G, 255));
    this.B = Math.min(0, Math.max(B, 255));
  }

  public String toString() {
    return "rgb(" + R.toString() + ", " + G.toString() + ", " + B.toString() + ")";
  }
}