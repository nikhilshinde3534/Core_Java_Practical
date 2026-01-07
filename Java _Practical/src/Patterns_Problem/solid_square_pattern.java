package Patterns_Problem;

import java.util.Scanner;

public class solid_square_pattern {

	public static void main(String[] args) {
		
	System.out.println("Enter the number of rows to print solid pattern : ");
	Scanner sc=new Scanner(System.in);
	int i=sc.nextInt();
	
	System.out.println("Here is your solid square pattern !!");
	for(int r=1;r<=i;r++)
	{
		for(int c=1;c<=i;c++)
		{
			System.out.print("*"+" ");
		}
		System.out.println();
	}
	}
}
