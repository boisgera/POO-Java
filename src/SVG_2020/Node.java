import java.util.HashMap;
import java.util.ArrayList ;

/**
 * Write a description of class Noeud here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public abstract class Node implements Cloneable
{
    public Node clone()
    {
        Object o = null ;
        try{
            o = super.clone();
        }catch(CloneNotSupportedException cnse){
        }
        return (Node)o ;
    }
    
    public static void blackAndWhite(OneDimensionNode node){
        if (node.getBorderColor()!=null)
            node.setBorderColor(node.getBorderColor().blackAndWhite());
    }
    
    public static void blackAndWhite(TwoDimensionsNode node){
        if (node.getFillingColor() != null)
            node.setFillingColor(node.getFillingColor().blackAndWhite());
        blackAndWhite((OneDimensionNode)node);
    }
    
    public static void reverseColor(OneDimensionNode node){
        if (node.getBorderColor() != null)
            node.setBorderColor(node.getBorderColor().blackAndWhite());
    }
    
    public static void reverseColor(TwoDimensionsNode node){
        if (node.getFillingColor() != null)
            node.setFillingColor(node.getFillingColor().reverse());
        reverseColor((OneDimensionNode)node);
    }
    
    protected static String[][] getAttrib(ArrayList<String> k,ArrayList<String> v){
        int s = k.size();
        String[][] attrib = new String[s][2] ;
        for (int i=0;i<s;i++){
            attrib[i][0] = k.get(i);
            attrib[i][1] = v.get(i);
        }
        return attrib ;
        
    }
    
    protected Double x ; // For svg nodes, (x,y) represents the coordinates of the top left point of the viewport.
    protected Double y ;
    protected Integer id ;
    protected String type ; 
   
    
    public void moveTo(double x, double y){
        this.x = x ;
        this.y = y ;
    }
    
    public void translate(double x, double y){
        this.x += x ;
        this.y += y;
    }
   
    public String toString(){
        return "This is "+type+" "+ id.toString();
    }
    
    //abstract void rotate(double theta) ;
    //abstract Double[] computeBoundingBox ;
    abstract Element getXML();
}
