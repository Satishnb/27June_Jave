package Day2;
                                               // (10-2)+2)+2)*2)/2)

public class Assignment2 {
	
	public int sub( int num1, int num2)
	{
		int result;
		result= num1 - num2;
		return result;
	}
	
	public int sum(int num1, int num2)
	{
		int result;
		result= num1 + num2;
		return result;
	}
	
	public int mul(int num1, int num2) 
	{
		int result;
		result= num1 * num2;
		return result;
	}
	
	public void div(int num1, int num2)
	{
		int result;
		result= num1/num2;
		System.out.println("Final output is: "+ result);
	}
	
	public static void main(String[] args) {
		Assignment2 obj= new Assignment2();
		int sub_result= obj.sub(10, 2);
		System.out.println("Result of substraction is: "+ sub_result);
		
		int sum_result= obj.sum(sub_result, 2);
		System.out.println("Result of sum is: "+ sum_result);
		
		int sum_resultnew= obj.sum(sum_result, 2);
		System.out.println("Result of new addition is: "+ sum_resultnew);

		int mul_result= obj.mul(sum_resultnew, 2);
		System.out.println("Result of multiplication is: "+ mul_result);
		
		obj.div(mul_result, 2);
		
	}

}
