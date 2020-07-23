package Day6;

import java.util.Scanner;

public class PalindromeInteger {
	
	public void checkPalindrome(int actual_num) {
		
	     int num = actual_num;
	     int reminder;
		 int temp = num;
		 int reverse = 0;
	     while(num>0)
		   {    
	        reminder = num % 10;     // for first digit of enterd number
	        reverse = (reverse*10)+reminder;   // to calculate the reverse number 
	        num = num/10;    // divide by 10 for number and then %10 for next digit
	       }    
	      if(temp==reverse)    
	        System.out.println("Palindrome number"+ "\n");    
	      else    
	        System.out.println("Not a palindrome" + "\n");    
	     } 
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		PalindromeInteger obj = new PalindromeInteger();
		
		for(int i=0; i<3; i++) {
	     System.out.print("Enter a number: ");
	     obj.checkPalindrome(sc.nextInt());
		} 
	}
		
		
	}



