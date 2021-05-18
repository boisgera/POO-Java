public class Square {
    double x,y ;
    double length ;

    Square(double x,double y,double length){
        this.x = x ;
        this.y = y ;
        this.length = length ;
    }

    public double getArea(){
        return length*length ;
    }

    public String toString(){
        return "Square: "+x+" , "+y+" , "+length; 
    }

    public void translate(double x,double y){
        this.x+=x ;
        this.y+=y ;
    }
    
}