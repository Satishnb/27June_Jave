package Day6;
// armstrong number
import java.util.Scanner;

public class Armstrong {
	public void checkArmstrong(int actual_num) {
	
	int num = actual_num;
    int reminder;
	 int temp = num;
	 int arm = 0;
    while(num>0)
	   {    
       reminder = num % 10;     // for first digit of enterd number
       arm = arm+(reminder*reminder*reminder);   // to calculate the reverse number 
       num = num/10;    // divide by 10 for number and then %10 for next digit
      }    
     if(temp==arm)    
       System.out.println(temp + " is armstrong number"+ "\n");    
     else    
       System.out.println(temp + " is Not a armstrong" + "\n");    
    } 
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	Armstrong obj = new Armstrong();
	
	for(int i=0; i<3; i++) {
     System.out.print("Enter a number: ");
     obj.checkArmstrong(sc.nextInt());
	} 
}


}
