import java.lang.System;

public class Main {
  public static void main(String[] args) {
    Point point = new Point(1.0, 2.0);
    JSON json = point;
    System.out.println(json.toJSONString());
  }
}