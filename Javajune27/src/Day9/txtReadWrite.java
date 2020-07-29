package Day9;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class txtReadWrite {
	
	public void readWrite() throws IOException {
		File f1= new File("/Users/Satish/Desktop/write.txt");
		File f2= new File("/Users/Satish/Desktop/writeFilenew.txt");
		FileReader fr = new FileReader(f1);
		FileWriter fw = new FileWriter(f2);
		int data;
		while((data=fr.read())!=-1)
		{
			int c= (char) data;
			fw.write(c);
		}
		fw.close();
	}
	public static void main(String[] args) throws IOException {
		txtReadWrite txt = new txtReadWrite();
		txt.readWrite();
	}

}
