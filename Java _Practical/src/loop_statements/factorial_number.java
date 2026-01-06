package loop_statements;

import java.util.Scanner;

public class factorial_number {

	public static void main(String[] args) {
		
		int num;
		System.out.println("Enter a number : ");
		Scanner sc=new Scanner (System.in);
		num=sc.nextInt();
		
		int f=1;
		System.out.println("Factorial series is : ");
		
		for(int i=1;i<=num;i++)
		{
			f*=i; //factorial calculation
				  //1*=2=2
				  //2*3=6
			System.out.println(i+"=!"+f);
		}
	}
}
