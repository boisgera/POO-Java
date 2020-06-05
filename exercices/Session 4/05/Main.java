public class Main {
  public static void main(String[] args) {
      Point point1 = new Point(1.0, 2.0);
      Point point2 = new Point(1.0, 3.0);
      Disque disque1 = new Disque(1.0, 2.0);
      Disque disque2 = new Disque(1.0, 2.0,3.0);
      Disque disque3 = new Disque(1.0, 2.0,3.0);


      System.out.println(point1.equals(point2));
      System.out.println(disque1.equals(disque2));
      System.out.println(disque2.equals(disque3));

      System.out.println(point1.equals(disque1));
      System.out.println(disque1.equals(point1));

      System.out.println(point2.equals(disque1));
      System.out.println(disque1.equals(point2));

  }
}