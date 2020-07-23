package Day4;
//print value of global variable with this if both local and global var have same name 
public class Assignment2 {
	
	int a;
	
	public void method(int a) {
		this.a=a;
	}
	
	public static void main(String[] args) {
		Assignment2 obj= new Assignment2();
		obj.method(5);
		System.out.println("Value of global variable is: "+ obj.a);
	}

}
