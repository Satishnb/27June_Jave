package Day5;

public class overridingChild extends overridingParent {
	
	public void Method1(int a, int b)
	{
		int c = a-b;
		System.out.println("Output of Child method1 is: "+ c);
	}

    public void Method2(int c, int d)
    {
	    int i = c-d;
	    System.out.println("Output of Child method2 is: "+ i);
    }

public static void main(String[] args) {
	overridingChild over1 = new overridingChild();
	over1.Method1(6f,5f);
	over1.Method2(10,2);
	
}
}
