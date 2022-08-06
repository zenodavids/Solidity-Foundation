// this opens a file and prints out every line in the file
import edu.duke.*;

public class HelloWorld {

	public void runHello () {
		FileResource res = new FileResource("hello_unicode.txt");
		for (String line : res.lines()) {
		// loop through the file
			System.out.println(line);
		}
	}
}
