import java.util.Objects;

class Disque extends Point {
  private double r;

  public Disque(double x,double y){
    super(x,y) ;
    this.r = 0 ;
  }

  public Disque(double x,double y,double r){
    super(x,y) ;
    this.r = r ;
  }

  public double getR() {
    return this.r;
  }
  public boolean equals(Object object) {
    if (object.getClass() != this.getClass()) {
        return false;
    }
    Disque that = (Disque) object;
    return (this.getX() == that.getX()) && (this.getY() == that.getY() && this.getR() == that.getR());
  }
  public int hashCode() {
    return Objects.hash(getX(),getY(),r);
  }
}