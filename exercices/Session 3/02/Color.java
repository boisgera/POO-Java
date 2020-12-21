import java.lang.Math;

public class Color {
  public Integer R;
  public Integer G;
  public Integer B;

  public Color(int R, int G, int B) {
    this.R = R;
    this.G = G;
    this.B = B;
  }

  public String toString() {
    return "rgb(" + R.toString() + ", " + G.toString() + ", " + B.toString() + ")";
  }
}