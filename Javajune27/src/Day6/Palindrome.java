package Day6;

import java.util.Scanner;

public class Palindrome {
	
	public int[] Reverse(int a, int l) {                 //reverse the number  
		int num = a;
		int length = l;
		int reminder;
		int array[];
		array = new int[length];

		for (int i = 0; i < length; i++) {                  // store digit into an array
			reminder = num % 10;                              
			array[i] = reminder;
			num = num / 10;                              
		}
		for (int f = 0; f <= array.length - 1; f++) {    // print element of an aaray
			System.out.println(array[f]);
		}
		return array;                                    // return an array to main method
	}

	public boolean checkIfPalindrome(int[] array) {     // check palindrome by comparing the 
		boolean isPalindrome = true;
		for (int i = 0, j = array.length - 1; i <= j; i++, j--) {
			if (array[i] != array[j]) {
				isPalindrome = false;
				break;
			}
		}
		return isPalindrome;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		int a = sc.nextInt();
		int l = Integer.toString(a).length();
		Palindrome p = new Palindrome();
		
		int[] reversedArray = p.Reverse(a, l);
		boolean isPalindrome = p.checkIfPalindrome(reversedArray);
		if (isPalindrome) {
			System.out.println("Palindrome");
		} else {
			System.out.println("Not Palindrome");
		}
	}
		
		
	}



