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

    ColorAlpha red = new ColorAlpha(255,0,0);
    ColorAlpha red50 = new ColorAlpha(255,0,0,.50);
    ColorAlpha red70 = new ColorAlpha(255,0,0,.70);

    red.printAlpha() ;
    red50.printAlpha();
    red70.printAlpha();
    
    svg = template.replace("${COLOR}", red.toString());
    writeTo("red.svg", svg);
    
    svg = template.replace("${COLOR}", red50.toString());
    writeTo("red50.svg", svg);
    
    svg = template.replace("${COLOR}", red70.toString());
    writeTo("red70.svg", svg);

  }

}