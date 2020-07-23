package Day8; 
/*     1
       12
       123
       1234
       12345
*/

public class Assignment1 {
	public static void main(String[] args) {
		
		for( int i=1;i<=5; i++) {     //FIRST LOOP FOR NUMBER OF ROWS (Which row)
			for(int j=1; j<=i;j++) {  //2ND LOOP FOR PRINTING VALUES  (How many time in a row)
				System.out.print(j);
			}
			System.out.println();

		}
	}

}
