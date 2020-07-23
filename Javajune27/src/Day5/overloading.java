package Day5;

import java.util.Scanner;

// Method overloading( Method name- same, input data type - will not same, return type- can be or can't be same

public class overloading {
	
	public int sum(int a, int b) {
		int c;
		c= a+b;
		return c;
		
	}
	
	public void sum(int a, int b, int c) {
		int d;
		d= a+b+c;
		System.out.println("Sum result is: "+ d + "\n");
		
	}
	
	public float sum(int a, float b) {
		float c;
		c= a+b;
		return c;
		
		
	}
	
	public static void main(String[] args) {
		overloading over = new overloading();
		Scanner sc = new Scanner(System.in);	
		System.out.println("Enter values fro submission");
		int result1= over.sum(sc.nextInt(), sc.nextInt());
		System.out.println("Sum result is: "+ result1 + "\n");
		System.out.println("Enter values fro submission");
		over.sum(sc.nextInt(), sc.nextInt(), sc.nextInt());
		System.out.println("Enter values fro submission");
		float result3= over.sum(sc.nextInt(), sc.nextFloat());
		System.out.println("Sum result is: "+ result3 + "\n");

		
	}

}
