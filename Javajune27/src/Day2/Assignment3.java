package Day2;
                                      // (10*2)-2)+2)-2)/2)

public class Assignment3 {
	
	public int mul(int num1, int num2) 
	{
		int result;
		result= num1 * num2;
		return result;
	}
	
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
	
	public void div(int num1, int num2)
	{
		int result;
		result= num1/num2;
		System.out.println("Final output is: "+ result);
	}
	
	public static void main(String[] args) {
		Assignment3 obj= new Assignment3();
		int mul_result= obj.mul(10, 2);
		System.out.println("Result of multiplication is: "+ mul_result);
		
		int sub_result= obj.sub(mul_result, 2);
		System.out.println("Result of substraction is: "+ sub_result);
		
		int sum_result= obj.sum(sub_result, 2);
		System.out.println("Result of addition is: "+ sum_result);
		
		int sub_resultnew= obj.sub(sum_result, 2);
		System.out.println("Result of new substraction is: "+ sub_resultnew);
		
		obj.div(sub_resultnew, 2);
		
	}

}
