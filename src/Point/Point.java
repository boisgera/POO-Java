
class Point {
  double x, y;
  Point(double x, double y) {
    this.x = x;
    this.y = y;
  }
  double distance() {
    return Math.sqrt(x*x + y*y);
  }
}