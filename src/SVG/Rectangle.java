public class Rectangle extends Node
{
    // Attributs
    private double x;
    private double y;
    private double rx;
    private double ry;
    private double height;
    private double width;

    public Rectangle(double x, double y, double height, double width, double rx, double ry, String style)
    {
        this.x = x;
        this.y = y;
        this.height = height;
        this.width = width;
        this.rx = rx;
        this.ry = ry;
        this.style = style;
    }
    
    public Rectangle()
    {
        this(0.0, 0.0, 1.0, 1.0, 0.0, 0.0, "");
    }

    public void moveTo(double x, double y)
    {
        this.x = x;
        this.y = y;
    }
    
    public void translate(double dx, double dy)
    {
        this.x += dx;
        this.y += dy;
    }
    
        
    public void scale(double factor)
    {
        this.height *= factor;
        this.width  *= factor;
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
                + (new Double(this.ry)).toString() + "\" " 
                +  "style=\"" + this.style + "\" "
                + "/>";
    }
}
