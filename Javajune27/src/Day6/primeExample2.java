package Day6;
//Number is Prime or not included 2 handeled
import java.util.Scanner;

public class primeExample2 {
	public static void main(String[] args) {
		boolean flag= false;
		System.out.println("Enter a number");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
				for(int i=2; i<num/2; i++) {
					if(num%i==0) {
						flag=true;
						System.out.println();
						System.out.println("Given number is not prime ");
						break;
					}
				}
		if(flag==false) 
			System.out.println("Given number is  prime ");
		
			
	}

}
