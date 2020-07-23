package Day3;

// calling constructor using this keyword

public class Assignment1 {
	
	public Assignment1() {
		this(4,5,6,7);
		System.out.println("Default construtor" );
	}
	
	public Assignment1(int a) {
		this();
		System.out.println("One parametrized constructor");
	}
	
	public Assignment1(int a, int b) {
		this(3,4,5);
		System.out.println("Two parametrized constructor");
	}
	
	public Assignment1(int a, int b, int c) {
		this(1);
		System.out.println("Three parametrized constructor");	
	}
	
	public Assignment1(int a, int b, int c, int d) {
		System.out.println("Four parametrized constructor");
	}
	
	public static void main(String[] args) {
		Assignment1 obj = new Assignment1(2,3);
	}

}
