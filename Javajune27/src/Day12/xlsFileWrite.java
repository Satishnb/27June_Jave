package Day12;
// xls write into file
import java.io.File;
import java.io.IOException;

import jxl.Workbook;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;
import jxl.write.biff.RowsExceededException;

public class xlsFileWrite {
	public static void main(String[] args) throws IOException, RowsExceededException, WriteException {
		File f = new File("../Javajune27/writeoutput.xls");
		WritableWorkbook wk= Workbook.createWorkbook(f); //use createWorkbook() method of workbook class and it will return obj of writableworkbook class
		WritableSheet ws= wk.createSheet("Sheet1", 0);  // user createSheet method. here sheet1 is sheet name and 0 is the place means at first sheet in workbook
	   
		for(int i=0; i<3; i++) {   // for row...which row
		   for(int j=0; j<3; j++) {     // for column. which column
			   Label l= new Label(j, i, "grover");   //label for defining the cell structure
			   ws.addCell(l);   // add cell to sheet
		   }
	   }
	   wk.write();   // for saving the file
	   wk.close();   // for closing the file
	}

}
