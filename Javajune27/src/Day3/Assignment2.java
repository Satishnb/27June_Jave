package Day3;

//calling method using this keyword

public class Assignment2 {
	
	public void Default1() {
		this.Param3method(3, 4, 5);
		System.out.println("Default method" );
	}
	
	public void Param1method(int a) {
		this.Param2method(2,3);
		System.out.println("One parametrized method");
	}
	
	public void Param2method(int a, int b) {
		this.Param4method(4,5,6,7);
		System.out.println("Two parametrized method");
	}
	
	public void Param3method(int a, int b, int c) {
		System.out.println("Three parametrized method");	
	}
	
	public void Param4method(int a, int b, int c, int d) {
		this.Default1();
		System.out.println("Four parametrized method");
	}

	public static void main(String[] args) {
		Assignment2 obj = new Assignment2();
		obj.Param1method(1);
	}

}
