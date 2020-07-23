package Day6;
//using if else and for loop - check number is even or odd
import java.util.Scanner;

public class checkOddEven {
	
public static void oddEvenExample() {
	    Scanner sc = new Scanner(System.in);
		for(int i=1; i<=5; i++ ) {
		System.out.println("Enter value to check odd/even");
		int num=sc.nextInt();
		if(num%2==0) {
			System.out.println(num + " is even number"+ "\n");
		}
		else
			System.out.println(num + " is odd number"+"\n");
}
}
public static void main(String[] args) {
	
	oddEvenExample();

}
}