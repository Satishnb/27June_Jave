package Day3;

// calling dafault and paramitrized constructor without this keyword

public class Assignment5 {
	
	public Assignment5() {
		
		System.out.println("I am default constructor");
	}
	
    public Assignment5(int a) {
		
		System.out.println("I am one paramitrized constructor");
	}
    
    public Assignment5(int a, int b) {
    	
    	System.out.println("I am two paramitrized constructor");
    	
    }
    
    public static void main(String[] args) {
    	Assignment5 obj1 = new Assignment5();
    	Assignment5 obj2 = new Assignment5(5);
    	Assignment5 obj3 = new Assignment5(5,6);

    	
		
	}
	

}
