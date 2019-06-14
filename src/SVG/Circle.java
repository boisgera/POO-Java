
/**
 * Write a description of class Circle here.
 *
 * @author 3MS5T
 * @version 3.14
 */
public class Circle
{
    // Attributs
    private double x;
    private double y;
    private double r;
    private String style;


    
    public Circle(double x, double y, double r)
    {
        System.out.println("Constructeur partiel");
        this.x = x;
        this.y = y;
        this.r=r;
        this.style = "fill:red;";
    }

    public void moveTo(double nouveauX, double nouveauY)
    {
        this.x = nouveauX;
        this.y = nouveauY;
    }
    
    public void translate(double bougerX, double bougerY)
    {
        this.x += bougerX; // this.x = this.x + bougerX ;
        this.y += bougerY;
    }
    
        
    public void scale(double facteur)
    {
        this.r *= facteur;
    }
    
    public double[] boundingBox()
    {
        double tab[] = {this.x-r,
                        this.y-r,
                        this.x + r,
                        this.y + r};
        return tab;
    }
    
    public String toString()
    {
        return  "Circle : ("
                + (new Double(this.x)).toString()
                + " , "
                + (new Double(this.y)).toString()
                + ")  rayon : "
                + (new Double(this.r)).toString();
    }
    
    public String toXML()
    {
        return "<circ cx=\""
                + (new Double(this.x)).toString()
                + "\" cy=\""
                + (new Double(this.y)).toString()
                + "\" r=\""
                + (new Double(this.r)).toString()
                + "\" />";
    }
}
