import java.io.File;
import java.io.IOException;

public class CreateFile {
 public static void main(String[] args) throws IOException {
  File file = new File("./java/DSA/bnmit.txt"); //manual bnmit.txt
 if(file.createNewFile())
 {
  System.out.println("File " + file.getName()+ " created.");
 }
 else{
  System.out.println("Failed to create the file.");
 }
 }
}
