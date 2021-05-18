class Main {
  public static void main(String[] args) {
     Point point = new Point(1.0, 2.0);
     double x = point.getX();
     double y = point.getY();
     point.setPrintStream(System.out);
     point.setDebug(true);
     x = point.getX();
     y = point.getY();
  }
}