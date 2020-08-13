package Day12;
// read PARTICULAR CELL DATA from xls
import java.io.File;
import java.io.IOException;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class xlsParticularCellRead {
	
	public static void main(String[] args) throws BiffException, IOException {
		File f= new File("../Javajune27/filexls.xls");
		Workbook wk =Workbook.getWorkbook(f);   // use static method getWorkbook()to get the workbook, it will return object of Workbook class
	    Sheet ws=wk.getSheet(0);   //get the worksheet using workbook obj and getSheet() method
	    int row= ws.getRows();   //will return last row in which data is present
	    int coloumn= ws.getColumns(); // will return last column in which data is present
	   
			   Cell c= ws.getCell(0, 1);   //read 0th column n 1st row
		       String data= c.getContents();
		       System.out.print(data);
		       wk.close();
		  
	}
	
	

}
