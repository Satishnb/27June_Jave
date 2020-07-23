package Day6;
//Number is Prime or not
import java.util.Scanner;

public class primeExample {
	public static void main(String[] args) {
		boolean flag= false;
		System.out.println("Enter a number");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
				for(int i=2; i<num/2; i++) {
					if(num%i==0) {
						flag=true;
						break;
					}
				}
		if(flag==true) {
			System.out.println("Given number is not prime ");
		}
		else {
			System.out.println("Given number is  prime ");
		}
			
	}

}
