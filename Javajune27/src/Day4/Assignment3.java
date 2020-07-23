package Day4;
//print value of local variable without this if both local and global var have same name 

public class Assignment3 {
	
	int a;
	
	public void method(int a) {
		a=a;
		System.out.println("Value of local variable is: "+ a);
	}
	
	public static void main(String[] args) {
		Assignment3 obj= new Assignment3();
		obj.method(5);
		System.out.println("Value of global variable is: "+ obj.a);
	}

}
