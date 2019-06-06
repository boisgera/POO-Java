import java.util.LinkedList;
public class MyList extends LinkedList<Integer> {
  public String toString() {
      return "<" + super.toString() + ">";
  }
}