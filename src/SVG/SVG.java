public class SVG implements XML {

  private Node[] nodes;

  public SVG(Node[] nodes)
  {
      this.nodes = nodes;
  }
  
  public void export(String filename) {
    File.write(filename, this.toXML());
  }

  public String toXML() {
    String output;

    output = "<svg version=\"1.1\" " +
    "baseProfile=\"full\" " +
    "viewBox= \"-1 -1 2 2 \" width=\"2\" height=\"2\" " +
    "xmlns=\"http://www.w3.org/2000/svg\">";

    for (Node node: this.nodes) {
      output += node.toXML();
    }

    output += "</svg>";
    return output;
  }
}