package Day8;

public class Interfaceclass implements abstractInterface {
	
	public void method1() {
		int a=5;
		int b=7;
		int sum = a+b;
		System.out.println("Result of abstarct method of an interface: "+ sum);
	}
	
	public static void main(String[] args) { 
		                                          // cant create object of Interface
		Interfaceclass obj = new Interfaceclass();// call the abstract method of interface with child object
		obj.method1();
	}


}
