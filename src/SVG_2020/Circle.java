import java.util.ArrayList ;

public class Circle extends Node implements TwoDimensionsNode,Cloneable,BoundingBox
{
    // Attributs
    private Double r;
    private Color fillingColor ;
    private Double alpha ;
    private Color borderColor ;
    private Double borderWidth ;
    private String borderStyle ;
    
    private static int count = 0 ;
    public Circle clone()
    {
        Object o = null ;
        //try{
            o = super.clone();
            ((Circle)o).id = count ;
            count ++ ;
        //}catch(CloneNotSupportedException cnse){
        //}
        return (Circle)o ;
    }

    public Circle(double x, double y, double r, Color fillingColor, Double alpha, Color borderColor, Double borderWidth,String borderStyle)
    {
        this.id = count ;
        count ++ ;
        this.type = "circle";
        this.x = x;
        this.y = y;
        this.r = r;
        this.fillingColor = fillingColor ;
        this.alpha = alpha ;
        this.borderColor = borderColor ;
        this.borderWidth = borderWidth ;
        this.borderStyle = borderStyle;
    }

    public Circle(double x, double y, double r, Color fillingColor, double alpha, Color borderColor, double borderWidth){
        this(x,y,r,fillingColor,alpha,borderColor,borderWidth,null);        
    }

    public Circle(double x, double y, double r, Color fillingColor, double alpha, Color borderColor){
        this(x,y,r,fillingColor,alpha,borderColor,null,null);
    }

    public Circle(double x, double y, double r, Color fillingColor, double alpha){
        this(x,y,r,fillingColor,alpha,null,null,null);
    }

    public Circle(double x, double y, double r, Color fillingColor){
        this(x,y,r,fillingColor,null,null,null,null);
    }
    
    public Circle(double x, double y, double r){
        this(x,y,r,null,null,null,null,null);
    }
        
        
    public void scale(double factor)
    {
        this.r *= factor;
        if (borderWidth != null)
            borderWidth *=factor;
            
    }
        
    
    public Element getXML(){
        ArrayList<String> k = new ArrayList<String>();
        ArrayList<String> v = new ArrayList<String>();

        k.add("cx") ; v.add(x.toString());
        k.add("cy") ; v.add(y.toString());
        k.add("r") ; v.add(r.toString());
        
        
        if (fillingColor != null){
            k.add("fill") ; v.add(fillingColor.toString());
        }
        
        if (alpha != null){
            k.add("fill-opacity") ; v.add(alpha.toString());
            if  ((borderColor != null) || (borderWidth != null)) 
                k.add("stroke-opacity"); v.add(alpha.toString());
        }
        
        if (borderColor != null){
            k.add("stroke") ; v.add(borderColor.toString());
        }
        
        if (borderWidth != null){
            k.add("stroke-width") ; v.add(borderWidth.toString());
        }
        
        if (borderStyle != null){
            k.add("stroke-dasharray") ; v.add(borderStyle);
        }
       
        
        String[][] attrib = getAttrib(k,v);
        
        return new Element("circle",attrib);
    }
    
    public void setFillingColor(Color color){
        this.fillingColor = color ;
    }
    
    public Color getFillingColor(){
        return fillingColor ;
    }
    
    public void setTransparency(double alpha){
        this.alpha = alpha;
    }
    
    public  void setBorderColor(Color color){
        this.borderColor = color ;
    };
    
    public Color getBorderColor(){
        return borderColor;
    }
    public void setBorderWidth(double width){
        this.borderWidth = width ;
    }
    
    public void setBorderStyle(String style){
        this.borderStyle = style ;
    }
    
    public double[] boundingBox(){
        double b ;
        if (this.borderColor != null){
            if (this.borderWidth ==null)
                b = 1.0 ;   
            else
                b = this.borderWidth ;
        } else
            b = 0 ;
            
        double xMin, yMin, xMax, yMax ;
        xMin = x-r-b/2 ; 
        xMax = x+r+b/2 ;
        yMin = y-r-b/2 ;
        yMax = y+r+b/2 ;
        double[] bBox = {xMin, yMin, xMax, yMax};
        return bBox ;
    }
}

