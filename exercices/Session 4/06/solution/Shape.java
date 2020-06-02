public abstract class Shape{
    protected double x ;
    protected double y ;

    public void translate(double x,double y){
        this.x+=x ;
        this.y+=y ;
    }
    
    public abstract double getArea();
}