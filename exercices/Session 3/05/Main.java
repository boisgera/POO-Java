class Main {
  public static void main(String[] arg) {
    Point point = new Point(1.0, 2.0);
    System.out.println(point);
    System.out.println(point.getX());
    System.out.println(point.getY());
    double distance = point.distance();
    System.out.println(distance);
  }
}
