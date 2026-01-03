package Arrays;

public class array_10_remove_duplicateelements {

	public static void main(String[] args) {
		
		int[] numbers= {45,71,92,80,36,71,92};
		int[] remove_duplicate_numbers=new int[numbers.length];
		int count;
		
		System.out.println("After Removing Duplicate Elements");
		for(int i=0;i<numbers.length;i++)
		{
			count=0;
			for(int j=i+1;j<numbers.length;j++)
			{
				if(numbers[i]==numbers[j])
				{
					count++;
				}
			}
			if(count==0)
			{
				remove_duplicate_numbers[i]=numbers[i];
			}
			if(remove_duplicate_numbers[i]!=0)
			System.out.print(remove_duplicate_numbers[i]+" ");
		}
	}
}
