package Conditional_statement;

public class check_armstrong_number {

	public static void main(String[] args) {
		
		//The number is equal to sum of its own digit raised to the power of the number of digits
		
		//num=12   (not armstrong number)
		//sum=1*1 + 2*2 = 1+4=5   5=12  
		
		//num=153  (Armstrong number
		//sum= 1*1 + 5*5 + 3*3 = 1+125+27 =  sum=153 
		
		int num=153;
		int sum=0;
		while(num>0)
		{
			int digit=num%10;
			sum=sum+digit*digit*digit;
			num=num/10;
		}
		if(num==sum)
		{
			System.out.println("Armstrong Number");
		}
		else
		{
			System.out.println("Not a Armstrong Number");
		}
	}
}
