package Day2;
                               // (10+2)-2)*2)+2)/2)

public class Assignment1 {
	
	public int sum(int num1, int num2)
	{
		int result;
		result= num1 + num2;
		return result;
	}
	public int sub( int num1, int num2)
	{
		int result;
		result= num1 - num2;
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
		Assignment1 obj= new Assignment1();
		int sum_result= obj.sum(10, 2);
		System.out.println("Result of addition is: "+ sum_result);
		
		int sub_result= obj.sub(sum_result, 2);
		System.out.println("Result of substraction is: "+ sub_result);

		int mul_result= obj.mul(sub_result, 2);
		System.out.println("Result of multiplication is: "+ mul_result);

		int sum_resultnew= obj.sum(mul_result, 2);
		System.out.println("Result of new addition is: "+ sum_resultnew);

		obj.div(sum_resultnew, 2);
		
	}

}
