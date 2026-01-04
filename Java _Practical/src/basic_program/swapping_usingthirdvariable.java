package basic_program;

import java.util.Scanner;

public class swapping_usingthirdvariable {

	// Swapping with using third variable
	public static void main(String[] args) {
		
		int a, b, temp;
		
		System.out.println("Enter number / Before Seapping : ");
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		b=sc.nextInt();
		
		temp=a;
		a=b;
		b=temp;
		
		System.out.println("After Swapping :" +a+ " " +b);
	}
}
