package Day12;
// read PARTICULAR CELL DATA from xls
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;



public class xlsParticularCellRead1 {
	
	public void readLine(int row, int column) throws BiffException, IOException
	{
		File f = new File("../Javajune27/filexls.xls");
		Workbook wb = Workbook.getWorkbook(f);
		Sheet ws= wb.getSheet(0);
		int r1= ws.getRows();
		int c1=ws.getColumns();
		int r = row;
		int c = column;
		
		for(int i=0; i<r1;i++) {
			for(int j=0;j<c1;j++) {
				Cell cell = ws.getCell(j,i);
				if(i==r && j==c) {           // read particular cell data only
					System.out.println(cell.getContents());
					
				}
			}
		}
		wb.close();
		
	}
	
	public static void main(String[] args) throws BiffException, IOException {
		xlsParticularCellRead1 rl = new xlsParticularCellRead1();
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter value of particular row column");
		rl.readLine(s1.nextInt(), s1.nextInt());
		
		
	}
	

}
