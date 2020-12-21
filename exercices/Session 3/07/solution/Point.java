import java.util.Objects;

class Point {
  private double x;
  private double y;
  public Point(double x, double y) {
    this.x = x;
    this.y = y;
  }
  public double getX() {
    return this.x;
  }
  public double getY() {
    return this.y;
  }
  public boolean equals(Object object) {
    if (!(object instanceof Point)) {
        return false;
    }
    Point that = (Point) object;
    return (this.getX() == that.getX()) && (this.getY() == that.getY());
  }
  public int hashCode() {
    return Objects.hash(x, y);
  }
}