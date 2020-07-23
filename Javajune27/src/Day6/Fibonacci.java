package Day6;

import java.util.Scanner;

public class Fibonacci {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int upto = sc.nextInt();
		int num1= 0;
		int num2=1;
		for(int i=0; i<10;i++) {
			  /* On each iteration, we are assigning second number
             * to the first number and assigning the sum of last two
             * numbers to the second number
             */
			
			System.out.println(num1);
			int sum= num1+num2;
			num1= num2;
			num2=sum;
			
		}
	}

}
