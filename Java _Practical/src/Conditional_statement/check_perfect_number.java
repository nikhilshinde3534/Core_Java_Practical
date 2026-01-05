package Conditional_statement;

import java.util.Scanner;

public class check_perfect_number {
	public static void main(String[] args) {
		
		//sum of divisors of the number is equal to the number itself called as perfect number.
		
		System.out.println("Enter the Number: ");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		
		//1+2+3+4+6=16  =12(not a perfect number)
		
		int sum=0;
		
		for(int i=1;i<num;i++)
		{
			if(num%i==0)
			{
				sum=sum+i;
			}
		}
		if(sum==num)
		{
			System.out.println("The number is perfect number");
		}
		else
		{
			System.out.println("The number is not perfect number");
		}
	}
}
