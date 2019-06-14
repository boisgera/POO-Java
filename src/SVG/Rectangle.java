
/**
 * Write a description of class Rectangle here.
 *
 * @author 3MS5T
 * @version 3.14
 */
public class Rectangle
{
    // Attributs
    private double x;
    private double y;
    private double rx;
    private double ry;
    private double height;
    private double width;
    private String style;


    public Rectangle(double x, double y, double haut, double larg, double arrondiX, double arrondiY)
    {
        System.out.println("Constructeur complet");
        this.x = x;
        this.y = y;
        this.rx = arrondiX;
        this.ry = arrondiY;
        this.height = haut;
        this.width = larg;
        this.style = "fill:red;";
    }
    
    public Rectangle(double x, double y, double haut, double larg)
    {
        System.out.println("Constructeur partiel");
        this.x = x;
        this.y = y;
        this.rx = 0.0;
        this.ry = 0.0;
        this.height = haut;
        this.width = larg;
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
        this.height *= facteur;
        this.width  *= facteur;
    }
    
    public double[] boundingBox()
    {
        double tab[] = {this.x,
                        this.y,
                        this.x + this.width,
                        this.y + this.height};
        return tab;
    }
    
    public String toString()
    {
        return  "Rectangle : ("
                + (new Double(this.x)).toString()
                + " , "
                + (new Double(this.y)).toString()
                + ")  hauteur : "
                + (new Double(this.height)).toString()
                + "  largeur : "
                + (new Double(this.width)).toString();
    }
    
    public String toXML()
    {
        return "<rect x=\""
                + (new Double(this.x)).toString()
                + "\" y=\""
                + (new Double(this.y)).toString()
                + "\" width=\""
                + (new Double(this.width)).toString()
                + "\" height=\""
                + (new Double(this.height)).toString()
                + "\" rx=\""
                + (new Double(this.rx)).toString()
                + "\" ry=\""
                + (new Double(this.ry)).toString()
                + "\" />";
    }
}
