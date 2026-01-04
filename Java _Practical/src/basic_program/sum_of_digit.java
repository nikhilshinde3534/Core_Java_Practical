package basic_program;

import java.util.Scanner;

public class sum_of_digit {

	public static void main(String[] args) {
		
		System.out.println("Enter the number :");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		
		int sum=0;
		while(num>0)// 23>0true 2>0true 0>0true
		{
			int rem=num%10; //rem=23%10=3    rem=2%10=2 
			
			sum=sum+rem; // sum=0+3   sum=3   sum=3+3   sum=5
			
			num=num/10; // num23/10=2.3  num=2    num/10= 2/10=0.2  num=0
		}
		System.out.println("Sum is : "+sum);
	}
}
