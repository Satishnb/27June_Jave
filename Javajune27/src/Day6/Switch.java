package Day6;

import java.util.Scanner;

public class Switch {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter two number");
		int num1= sc.nextInt();
		int num2= sc.nextInt();
		System.out.println("Please enter operation");
		String operation= sc.next();    // for string
		
		switch(operation) {
		case "Add":
			int sum_result= num1+num2;
			System.out.println("Addition of two number is: "+ sum_result);
			break;
			
		case "Sub":
			int sub_result= num1-num2;
			System.out.println("Addition of two number is: "+ sub_result);
			break;
			
		case "Mul":
			int mul_result= num1*num2;
			System.out.println("Addition of two number is: "+ mul_result);
			break;
			
		case "Div":
			int div_result= num1/num2;
			System.out.println("Addition of two number is: "+ div_result);
			break;
			
		default:
			System.out.println("Enter correct operation");
			
			
		}
		
	}

}
