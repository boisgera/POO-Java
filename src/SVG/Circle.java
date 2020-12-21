public class Circle extends Node
{
    // Attributs
    private double cx;
    private double cy;
    private double r;

    public Circle(double cx, double cy, double r, String style)
    {
        this.cx = cx;
        this.cy = cy;
        this.r = r;
        this.style = style;
    }

    public Circle(double cx, double cy, double r)
    {
        this(cx, cy, r, "");
    }

    public Circle(double cx, double cy)
    {
        this(cx, cy, 1.0);
    }

    public Circle() 
    {
        this(0.0, 0.0);
    }

    public void moveTo(double x, double y)
    {
        this.cx = x;
        this.cy = y;
    }
    
    public void translate(double dx, double dy)
    {
        this.moveTo(this.cx + dx, this.cy + dy);
    }
    
        
    public void scale(double factor)
    {
        this.r *= factor;
    }
        
    public String toString()
    {
        return "Circle(" + this.cx + ","
                         + this.cy + "," 
                         + this.r + ","
                         + "\"" + this.style + "\"" 
                         + ")";
    }
    
    public String toXML()
    {
        return "<circle " 
                 + "cx=\"" + this.cx + "\" "
                 + "cy=\"" + this.cy + "\" "
                 + "r=\"" + this.r + "\" "
                 + "style=\"" + this.style + "\" "
                 + "/>";
    }
}
