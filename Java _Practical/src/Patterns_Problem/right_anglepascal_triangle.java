package Patterns_Problem;

import java.util.Scanner;

public class right_anglepascal_triangle {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the rows : ");
		int number=sc.nextInt();
		
		// Part 1 :- Right Angle Triangle
		for(int r=1;r<=number;r++)
		{
			for(int c=1;c<=r;c++)
			{
				System.out.print("@");
			}
			System.out.println();
		}
		
		// Part 1 :- Reverse Angle Triangle
		for(int r=number;r>=1;r--)
		{
			for(int c=1;c<=r;c++)
			{
				System.out.print("@");
			}
			System.out.println();
		}
	}
}
