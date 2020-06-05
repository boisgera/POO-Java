import java.io.*;

public class File {
  public static void write(String filename, String text) {
    try {
      FileWriter fileWriter = new FileWriter(filename);
      fileWriter.write(text);
      fileWriter.close();
    } catch (IOException error) {
      throw new RuntimeException("IOException");
    }
  }
}