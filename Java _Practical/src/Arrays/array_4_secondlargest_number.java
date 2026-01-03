package Arrays;

public class array_4_secondlargest_number {

	public static void main(String[] args) {
		
		//90,34,75,82,61
		//largest number = 90
		//second largest number = 82
		
		int numbers[]= {90,34,75,82,61};
		int max=0;
		
		for(int i=0;i<numbers.length;i++)
		{
			if(numbers[i]>max)
			{
				max=numbers[i];
			}
		}
		System.out.println("Largest number is : "+max);
		System.out.println("--------------------------------");
		
		int second_max=0;
		for(int i=0;i<numbers.length;i++)
		{
			if(numbers[i]>second_max && numbers[i]!=max)
			{
				second_max=numbers[i];
			}
		}
		System.out.println("Second Largest Number is : "+second_max);
	}
}
