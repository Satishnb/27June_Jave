package Day9;
// read write line by line
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class txtReadWrite2 {
	
	public void readWrite() throws IOException {
		File f1= new File("/Users/Satish/Desktop/write.txt");
		File f2= new File("/Users/Satish/Desktop/writeFilenew.txt");
		FileReader fr = new FileReader(f1);
		FileWriter fw = new FileWriter(f2);
		BufferedReader br= new BufferedReader(fr);
		BufferedWriter bw= new BufferedWriter(fw);
		String data;
		while((data=br.readLine())!=null)
		{
			
			fw.write(data);
		}
		br.close();
		bw.close();
		
	}
	public static void main(String[] args) throws IOException {
		txtReadWrite2 txt = new txtReadWrite2();
		txt.readWrite();
	}

}
