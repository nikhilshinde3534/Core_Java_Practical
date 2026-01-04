package basic_program;

import java.util.Scanner;

public class swapping_withoutthirdvariable {
public static void main(String[] args) {
	
		// Swapping without using third variable
	
		int a,b;
		System.out.println("Enter the number / Before Swapping : ");
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		b=sc.nextInt();
		
		a=a+b;
		b=a-b;
		a=a-b;
		
		System.out.println("After Swapping : " +a+ " " +b);
	}
}



