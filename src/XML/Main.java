import xml.Element;
import static xml.Element.E;

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
    System.out.println(html.toString("  "));

    Element root = E("html").sub(
      E("head").sub(
        E("meta").attr("charset", "utf-8")
      ),
      E("body").sub(
        E("p").text("content with \"quotes\" & other stuff."),
        E("p").text("another paragraph with").sub(
          E("b").text("bold statements !").tail(" indeed.")
        )
      )
    );
    
    System.out.println(root);
    System.out.println();
    System.out.println(root.toString("  "));
    System.out.println();

    Element svg = 
      E("svg")
        .attr("version", "1.1")
        .attr("baseProfile", "full")
        .attr("xmlns", "http://www.w3.org/2000/svg")
        .sub(
          E("rect")
            .attr("width", "100%")
            .attr("height", "100%")
            .attr("fill", "red"),
          E("circle")
            .attr("cs", "150")
            .attr("cy", "100")
            .attr("r", "80")
            .attr("fill", "red"),
          E("text")
            .attr("x", "150")
            .attr("y", "125")
            .attr("font-size", "60")
            .attr("text-anchor", "middle")
            .attr("fill", "red")
            .text("SVG")
    );

    System.out.println(svg);
    System.out.println();
    System.out.println(svg.toString("  "));
    System.out.println();

  }

}