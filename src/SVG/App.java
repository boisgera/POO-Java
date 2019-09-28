public class App {
  public static void main(String[] args) {
    Circle circle = new Circle();
    Rectangle rectangle = new Rectangle();
    Node[] nodes = {circle, rectangle};
    SVG svg = new SVG(nodes);
    String filename = args[0];
    svg.export(filename);
  }
}