package Day4;
// Method calling: using super and this keyword
public class Assignment7 {
	
	public void Defaultmethod() {
		this.method4(1,2,3,4);
		System.out.println("Parent default method");
	}
    public void method1(int a) {
    	this.Defaultmethod();
    	System.out.println("Parent one parametrized method");
	}
    public void method2(int a, int b) {
    	this.method3(1,2,3);
    	System.out.println("Parent two parametrized method");
	}
    public void method3(int a, int b, int c) {
    	this.method1(1);
    	System.out.println("Parent three parametrized method");
	}
    public void method4(int a, int b, int c, int d) {
    	System.out.println("Parent four parametrized method");
	}
}
