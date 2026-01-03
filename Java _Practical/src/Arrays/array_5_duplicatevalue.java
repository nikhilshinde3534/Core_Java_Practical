package Arrays;

public class array_5_duplicatevalue {

	public static void main(String[] args) {
		
		int a[]= {3,9,6,8,2,9};
		int count=0;
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					count++;
					System.out.println("Duplicate element is:"+a[i]);
				}
			}
		}
		System.out.println("-------------------------------------------------");
		if(count==0)
		{
			System.out.println("Duplicate elements are not present in array");
		}
		else
		{
			System.out.println("Duplicate elements are present in array");
		}
		System.out.println("-------------------------------------------------");
		System.out.println("Count of Duplicate elements in array");

	}
}