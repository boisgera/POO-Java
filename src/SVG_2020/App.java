import java.util.ArrayList;

public class App {
  public static void main(String[] args) {
   
    // args is juste the basename for the filmename.
    // It will produce 3 different svg output.
      
      
    Circle circle = new Circle(5,5,1);
    Circle circle2 = new Circle(5,2.5,1);

    Rectangle rectangle = new Rectangle(0,0,10,20);
    rectangle.rotate(45);
    ArrayList<Node> nodes = new ArrayList<Node>();
    nodes.add(rectangle);
    rectangle.setTransparency(0.1);
    nodes.add(circle);
    nodes.add(circle2);
    Color red = new Color(255,0,0);
    Color blue = new Color(0,0,255);

    circle.setFillingColor(red);
    circle2.setFillingColor(red);
    circle2.setBorderColor(blue);
    circle2.setBorderWidth(0.2);
    Circle circle3 = circle2.clone(); 
    circle3.translate(3,0);
    Node.blackAndWhite(circle3);
    nodes.add(circle3);
    
    Circle circle4 = circle.clone(); 
    circle4.translate(3,0); // Can check that circle is not affected
    Node.reverseColor(circle4); 
    nodes.add(circle4);
    
    Circle circle5 = new Circle (0,0,3);
    nodes.add(circle5);
    
    Line line1 = new Line(5,10,7,15);
    Line line2 = line1.clone();
    line2.translate(3,0);
    line2.rotate(90) ;
    Color green = new Color("#00FF00");
    line2.setBorderColor(green);
    line2.setBorderWidth(.1);
    nodes.add(line1);
    nodes.add(line2);
    
    
    nodes.remove(0);
    nodes.add(rectangle); // To put the rectangle on the top
    
    
    SVG svg = new SVG(0.,0.,20.,20.,nodes);
    
    System.out.println(rectangle);
    System.out.println(circle);
    System.out.println(circle2);
    System.out.println(circle3);    
    System.out.println(circle4);    
    System.out.println(svg);
    
    SVG svg2 = svg.clone();
    svg2.blackAndWhite();
    
    SVG svg3 = svg.clone();
    svg3.autoViewPort();
    String basename = args[0];
    
    String filename1 = basename + ".svg";
    String filename2 = basename + "bw.svg";
    String filename3 = basename + "auto_vp.svg";

    svg.export(filename1);
    svg2.export(filename2);
    svg3.export(filename3);

  }
}