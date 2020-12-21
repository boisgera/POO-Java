import java.util.List;
class Main {
  static void addOneTwo(List<Integer> list) {
    list.add(1);
    list.add(2);
    System.out.println(list);
  }
  public static void main(String[] arg) {
    MyList list = new MyList();
    Main.addOneTwo(list);
  }
}
