package Day9;
// txt file: read data for a range
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class txtRead2 {
	
	public void ReadData( int intitialLine, int lastLine) throws IOException {
		File f = new File("/Users/Satish/Desktop/write.txt");
		FileReader fr= new FileReader(f);
		BufferedReader bf = new BufferedReader(fr);
		int line=0;
		String data ;
		while((data=bf.readLine())!=null) {
			line++;
			if((line>=intitialLine)&&(line<=lastLine)) {  //here is the logic for particular lines
			System.out.println(data);
			}
		}
		
	}
	
	public static void main(String[] args) throws IOException {
		txtRead2 read= new txtRead2();
		Scanner sc = new Scanner(System.in);
		for(int i=1; i<5;i++) {
		System.out.println("Enter intioal and last to read data");
		read.ReadData(sc.nextInt(),sc.nextInt());
		System.out.println();
		}
	}

}
