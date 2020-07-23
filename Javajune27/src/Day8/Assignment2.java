package Day8; 
/*     *****
       ****
       ***
       **
       *
*/

public class Assignment2 {
	public static void main(String[] args) {
		
		for( int i=1;i<=5; i++) {     //FIRST LOOP FOR NUMBER OF ROWS (which row)
			for(int j=5; j>=i;j--) {  //2ND LOOP FOR PRINTING VALUES  (how many time in a row)
				System.out.print("*");
			}
			System.out.println();

		}
	}

}
