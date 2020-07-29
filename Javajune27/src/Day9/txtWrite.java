package Day9;
// txt file: write into empty txt file (\n for next line)
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class txtWrite {
	
	public void write() throws IOException {
		File f = new File("/Users/Satish/Desktop/writeFilenew.txt"); //create new txt file if doesnot exist already
		FileWriter fw = new FileWriter(f);              //FileWriter class to write into txt file
		fw.write("Hi All \n");                         //use write method to write
		fw.write("Welcome to the nearbuy family \n");
		fw.write("Hope you all are doing well");
		fw.close(); //close file is mandatory
		
	}
	public static void main(String[] args) throws IOException {
		txtWrite w = new txtWrite();
		Scanner sc = new Scanner(System.in);
		w.write();
		
		
	}

}
