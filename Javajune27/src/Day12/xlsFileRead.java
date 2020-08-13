package Day12;
// read dtata from xls
import java.io.File;
import java.io.IOException;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class xlsFileRead {
	
	public static void main(String[] args) throws BiffException, IOException {
		File f= new File("../Javajune27/filexls.xls");
		Workbook wk =Workbook.getWorkbook(f);   // use static method getWorkbook()to get the workbook, it will return object of Workbook class
	    Sheet ws=wk.getSheet(0);               //get the worksheet using workbook obj and getSheet() method
	    int row= ws.getRows();               //will return last row in which data is present
	    int column= ws.getColumns();        // will return last column in which data is present
	   for (int i=0; i<row; i++) {         // for row
		  for(int j=0; j<column;j++) {    // for column
			   Cell c= ws.getCell(j, i);   //get cell from sheet(first column then row)
		       String data= c.getContents();
		       System.out.print(data + " ");
		  }
		  System.out.println();
	   }
	 wk.close();
	}
	

}
