import java.io.File;
import java.io.IOException;

public class DeleteFile {
 public static void main(String[] args) throws IOException {
  File file = new File("./java/DSA/bnmit.txt"); //manual bnmit.txt
 if(file.delete())
 {
  System.out.println("File " + file.getName()+ " deleted.");
 }
 else{
  System.out.println("File doesn't exist.");
 }
 }
}
