package Day4;
//Inheritance:Single level - Child class

public class class2 extends class1 {
	int b;
	public void method2() {
		System.out.println("child class method");
	}
	
	public static void main(String[] args) {
		
		  class2 c2 = new class2(); c2.a=5;
		  System.out.println("parent calss variable value is: "+ c2.a); 
		  c2.method1();
		  c2.method2();
		
	}

}
