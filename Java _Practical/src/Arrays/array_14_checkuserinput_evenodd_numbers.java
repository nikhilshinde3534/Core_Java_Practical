package Arrays;

import java.util.Scanner;

public class array_14_checkuserinput_evenodd_numbers {

	//Check Weather even numbers are present in user input array
	
	public static void main(String[] args) {
		
		System.out.println("Enter the Size of array : ");
		Scanner sc =new Scanner (System.in);
		int size=sc.nextInt();
		
		int num[]=new int[3];
		int count=0;
		
		System.out.println("Enter the element of array :");
		for(int i=0;i<=num.length;i++)
		{
			num[i]=sc.nextInt();
			if(num[i]%2==0)
			{
				count++;
				System.out.println("Even element is: "+num[i]);
			}
		}
		if(count==0)
		{
			System.out.println("Even elements are not present in array");
		}
		else
		{
			System.out.println("Even elements are present in array");
		}
		System.out.println("Count of even number is "+count);
	}
}
