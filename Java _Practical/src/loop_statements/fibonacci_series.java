package loop_statements;

import java.util.Scanner;

public class fibonacci_series {
 
	public static void main(String[] args) {
		
		// It is the series where the number is the series is equal to last two digit.
		//0,1,1,2,3,5,8,13,21.............
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the starting number: ");
		int n1=sc.nextInt();
		
		System.out.println("Enter the ending number: ");
		int n2=sc.nextInt();
		
		int n3;
		
		for(int i=0;i<10;i++)
		{
			n3=n1+n2;// n3=0+1 n3=1
					 // n3=1+1 n3=2
					 // n3=1+2 n3=3
					 // n3=2+3 n3=5
					 // n3=3+5 n3=8
			System.out.println(n3+" ");//1 2 3 5 8
			
			n1=n2;//n1=1 n1=1 n1=2 n1=3
			n2=n3;//n2=1 n2=2 n2=3 n2=5
		}
	}
}
