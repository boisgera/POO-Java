public class Square extends Shape{
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
}