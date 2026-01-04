package basic_program;

import java.util.Scanner;

public class check_smallestnumber {
	
	public static void main(String[] args) {
		
		System.out.println("Enter the four number : " );
		Scanner sc = new Scanner (System.in);
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		int num3=sc.nextInt();
		int num4=sc.nextInt();
		
		if(num1<num2 && num1<num3 && num1<num4)
		{
			System.out.println("Number 1 is Smallest");
		}
		else if(num2<num1 && num2<num3 && num2<num4)
		{
			System.out.println("Number 2 is Smallest");
		}
		else if(num3<num1 && num3<num2 && num3<num4)
		{
			System.out.println("Number 3 is Smallest");
		}
		else 
		{
			System.out.println("Number 4 is Smallest");
		}
	}
}
