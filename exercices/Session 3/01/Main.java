// import java.io.File;
import java.io.IOException;
import java.nio.file.Paths;
import java.nio.file.Path;
import java.nio.file.Files;

public class Main {
  public static String template = "<?xml version='1.0' encoding='UTF-8' standalone='no'?>\n" +
    "<svg xmlns='http://www.w3.org/2000/svg' height='100' width='100' viewBox='0 0 100 100'>\n" +
    "  <rect y='0' x='0' height='100' width='100' style='fill:${COLOR}'>\n"+
    "  </rect>\n"+
    "</svg>";  

  public static void writeTo(String filename, String content) {
    Path path = Paths.get(filename);
    byte[] strToBytes = content.getBytes();
    try {
      Files.write(path, strToBytes);
    } catch(IOException error) {
      System.err.println("Erreur d'écriture");
    } 
  }

  public static void main(String[] args) {
    String svg;

    Color red = new Color(255, 0, 0);
    Color green = new Color(0, 255, 0);
    Color blue = new Color(0, 0, 255);

    svg = template.replace("${COLOR}", red.toString());
    writeTo("red.svg", svg);
    
    svg = template.replace("${COLOR}", green.toString());
    writeTo("green.svg", svg);
    
    svg = template.replace("${COLOR}", blue.toString());
    writeTo("blue.svg", svg);
  }

}