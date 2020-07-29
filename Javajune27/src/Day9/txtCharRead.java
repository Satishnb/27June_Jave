package Day9;
// read txt file char by char
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FilterReader;
import java.io.IOException;

public class txtCharRead {
	
	public void charRead(String filename) throws IOException {
		File f= new File(filename);              //first create file connection using file class
		FileReader fr = new FileReader(f);      //File Reader class for char by char reading
		int data;
		while((data=fr.read())!=-1) {          //read method will return int and -1 on end of the file
			char c= (char)(data);            // convert int to char value
			System.out.print(c);
		}	
	}
	
	public static void main(String[] args) throws IOException {
		
		txtCharRead read = new txtCharRead();
		read.charRead("/Users/Satish/Desktop/write.txt");
	}

}
