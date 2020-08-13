package Day12;
// read particular row
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class xlsReadRow {
	
	public void readRow(int row) throws BiffException, IOException {
		File f= new File("../Javajune27/filexls.xls");
		Workbook wk = Workbook.getWorkbook(f);
		Sheet ws= wk.getSheet(0);
		int column= ws.getColumns();
		for(int j=0; j<column;j++) {
			Cell c= ws.getCell(j, row);
			System.out.print(c.getContents()+ "\t");
			
		}
		System.out.println();
		wk.close();
		
		
	}
	public static void main(String[] args) throws BiffException, IOException {
		Scanner sc = new Scanner(System.in);
		xlsReadRow rr = new xlsReadRow();
		System.out.println("Enter row number:");
		rr.readRow(sc.nextInt());
	}

}
