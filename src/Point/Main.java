class Main {
  public static void main(String[] arg) {
    Point point = new Point(1.0, 2.0);
    System.out.println(point);
    System.out.println(point.x);
    System.out.println(point.y);
    double distance = point.distance();
    System.out.println(distance);
  }
}
