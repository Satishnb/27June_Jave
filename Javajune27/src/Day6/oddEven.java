package Day6;

// using nested if else- check number is even or odd

import java.util.Scanner;

public class oddEven {
	
	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);
		System.out.println("Enter any number");
	    for( int i=1; i<=3;i++) {
		int num = sn.nextInt();
		if(num>1)
		{           // if body
			if(num%2==0)
			{
				System.out.println("Entered number is even");
			}
			else
			{
				System.out.println("Entered number is odd");
			}
		}  
		      
		        else
			{
				System.out.println("enter correct number");
			}
	    }
	}
}
