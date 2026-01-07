package Patterns_Problem;

import java.util.Scanner;

public class diamond_user_input {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of rows: ");
		int count=sc.nextInt();
		
		for(int r=1; r<=count; r++)
		{
			for(int s=count; s>=r; s--)
			{
				System.out.print(" ");
			}
			for(int c=1; c<=r; c++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		
		for(int r=count-1; r>=1; r--)
		{
			for(int s=count; s>=r; s--)
			{
				System.out.print(" ");
			}
			for(int c=1; c<=r; c++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
