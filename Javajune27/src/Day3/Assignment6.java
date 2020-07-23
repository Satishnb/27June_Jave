package Day3;

// initialize the objcet using constructor

public class Assignment6 {
	
	int a,b,c,d,e;
	
	public Assignment6(int a1, int b1, int c1, int d1, int e1) {
		
		a=a1;
		b=b1;
		c=c1;
		d=d1;
		e=e1;
		System.out.println("Value of a is: "+ a);
		System.out.println("Value of b is: "+ b);
		System.out.println("Value of c is: "+ c);
		System.out.println("Value of d is: "+ d);
		System.out.println("Value of e is: "+ e);
	}
	
	public static void main(String[] args) {
		Assignment6 obj= new Assignment6(1,2,3,4,5);
	}
}
