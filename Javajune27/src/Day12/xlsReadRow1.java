package Day12;
// read particular row data for given range
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class xlsReadRow1 {
	
	public void readRow(int rowinitial, int rowend) throws BiffException, IOException {
		File f= new File("../Javajune27/filexls.xls");
		Workbook wk = Workbook.getWorkbook(f);
		Sheet ws= wk.getSheet(0);
		int columns= ws.getColumns();
		int rows = ws.getRows();
		for (int i=rowinitial; i<=rowend; i++) {
		     for(int j=0; j<columns;j++) {
			Cell c= ws.getCell(j, i);
			System.out.print(c.getContents()+" \t");
		}
		     System.out.println();
		}
		
	}
	public static void main(String[] args) throws BiffException, IOException {
		Scanner sc = new Scanner(System.in);
		xlsReadRow1 rr = new xlsReadRow1();
		System.out.println("Enter initial row and end row number:");
		rr.readRow(sc.nextInt(), sc.nextInt());
	}

}
