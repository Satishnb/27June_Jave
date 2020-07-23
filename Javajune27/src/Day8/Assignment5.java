package Day8; 
/*         *
          **
         ***
        ****
       *****
*/

public class Assignment5 {
	public static void main(String[] args) {
		
		for( int i=1;i<=5; i++) {       //FIRST LOOP FOR NUMBER OF ROWS (which row)
			for(int k=1;k<=5-i;k++)    // how many spaces (total row - current row)
			{  
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++) {    //will help how many times to print in a row
				System.out.print("*");	
			}
			System.out.println();
		}
		}
	}


