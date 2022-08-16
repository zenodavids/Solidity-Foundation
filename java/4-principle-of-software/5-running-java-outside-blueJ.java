/*
 * always start with the 'main()' method
 * use the 'try', 'catch' and 'finally' to catch errors
 * java.nio where the 'n' is for new, 'i' is input and 'o' is output
 * read a file in java using 'BufferedReader'
 *
 */

 //writing hello world from file and url in java
import java.net.URL;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.BufferedReader;
import java.nio.file.Files;
//imports

class HelloWorldRedux{

  // read from  local file method
  public void readAndPrint() throws IOException{
   Path p = Paths.get("hello.txt");
   BufferedReader reader = Files.newBufferedReader(p);
   while (true) {
    String line = reader.readLine();
    if(line == null) {
     break;
    }
    System.out.println(line);
   }
  }

 // read from  url method
  public void readAndPrintURL() throws IOException{
   URL source = new URL("https://dukelearntoprogram");
   BufferedReader reader = new BufferedReader(new InputStreamReader(source));
      while (true) {
    String line = reader.readLine();
    if(line == null) {
     break;
   }
   System.out.println(line);
  }
 }

 // used to call method that read from local file
public static void main(String[] args) throws IOException{
 HelloWorldRedux hwr = new HelloWorldRedux();
 hwr.readAndPrint ();

}
 // used to call method that read from url
public static void main(String[] args) throws IOException{
 HelloWorldRedux hwr = new HelloWorldRedux();
 hwr.readAndPrintURL();

}
}