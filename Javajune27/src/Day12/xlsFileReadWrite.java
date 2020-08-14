package Day12;
// read dtata from one file and write into another file
import java.io.File;
import java.io.IOException;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;
import jxl.write.biff.RowsExceededException;

public class xlsFileReadWrite {
	
	public static void main(String[] args) throws BiffException, IOException, RowsExceededException, WriteException {
		File f1= new File("../Javajune27/filexls.xls");
		File f2= new File("../Javajune27/filewriteintoxls.xls");
		
		Workbook wk =Workbook.getWorkbook(f1); 
		Sheet ws=wk.getSheet(0); 
		
		int row= ws.getRows();               
	    int column= ws.getColumns(); 
		
		WritableWorkbook wwk= Workbook.createWorkbook(f2);
		WritableSheet wws= wwk.createSheet("Sheet1", 0);
	                  
	           
	   for (int i=0; i<row; i++) {         
		  for(int j=0; j<column;j++) {    
			   Cell c= ws.getCell(j, i);   
		       String data= c.getContents();
		       Label l= new Label(j,i,data);
		       wws.addCell(l);
		  }
		  System.out.println();
	   }
	   wwk.write();
	 wwk.close();
	}
	

}
