public class Circle extends Shape{
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
}