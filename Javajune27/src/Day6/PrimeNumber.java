package Day6;
// prime/ non prime -- using for loop
import java.util.Scanner;

public class PrimeNumber {
	
	public void checkPrime(int num) {
		
		if (num > 1) {
			if (num == 2) {
				System.out.println("2 is prime number");
			} else {
				for (int i = 2; i <= num / 2; i++) {
					if (num % i == 0) {
						System.out.println("Number is not prime"+ "\n");
						return;

					}

				}
				System.out.println("prime number"+ "\n");
			}
			
		} else {
			System.out.println("enter correct number"+"\n");
		}
		
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		PrimeNumber obj = new PrimeNumber();
		for(int i=1; i<6; i++) {
		System.out.println("enter your number");
		obj.checkPrime(sc.nextInt());
		}	;
		
	}

}
