public class Main {
  public static void main(String[] args) {
      Point point1 = new Point(1.0, 2.0);
      Point point2 = new Point(1.0, 2.0);
      System.out.println(point1.getX() == point2.getX());
      System.out.println(point1.getY() == point2.getY());
      System.out.println(point1 == point2);
      System.out.println(point1.equals(point2));
  }
}