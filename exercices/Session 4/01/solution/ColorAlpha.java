public class ColorAlpha extends Color {
  private Double alpha ; 

  public ColorAlpha(int R, int G, int B) {
    super(R,G,B);
    this.alpha = 1. ;
  }

  public ColorAlpha(int R, int G, int B,double alpha) {
    super(R,G,B);
    this.alpha = alpha ;
  }

  public void printAlpha(){
    System.out.println(alpha);
  }
}