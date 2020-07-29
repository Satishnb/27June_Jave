package Day9;
// txt file: read till line
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class txtRead3 {
	
	public void ReadData( int tillline) throws IOException {
		File f = new File("/Users/Satish/Desktop/write.txt");
		FileReader fr= new FileReader(f);
		BufferedReader bf = new BufferedReader(fr);
		int line=0;
		String data ;
		while((data=bf.readLine())!=null) {
			line++;
			if(line<=tillline) {   //here is the logic for till line read
			System.out.println(data);
			}
		}	
	}
	
	public static void main(String[] args) throws IOException {
		txtRead3 read= new txtRead3();
		Scanner sc = new Scanner(System.in);
		for(int i=1; i<5;i++) {
		System.out.println("Enter line number to read data");
		read.ReadData(sc.nextInt());
		System.out.println();
		}
	}

}
