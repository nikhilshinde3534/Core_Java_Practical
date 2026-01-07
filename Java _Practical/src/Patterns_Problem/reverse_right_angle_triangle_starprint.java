package Patterns_Problem;

import java.util.Scanner;

public class reverse_right_angle_triangle_starprint {

	public static void main(String[] args) {
		
		System.out.println("Enter the number of rows : ");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		
		for(int r=1;r<=num;r++)
		{
			for(int c=num;c>=r;c--)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
