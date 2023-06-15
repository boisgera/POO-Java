import java.util.Map;
import java.util.HashMap;
import java.util.ArrayList ;
public class Rectangle extends Node  implements TwoDimensionsNode,Cloneable,BoundingBox
{
    // Attributs
    private Double x;
    private Double y;
    private Double rx;
    private Double ry;
    private Double height;
    private Double width;
    private Color fillingColor ;
    private Color borderColor ;
    private Double alpha ; 
    private Double borderWidth ;
    private String borderStyle ;
    private Double theta;
    


    private ArrayList<String> k,v ;
    
    private static int count = 0 ; // To count the number of Rectangle we create ;
    private static String angle2transform(Double theta){
        return "rotate("+ theta.toString() + ")";
    } 
    
    public Rectangle clone()
    {
        Object o = null ;
        //try{
            o = super.clone();
            ((Rectangle)o).id = count ;
            count ++ ;
        //}catch(CloneNotSupportedException cnse){
        //}
        return (Rectangle)o ;
    }
    
    public Rectangle(double x, double y, double height, double width, Double rx, Double ry, Color fillingColor, Double alpha, Color borderColor, Double borderWidth,String borderStyle)
    {
        this.type = "rectangle";
        this.id = count ;
        count ++ ;
        
        this.x = x ;
        this.y = y ;
        this.height = height ;
        this.width = width ;
        this.rx = rx ;
        this.ry = ry ;
        this.fillingColor = fillingColor ;
        this.alpha = alpha ;
        this.borderColor = borderColor ;
        this.borderWidth = borderWidth ;
        this.borderStyle = borderStyle ;
        this.theta = null ;
        
    }
    
    public Rectangle(double x, double y, double height, double width, double rx, double ry, Color fillingColor, double alpha, Color borderColor, double borderWidth){
        this(x,y,height,width,rx,ry,fillingColor,alpha,borderColor,borderWidth,null);
        
    }

    public Rectangle(double x, double y, double height, double width, double rx, double ry, Color fillingColor, double alpha, Color borderColor){
        this(x,y,height,width,rx,ry,fillingColor,alpha,borderColor,null,null);
    }

    public Rectangle(double x, double y, double height, double width, double rx, double ry, Color fillingColor, double alpha){
        this(x,y,height,width,rx,ry,fillingColor,alpha,null,null,null);
    }

    public Rectangle(double x, double y, double height, double width, double rx, double ry, Color fillingColor){
        this(x,y,height,width,rx,ry,fillingColor,null,null,null,null);
    }
    
    public Rectangle(double x, double y, double height, double width, double rx, double ry){
        this(x,y,height,width,rx,ry,null,null,null,null,null);
    }
    
    public Rectangle(double x, double y, double height, double width){
        this(x,y,height,width,null,null,null,null,null,null,null);
    }
    
    public Rectangle(double x, double y, double height, double width, Color fillingColor){
        this(x,y,height,width,null,null,fillingColor,null,null,null,null);
    }
    
    public Rectangle(double x, double y, double height, double width, Color fillingColor,Color borderColor){
        this(x,y,height,width,null,null,fillingColor,null,borderColor,null,null);
    }
    
    public Rectangle(double x, double y, double width){
        //Make a square
        this(x,y,width,width,null,null,null,null,null,null,null);
    }
    
    public void rotate(double theta){
        if (this.theta == null){
            this.theta = theta ;
        }
        else{
            this.theta +=theta ;
        }
    }
        
    public void scale(double factor)
    {
        height *= factor ;
        width  *= factor;
        
        if (borderWidth != null)
            borderWidth *=factor;
            
        // Scaling on stroke appears iif a borderWidth is explicitely existing. If we have a border color without its width, border width is not adjusted.
          
    }
        
   
    public Element getXML(){
        k = new ArrayList<String>();
        v = new ArrayList<String>();

        k.add("x") ; v.add(x.toString());
        k.add("y") ; v.add(y.toString());
        k.add("height") ; v.add(height.toString());
        k.add("width") ;  v.add(width.toString());
        if (rx !=null){
            k.add("rx") ; v.add(rx.toString());
            k.add("ry") ; v.add(ry.toString());
        }
        
        if (fillingColor != null){
            k.add("fill") ; v.add(fillingColor.toString());
        }
        
        if (alpha != null){
            k.add("fill-opacity") ; v.add(alpha.toString());
            if  ((borderColor != null) || (borderWidth != null)){ 
                k.add("stroke-opacity"); v.add(alpha.toString());
            }
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
       
        if (theta != null){
            k.add("transform") ; v.add(angle2transform(theta));   
        }

        String[][] attrib = getAttrib(k,v);
        
        return new Element("rect",attrib);
    }
    
    public void setFillingColor(Color color){
       this.fillingColor = color ;
    }
    
    public Color getFillingColor(){
        return this.fillingColor ;
    }
    
    public void setTransparency(double alpha){
        this.alpha = alpha ;
    }
    
   
    
    public void setBorderColor(Color color){
       this.borderColor = color ;
       
    }
    
    public Color getBorderColor(){
        return this.borderColor ;
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
            
        double x1,y1,x2,y2,x3,y3,x4,y4 ;
        x1 = x - b/2 ; y1 = y - b/2 ;
        x2 = (x+width)+b/2 ; y2 = y1 ;
        x3 = x2 ; y3 = y + height + b/2 ;
        x4 = x1 ; y4 = y3 ;
        
        double angle;
        if (this.theta==null)
            angle = 0 ;
        else
            angle = this.theta*Math.PI/180 ;
        
        double x1b,y1b,x2b,y2b,x3b,y3b,x4b,y4b ; // Coordinates after rotation
        x1b = x1 ; y1b = y1 ;
        
        x2b = x1 + (x2-x1)*Math.cos(angle)-(y2-y1)*Math.sin(angle);
        y2b = y1 + (x2-x1)*Math.sin(angle)+(y2-y1)*Math.cos(angle);
        
        x3b = x1 + (x3-x1)*Math.cos(angle)-(y3-y1)*Math.sin(angle);
        y3b = y1 + (x3-x1)*Math.sin(angle)+(y3-y1)*Math.cos(angle);
        
        x4b = x1 + (x4-x1)*Math.cos(angle)-(y4-y1)*Math.sin(angle);
        y4b = y1 + (x4-x1)*Math.sin(angle)+(y4-y1)*Math.cos(angle);

        double xMin,yMin,xMax,yMax;
        xMin = Math.min(Math.min(Math.min(x1b,x2b),x3b),x4b);
        yMin = Math.min(Math.min(Math.min(y1b,y2b),y3b),y4b);
        xMax = Math.max(Math.max(Math.max(x1b,x2b),x3b),x4b);
        yMax = Math.max(Math.max(Math.max(y1b,y2b),y3b),y4b);

        double[] bBox = {xMin,yMin,xMax,yMax};    
        return bBox;
            
        
    }
    
}
