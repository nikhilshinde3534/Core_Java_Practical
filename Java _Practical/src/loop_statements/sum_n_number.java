package loop_statements;

import java.util.Scanner;

public class sum_n_number {

	public static void main(String[] args) {
		
		System.out.println("Enter the number : ");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		
		int sum=0;
		
		System.out.println("Sum of n number is : ");
		for(int i=1;i<=num;i++)
		{
			sum=sum+i;
		}
		System.out.println(sum);
	}
}
