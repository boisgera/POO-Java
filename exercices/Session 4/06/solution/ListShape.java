import java.util.ArrayList;
public class ListShape{

    private ArrayList<Shape> list ;

    public ListShape(){
        list = new ArrayList<Shape>();
    }

    public void add(Shape shape){
        list.add(shape);
    }

    public void translate(double x,double y){
        for (int i=0 ; i<list.size();i++){
            list.get(i).translate(x,y);
        }
    }
    public void printContent(){
        for (int i=0 ; i<list.size();i++){
            System.out.println(list.get(i).toString());
        } 
    }

    public double getTotalArea(){
        double area = 0 ;
        for (int i=0 ; i<list.size();i++){
            area += list.get(i).getArea();
        }
        return area ;
    }
}