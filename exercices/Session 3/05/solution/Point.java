
class Point {
  private double x, y;
  Point(double x, double y) {
    this.x = x;
    this.y = y;
  }
  public double getX() {
    return x;
  }
  public double getY() {
    return y;
  }
  public String toString() {
    return "Point(" + x + ", " + y + ")";
  }
  double distance() {
    return Math.sqrt(x*x + y*y);
  }
}