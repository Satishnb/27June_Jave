package Day4;
// Constructor calling: using super and this keyword
public class Assignment6 extends Assignment5 {
	
	public Assignment6() {
		this(1);
		System.out.println("Child default constructor");
	}
    public Assignment6(int a) {
    	this(1,2,3);
    	System.out.println("Child one parametrized constructor");
	}
    public Assignment6(int a, int b) {
    	System.out.println("Child two parametrized constructor");
	}
    public Assignment6(int a, int b, int c) {
    	super(1,2);
    	System.out.println("Child three parametrized constructor");
	}
    public Assignment6(int a, int b, int c, int d) {
    	this();
    	System.out.println("Child four parametrized constructor");
	}
    
    public static void main(String[] args) {
    	Assignment6 obj = new Assignment6(1,2,3,4);
	}
}
