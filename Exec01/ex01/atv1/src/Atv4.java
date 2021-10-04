import java.io.*;
import java.nio.file.*;


// Outro exemplo para atividade3
public class Atv4 {
  
  public static void main(String[] args){
    String inputFile = args[0];
    String outputFile = args[1];
 
    try {
        long start = System.currentTimeMillis();

        byte[] allBytes = Files.readAllBytes(Paths.get("../../../"+inputFile));
        Files.write(Paths.get(outputFile), allBytes);

        long end = System.currentTimeMillis();
        System.out.println("Copied in " + (end - start) + " ms");
    } catch (IOException ex) {
        ex.printStackTrace();
    }
 
  }
}
