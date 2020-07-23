package Day4;
// print value of global variable without this if both local and global var have same name 
public class Assignment1 {
	
	int a;
	
	public void method(int a) {
		a=a;
	}
	
	public static void main(String[] args) {
		Assignment1 obj= new Assignment1();
		obj.method(5);
		System.out.println("Value of global variable is: "+ obj.a);
	}

}
