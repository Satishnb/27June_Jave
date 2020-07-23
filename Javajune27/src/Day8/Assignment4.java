package Day8; 
/*     1
       2 3
       4 5 6
       7 8 9 10
       
*/

public class Assignment4 {
	public static void main(String[] args) {
		
		int temp=1;
		for( int i=1;i<5; i++) {     //FIRST LOOP FOR NUMBER OF ROWS (which row)
			for(int j=1; j<=i;j++) {  //2ND LOOP FOR PRINTING VALUES  (how many time in a row)
				System.out.print(temp + " ");
				temp++;
			}
			System.out.println();

		}
	}

}
