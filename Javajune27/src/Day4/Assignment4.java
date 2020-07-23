package Day4;
//print value of local variable with this if both local and global var have same name 

public class Assignment4 {
	
	int a;
	
	public void method(int a) {
		this.a=a;
		System.out.println("Value of local variable is: "+ a);
	}
	
	public static void main(String[] args) {
		Assignment4 obj= new Assignment4();
		obj.method(5);
		System.out.println("Value of global variable is: "+ obj.a);
	}

}
