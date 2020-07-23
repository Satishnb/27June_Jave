package Day6;

import java.util.Scanner;

public class Factorial {
	
	public void factorial(int num) {
		int i;
		for(i=num-1; i>=1;i--) {
			num=num*i;
		}
		System.out.println("Factorial of entered number is " + num + "\n" );
	}
	
	public static void main(String[] args) {
		Factorial f= new Factorial();
		Scanner sc = new Scanner(System.in);
		for(int i=0; i<5;i++) {
		System.out.println("Enter your number to find out the factorial ");
		f.factorial(sc.nextInt());
		}
	}

}
