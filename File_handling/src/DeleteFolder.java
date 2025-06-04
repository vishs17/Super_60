import java.io.File;


public class DeleteFolder {
 public static void main(String[] args) {
  //Relative Path -> Root directory
  File folder = new File("C:\\Users\\Student\\Desktop\\1BG22IS042\\File_handling\\java\\DSA"); //manual DSA
  if (folder.delete()){
   System.out.println("Folder " + folder.getName() + " deleted. ");
  }else{
   System.out.println("Folder doesn't exist");
  }
 }
}
