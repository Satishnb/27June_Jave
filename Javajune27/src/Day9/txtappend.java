package Day9;
// txt file: append data into existing file
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class txtappend {
	public void append() throws IOException {
		File f = new File("/Users/Satish/Desktop/write.txt");
		FileWriter fw = new FileWriter(f,true);           // true for file append
		BufferedWriter bf = new BufferedWriter(fw);
		bf.newLine();                               // first move cursor with new line. if empty file then remove newline
		bf.append("I am from fatehabad");          // append() can take staring or charsequence and can be null
		bf.newLine();
		bf.write("State Haryana");                 // write() can't be null and only accept string
		bf.close();
	}
	public static void main(String[] args) throws IOException {
		txtappend a= new txtappend();
		a.append();
	}

}
