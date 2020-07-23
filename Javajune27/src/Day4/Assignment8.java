package Day4;
// Method calling: using super and this keyword
public class Assignment8 extends Assignment7 {
	
	public void DefaultMethod() {
		this.Method1(1);
		System.out.println("Child default constructor");
	}
    public void Method1(int a) {
    	this.Method3(1,2,3);
    	System.out.println("Child one parametrized constructor");
	}
    public void Method2(int a, int b) {
    	System.out.println("Child two parametrized constructor");
	}
    public void Method3(int a, int b, int c) {
    	super.method2(1,2);
    	System.out.println("Child three parametrized constructor");
	}
    public void Method4(int a, int b, int c, int d) {
    	this.DefaultMethod();
    	System.out.println("Child four parametrized constructor");
	}
    
    public static void main(String[] args) {
    	Assignment8 obj = new Assignment8();
    	obj.Method4(1,2,3,4);
    	
	}
}
