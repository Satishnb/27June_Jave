package Day12;
// xls write into particular row column 
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import jxl.Workbook;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;
import jxl.write.biff.RowsExceededException;

public class xlsFileWrite1 {
	 public void fileWrite(int row, int column) throws RowsExceededException, WriteException, IOException {
		 File f = new File("../Javajune27/writeintofile.xls");
			WritableWorkbook wk= Workbook.createWorkbook(f); //use createWorkbook() method of workbook class and it will return obj of writableworkbook class
			WritableSheet ws= wk.createSheet("Sheet1", 0);  // user createSheet method. here sheet1 is sheet name and 0 is the place means at first sheet in workbook
	        Scanner sc = new Scanner(System.in);
	        System.out.println("enter input value");
	        String data = sc.nextLine();
	   	    Label l= new Label(column,row, data);   //label for defining the cell structure
		    ws.addCell(l);   // add cell to sheet
		    wk.write();   // for saving the file
		    wk.close();   // for closing the file
		}
	 
	public static void main(String[] args) throws IOException, RowsExceededException, WriteException {
		xlsFileWrite1 x1= new xlsFileWrite1();
		Scanner sc = new Scanner(System.in);
		System.out.println("enter particular cell number to write data");
		x1.fileWrite(sc.nextInt(),sc.nextInt() );
	}
}
