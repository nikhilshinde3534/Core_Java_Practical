package loop_statements;

import java.util.Scanner;

public class print_even_number {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Start Number : ");
		int start=sc.nextInt();
		
		System.out.println("Ending Last Number : ");
		int last=sc.nextInt();
		
		System.out.println("Even Number is : ");
		for(int num=start;num<last;num++)
		{
			if(num%2==0)
			{
				System.out.print(num+" ");
			}
		}
		
	}
	
}
