package Day6;
// Prime/Non prime - handling invalid number and 2 using return
// if we use break the 
import java.util.Scanner;

public class checkPrime {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number to check prime/ not prime");
		int num = sc.nextInt();
		if (num > 1) {
			if (num == 2) {
				System.out.println("2 is prime number");
			} else {
				for (int i = 2; i <= num / 2; i++) {
					if (num % i == 0) {
						System.out.println("Number is not prime");
						return;

					}

				}
				System.out.println("prime number");
			}
			
		} else {
			System.out.println("enter correct number");
		}
	}
}
