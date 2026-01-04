package basic_program;

import java.util.Scanner;

public class check_largestnumber {

	public static void main(String[] args) {
		
		Scanner sc =new Scanner (System.in);
		System.out.println("Enter the number 1 : ");
		int num1=sc.nextInt();
		
		System.out.println("Enter the number 2 : ");
		int num2=sc.nextInt();

		System.out.println("Enter the number 3 : ");
		int num3=sc.nextInt();
		
		if(num1>num2 && num1>num3)
		{
			System.out.println("Number 1 is largest number");
		}
		else if(num2>num3 && num2>num1)
		{
			System.out.println("Number 2 is largest number");
		}
		else
		{
			System.out.println("Number 3 is largest number");
		}
	}
}
