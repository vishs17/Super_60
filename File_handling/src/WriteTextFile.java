import java.io.FileWriter;
import java.io.IOException;

public class WriteTextFile {
 public static void main(String[] args) throws IOException {

  FileWriter write = new FileWriter("./java/DSA/bnmit.txt",true);
  write.append("\nhi");
  write.close();
  System.out.println("Successfully wrote the data into file");
 }
}
