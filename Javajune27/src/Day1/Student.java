package Day1;

public class Student {
	
	int age;
	int roll_no;
	
	public void display1() {
		System.out.println("I am display1 method");
		
	}
	
	public void display2()
	{
		System.out.println("I am display2 method"+ "\n");
		
	}
	
	public void valuePrint() {
		System.out.println("Roll no of student is " + roll_no);
    	System.out.println("Age of student is " + age);
	}
	
    public static void main(String[] args) {
    	Student s = new Student();
    	
    	s.age=21;
    	s.roll_no=1;
    	System.out.println("Roll no of student is " + s.roll_no);
    	System.out.println("Age of student is " + s.age + "\n");
    	
    	s.display1();
    	s.display2();
    	
    	s.age=25;
    	s.roll_no=2;
    	
    	s.valuePrint();
    	
	
}
}
