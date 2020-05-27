import java.util.ArrayList;
/**
 * Write a description of class Line here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Line extends Node implements OneDimensionNode,Cloneable,BoundingBox
{
     // Attributs
    private Color color ;
    private Double width ;
    private String style ;
    private Double x2,y2;
    
    
    private static int count = 0 ;
    public Line clone()
    {
        Object o = null ;
        //try{
            o = super.clone();
            ((Line)o).id = count ;
            count ++ ;
        //}catch(CloneNotSupportedException cnse){
        //}
        return (Line)o ;
    }

    public Line(double x1, double y1, double x2, double y2, Color color, Double width,String style)
    {
        this.id = count ;
        count ++ ;
        this.type = "line";
        this.x = x1;
        this.y = y1;
        this.x2 = x2 ;
        this.y2 = y2 ;
        this.color = color ;
        this.width = width ;
        this.style = style;
    }
    
    public Line(double x1, double y1, double x2, double y2, Color color, Double width)
    {
        this(x1,y1,x2,y2,color,width,null);
    }

    public Line(double x1, double y1, double x2, double y2,  Double width)
    {
        this(x1,y1,x2,y2,new Color(0,0,0),width,null);
    }
    
    public Line(double x1, double y1, double x2, double y2)
    {
        this(x1,y1,x2,y2,new Color(0,0,0),null,null);
    }
    
         
    public void scale(double factor)
    {
        this.x2 = x+(x2-x)*factor;
        this.y2 = y+(y2-y)*factor;
        if (width != null)
            width *=factor;
            
    }
    
    // Need to redefine moveTo, translate
    public void moveTo(double x, double y){
        double dx = this.x  - x ;
        double dy = this.y -  y ;
        translate(dx,dy);
    }
    
    public void translate(double x, double y){
        this.x += x ;
        this.x2 += x;
        this.y += y;
        this.y2 +=y;
    }
    
    
    public void rotate(double alphaDeg){
        double alpha = alphaDeg*Math.PI/180;
        double xtemp,ytemp;
        xtemp = x+ (x2-x)*Math.cos(alpha) - (y2-y)*Math.sin(alpha);
        ytemp = y + (x2-x)*Math.sin(alpha) + (y2-y)*Math.cos(alpha);
        this.x2 = xtemp ; this.y2 = ytemp;
    }
    
    public Element getXML(){
        ArrayList<String> k = new ArrayList<String>();
        ArrayList<String> v = new ArrayList<String>();

        k.add("x1") ; v.add(x.toString());
        k.add("y1") ; v.add(y.toString());
        k.add("x2") ; v.add(x2.toString());
        k.add("y2") ; v.add(y2.toString());

        
        if (color != null){
            k.add("stroke") ; v.add(color.toString());
        }
        
        if (width != null){
            k.add("stroke-width") ; v.add(width.toString());
        }
        
        if (style != null){
            k.add("stroke-dasharray") ; v.add(style);
        }
       
        
        String[][] attrib = getAttrib(k,v);
        
        return new Element("line",attrib);
    }
   
    
    public  void setBorderColor(Color color){
        this.color = color ;
    };
    
    public Color getBorderColor(){
        return this.color;
    }
    public void setBorderWidth(double width){
        this.width= width ;
    }
    
    public void setBorderStyle(String style){
        this.style = style ;
    }
    
    public double[] boundingBox(){
        double b ;
        if (this.color != null){
            if (this.width ==null)
                b = 1.0 ;   
            else
                b = this.width ;
        } else
            b = 0 ;
            
        double xMin, yMin, xMax, yMax ;
        xMin = Math.min(x,x2)-b/2; // Approx... 
        xMax = Math.max(x,x2)+b/2;
        yMin = Math.min(y,y2)-b/2;
        yMax = Math.max(y,y2)+b/2 ;
        double[] bBox = {xMin, yMin, xMax, yMax};
        return bBox ;
    }
}

