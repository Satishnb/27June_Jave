package Day9;
// txt file: read particular line
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class txtRead1 {
	
	public void ReadData( int linenumber) throws IOException {
		File f = new File("/Users/Satish/Desktop/write.txt");
		FileReader fr= new FileReader(f);
		BufferedReader bf = new BufferedReader(fr);
		int line=0;
		boolean lineFound= true;
		String data ;
		while((data=bf.readLine())!=null) {
			line++;
			if(line==linenumber) {   //here is the logic for particular line
			System.out.println(data);
			lineFound= false;
			break;
			}
		}	
		if(lineFound=true) {
			System.out.println("entered line does not exist");
		}
	}
	
	public static void main(String[] args) throws IOException {
		txtRead1 read= new txtRead1();
		Scanner sc = new Scanner(System.in);
		for(int i=1; i<5;i++) {
		System.out.println("Enter line number to read data");
		read.ReadData(sc.nextInt());
		System.out.println();
		}
	}

}
