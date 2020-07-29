package Day9;
//txt file: write into empty txt file till line (using newLine() method for next line)
// use nextLine() instead of next() of scanner class for multi word string in a single line
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class txtWrite1 {
	
	public void write() throws IOException {
		File f = new File("/Users/Satish/Desktop/writeFile1.txt");
		FileWriter fw = new FileWriter(f);            //FileWriter class to write into txt file
		BufferedWriter bf = new BufferedWriter(fw);
		Scanner sc =new Scanner(System.in);          //System.out.println("Enter value to write into file");
		System.out.println("Enter the till line count");
		int tillline= sc.nextInt();
		Scanner s =new Scanner(System.in);         //use another scanner for input otherwise it consider enter as first input in first line
		for(int i=1; i<=tillline; i++) {
		bf.write(s.nextLine());                  //use nextLine() instead of next() for multi world string in a line
		bf.newLine();                           // newLine() method for new line
		}
		bf.close();
	}
	public static void main(String[] args) throws IOException {
		txtWrite1 w = new txtWrite1();
		Scanner sc = new Scanner(System.in);
		w.write();
		
		
	}

}
