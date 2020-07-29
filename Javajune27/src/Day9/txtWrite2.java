package Day9;
// txt file: write for a range
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class txtWrite2 {
	
	public void write(int initialline, int lastline) throws IOException {
		File f = new File("/Users/Satish/Desktop/writeintoFile.txt"); //create new txt file if doesnot exist already
		FileWriter fw = new FileWriter(f);  //FileWriter class to write into txt file
		BufferedWriter bf = new BufferedWriter(fw);
		Scanner sc = new Scanner(System.in);
		int line=0;
		for(int i=1; i<=lastline;i++) {
			line++;
			if(line>=initialline&&line<=lastline)
				bf.write(sc.nextLine());  //use write method to write
		        bf.newLine();
		}
		
		bf.close(); //close file is mandatory
		
	}
	public static void main(String[] args) throws IOException {
		txtWrite2 w = new txtWrite2();
		Scanner sc = new Scanner(System.in);
		for(int i=1; i<4;i++) {
		System.out.println("enter the initial line and end line");
		w.write(sc.nextInt(),sc.nextInt());
		}
		
	}

}
