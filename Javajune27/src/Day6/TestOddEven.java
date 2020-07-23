package Day6;
//using if else - check numner is even or odd 

import java.util.Scanner;

public class TestOddEven {
	
	public static void oddEvenExample(int num) {
		
		if(num%2==0) {
			System.out.println(num + " is even number");
		}
		else
			System.out.println(num + " is odd number");
		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value to check odd/even");
		oddEvenExample(sc.nextInt());
	}

}
