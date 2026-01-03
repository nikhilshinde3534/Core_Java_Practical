package Arrays;

public class array_13_check_evenodd_numbers {

	// Check weather even and odd numbers are present in array also print the numbers and count
	
	public static void main(String[] args) {
		
		int numbers[]= {9,5,4,2,8};
		
		int evencount=0;
		int oddcount=0;
		
		System.out.println("Even numbers: ");
		for(int i=0;i<=numbers.length;i++)
		{
			if(i%2==0)
			{
				System.out.println(i+" ");
				evencount++;
			}
		}
		
		System.out.println("Odd numbers: ");
		for(int j=0;j<=numbers.length;j++)
		{
			if(j%2!=0)
			{
				System.out.println(j+" ");
				oddcount++;
			}
		}
		
		System.out.println("Count of Even Number is : "+evencount);
		System.out.println("Count of Odd Number is : "+oddcount);
	}
}
