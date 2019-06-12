public class Point {
  double x, y;
  public Point(double x, double y) {
    this.x = x;
    this.y = y;
  }
  public double distance() {
    return Math.sqrt(x*x + y*y);
  }
}
