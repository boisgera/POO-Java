abstract class Node implements XML {
  protected String style;

  abstract public void moveTo(double x, double y);
  abstract public void translate(double dx, double dy);
  abstract public void scale(double factor);

}