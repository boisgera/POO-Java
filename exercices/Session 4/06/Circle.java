public class Circle{
    double x,y ;
    double radius ;

    Circle(double x,double y,double radius){
        this.x = x ;
        this.y = y ;
        this.radius = radius ;
    }

    public double getArea(){
        return radius*radius*Math.PI ;
    }

    public String toString(){
        return "Circle: "+x+" , "+y+" , "+radius; 
    }

    public void translate(double x,double y){
        this.x+=x ;
        this.y+=y ;
    }
    
}