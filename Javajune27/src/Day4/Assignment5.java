package Day4;
// Constructor calling: using super and this keyword
public class Assignment5 {
	
	public Assignment5() {
		this(1,2,3,4);
		System.out.println("Parent default constructor");
	}
    public Assignment5(int a) {
    	this();
    	System.out.println("Parent one parametrized constructor");
	}
    public Assignment5(int a, int b) {
    	this(1,2,3);
    	System.out.println("Parent two parametrized constructor");
	}
    public Assignment5(int a, int b, int c) {
    	this(1);
    	System.out.println("Parent three parametrized constructor");
	}
    public Assignment5(int a, int b, int c, int d) {
    	System.out.println("Parent four parametrized constructor");
	}
}
