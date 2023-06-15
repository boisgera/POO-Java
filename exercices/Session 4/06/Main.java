public class Main {
  public static void main(String[] args) {
     Square sq1 = new Square(1,1,2);
     System.out.println(sq1.getArea());
     System.out.println(sq1);
     sq1.translate(1,-4);
     System.out.println(sq1.getArea());
     System.out.println(sq1);

     Circle circ1 = new Circle(1,1,2);
     System.out.println(circ1.getArea());
     System.out.println(circ1);
     circ1.translate(1,-4);
     System.out.println(circ1.getArea());
     System.out.println(circ1);

    // ListShape list = new ListShape();
    // list.add(sq1) ; 
    // list.add(circ1) ;
    // list.printContent();
    // System.out.println(list.getTotalArea());
  }
}