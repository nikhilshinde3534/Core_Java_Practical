package Conditional_statement;

import java.util.Scanner;

public class prime_notprime {
	public static void main(String[] args) {
		
		System.out.println("Enter the number : ");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		
		int count=0;
		for(int i=2;i<num;i++)
		{
			if(num%i==0)
			{
				count++;
				break;
			}
		}
		if(count==0)
		{
			System.out.println("The number is a Prime Number");
		}
		else
		{
			System.out.println("The number is not a Prime Number");
		}
	}
}
