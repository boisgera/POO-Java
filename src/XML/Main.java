import xml.Element;

public class Main {
  public static void main(String[] args) {
    String[][] metaAttrib = {{"charset", "utf-8"}};
    Element meta = new Element("meta", metaAttrib);
    Element[] headChildren = {meta};
    Element head = new Element("head", headChildren);

    Element body = new Element("body", "content with \"quotes\" & other stuff.");
    Element[] children = {head, body};
    Element html = new Element("html", children);

    System.out.println(html);
    System.out.println();
    System.out.println(html.toString(" "));
  }
}