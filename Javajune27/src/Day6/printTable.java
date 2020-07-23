package Day6;

import java.util.Scanner;

public class printTable {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number to print the table");
		int num= sc.nextInt();
		for (int i=1; i<=10; i++ ) {
			int table= num*i;
			System.out.println(table);
			
		}
		
	}

}
