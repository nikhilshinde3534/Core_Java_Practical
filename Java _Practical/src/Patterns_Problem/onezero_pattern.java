package Patterns_Problem;

import java.util.Scanner;

public class onezero_pattern {

	public static void main(String[] args) {
		
		System.out.println("Enter the number of rows : ");
		Scanner sc=new Scanner (System.in);
		int num=sc.nextInt();
		
		for(int r=1;r<=num;r++)
		{
			for(int c=1;c<=num;c++)
			{
				if(c%2==0)
				{
					System.out.print("0" +" ");
				}
				else
				{
					System.out.print("1" +" ");
				}
			}
			System.out.println();
		}
	}
}
