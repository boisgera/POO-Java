public class Color {
  public Integer R;
  public Integer G;
  public Integer B;

  public Color(int R, int G, int B) {
    this.R = Integer.valueOf(R);
    this.G = Integer.valueOf(G);
    this.B = Integer.valueOf(B);
  }

  public String toString() {
    return "rgb(" + R.toString() + ", " + G.toString() + ", " + B.toString() + ")";
  }
}