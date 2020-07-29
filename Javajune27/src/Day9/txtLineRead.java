package Day9;
// read txt file line by linr
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class txtLineRead {
	public void lineRead(String filename) throws IOException {
		File f = new File(filename);
		FileReader fr = new FileReader(f);
		BufferedReader bf = new BufferedReader(fr);  //BuffereredReader class for line reading
		String data;
		while((data=bf.readLine())!=null) {         //readLine() method will return string and null reach at end of file
			System.out.println(data);

		}
		
	}
	public static void main(String[] args) throws IOException {
		txtLineRead read= new txtLineRead();
		read.lineRead("/Users/Satish/Desktop/write.txt");
	}

}
