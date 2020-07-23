package Day4;
//Multi level inheritance: child class

public class class5 extends class4 {
	int e;
	public void method5() {
		System.out.println("child class method");
	}
	
	public static void main(String[] args) {
		class5 obj5= new class5();
		obj5.method3();
		obj5.method4();
		obj5.method5();
		
	}

}
