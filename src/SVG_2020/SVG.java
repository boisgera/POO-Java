import java.util.ArrayList;
/**
 * Write a description of class SVG here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class SVG extends Node implements Cloneable
{
    // instance variables - replace the example below with your own
    private Double width;
    private Double height;
    ArrayList<Node> nodeList ;
    private static int count = 0 ;
    

    public SVG clone()
    {
        Object o = null ;
        SVG o_svg = null ;
        //try{
            o = super.clone();
            o_svg = (SVG)o ;
            o_svg.id = count ;
            count ++;
            ArrayList<Node> newNodeList =new ArrayList<Node>();
            for (int i=0 ; i < this.nodeList.size(); i++){
                newNodeList.add(this.nodeList.get(i).clone());
            }
            o_svg.nodeList = newNodeList;
        //}catch(CloneNotSupportedException cnse){
        //}
        return o_svg ;
    }
    
    
    
    /**
     * Constructor for objects of class SVG
     */
    public SVG(Double x,Double y,Double width, Double height,ArrayList<Node> list)
    {
        this.id = count ;
        count ++ ;
        this.type = "svg";
        
        if (x != null){
            this.x = x ;
            this.y = y;
        }else{
            this.x = 0. ;
            this.y = 0. ;
        }
        if (width != null){
            this.width = width ;
            this.height = height ;
        }
        
        else{
            this.width = 100.0 ;
            this.height = 100.0 ;
        }
        if (list != null)
            this.nodeList = list ;
        else
            this.nodeList = new ArrayList<Node>();
    }
    
    public SVG(Double x,Double y,Double width, Double height){
        this(x,y,width,height,null);
    }
    
    public SVG(Double width,Double height,ArrayList<Node> list){
        this(null,null,width,height,list);
    }
    
    public SVG(Double width, Double height){
        this(width,height,null);
    }
    public SVG(ArrayList<Node> list){
        this(null,null,list);   
    }
    
    public SVG(){
        this(null);
    }
    
    public void set_xy(double x, double y){
        this.x = x ; 
        this.y = y ;
    }
    
    public void set_wh(double w, double h){
        this.width = w ;
        this.height = h ;
    }

    public void addNode(Node node){
        nodeList.add(node) ;
    }
    
    public void removeNode(){
        int s = nodeList.size();
        if (s>0)
            nodeList.remove(s-1);
        else
            System.out.println("No node to remeove");
    }
    
    public void removeNode(int i){
        int s = nodeList.size();
        if (i<0)
            System.out.println("Index has to be greater or equal to zero");
        else if (i>=s)
            System.out.println("Index "+i+" does not exist");
        else
            nodeList.remove(i);
    }
    
    public void export(String filename) {
        File.write(filename, this.getXML().toString("    "));
    }    
    
    private String viewBox(){
        String xs = x.toString();
        String ys = y.toString();
        String ws = width.toString();
        String hs = height.toString();
        String sp = " " ;
        return xs+sp+ys+sp+ws+sp+hs;
    }
    
    public Element getXML()
    {
        int s = nodeList.size();
        Element[] children = new Element[s] ;
        for (int i=0 ; i< s ; i++){
            children[i] = nodeList.get(i).getXML();
        }
        
        ArrayList<String> k = new ArrayList<String>();
        ArrayList<String> v = new ArrayList<String>();
        
        k.add("version") ; v.add("1.1") ;
        //k.add("baseProfile") ; v.add("full");
        k.add("viewBox") ; v.add(this.viewBox());
        //k.add("width") ; v.add(this.width.toString());
        //k.add("height") ; v.add(this.height.toString());
        k.add("xmlns")  ; v.add("http://www.w3.org/2000/svg");
        
        // provide a default widht / height that makes the SVG 600 px width for default zooming.
        String widthPx = "600px";
        Double h = this.height*600/this.width ;
        String heightPx = h.toString()+"px";
        k.add("width") ; v.add(widthPx);
        k.add("height") ; v.add(heightPx);
        
        
        
        String[][] attrib = getAttrib(k,v);
       
        return new Element("svg",children,attrib);
    }
    
    public void blackAndWhite(){
        for (int i=0 ; i< nodeList.size();i++){
            Node n = nodeList.get(i);
            if (n instanceof TwoDimensionsNode){
                Node.blackAndWhite((TwoDimensionsNode)n);
            }else if (n instanceof OneDimensionNode){
                Node.blackAndWhite((OneDimensionNode)n);
            }
            else{
                System.out.println("Warning, cannot make "+n.toString()+" to B&W");
            }
        }
    }
    
    public void autoViewPort(){
        double[] bBox = null ; 
        for (int i=0 ; i<nodeList.size();i++){
            Node n = nodeList.get(i);
            if (n instanceof BoundingBox){
                double[] bBoxCurr = ((BoundingBox)n).boundingBox();
                if (bBox==null)
                    bBox = bBoxCurr ;
                else{
                    bBox[0] = Math.min(bBox[0],bBoxCurr[0]);
                    bBox[1] = Math.min(bBox[1],bBoxCurr[1]);
                    bBox[2] = Math.max(bBox[2],bBoxCurr[2]);
                    bBox[3] = Math.max(bBox[3],bBoxCurr[3]);
                    System.out.println(bBox[0]);
                    System.out.println(bBox[1]);
                    System.out.println(bBox[2]);
                    System.out.println(bBox[3]);
                    System.out.println(n.toString());
                }
            }
            else
                System.out.println("Warning: cannot get bounding box of "+n.toString()+": only (x,y) is used; result may be inaccurate");            
        }
        if (bBox != null){
            set_xy(bBox[0],bBox[1]);
            set_wh(bBox[2]-bBox[0],bBox[3]-bBox[1]);
        }
    }
}
