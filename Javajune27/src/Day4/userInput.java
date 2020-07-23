package Day4;
import java.util.Scanner;
public class userInput {
	
	public int sum(int a, int b) {
		int c= a+b;
		System.out.println("Addition result is: "+ c);
		return c;	
	}
	public int sub(int a, int b) {
		int c= a-b;
		System.out.println("Substraction result is: "+ c);
		return c;
	}
	public int mul(int a, int b) {
		int c= a*b;
		System.out.println("Multiplication result is: "+ c);
		return c;
	}
    public void div(int a, int b) {
    	int c= a/b;
		System.out.println("Total result is: "+ c);	
    }
    public static void main(String[] args) {
		userInput input = new userInput();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value for x1 and x2");
		int x1 = sc.nextInt();
		int x2 = sc.nextInt();
		int sum_result= input.sum(x1, x2);
		System.out.println("Enter value for x3");
		int x3=sc.nextInt();
		int sub_result= input.sub(sum_result, x3);
		System.out.println("Enter value for x4");
		int x4= sc.nextInt();
		int sum_resultnew= input.sum(sub_result, x4);
		System.out.println("Enter value for x5");
		int x5= sc.nextInt();
		int mul_result= input.mul(sum_resultnew, x5);
		System.out.println("Enter value for x6");
		int x6= sc.nextInt();
		input.div(mul_result, x6);
	}
}
