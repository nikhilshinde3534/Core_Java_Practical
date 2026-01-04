package basic_program;

import java.util.Scanner;

public class count_thedigit {
	
	public static void main(String[] args) {
		
		int num;
		
		int count=0;
		System.out.println("Enter the number : ");
		Scanner sc =new Scanner(System.in);
		num = sc.nextInt();
		
		while(num>0)
		{
			count++;
			num=num/10;
		}
		System.out.println("Count of digit is: "+count);
	}
}
