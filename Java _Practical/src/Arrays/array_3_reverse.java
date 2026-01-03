package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class array_3_reverse {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array : ");
		int size=sc.nextInt();
		
		System.out.println("Enter the elements of array : ");
		int marks[]=new int[size];
		
		for(int i=0;i<marks.length;i++)
		{
			marks[i]=sc.nextInt();
		}
		System.out.println("Students marks are : " +Arrays.toString(marks));
		
		System.out.println("Reversed array is :");
		for(int i=marks.length-1;i>=0;i--)
		{
			System.out.println(marks[i]);
		}
	}
}
