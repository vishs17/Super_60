import java.io.File;


public class CreateFolder {
 public static void main(String[] args) {
  //Absolute Path -> Root directory
  File folder = new File("C:\\Users\\Student\\Desktop\\1BG22IS042\\File_handling\\java\\DSA"); //manual DSA
  if (folder.mkdir()){
   System.out.println("Folder " + folder.getName() + " created. ");
  }else{
   System.out.println("Folder already exist");
  }
 }
}
