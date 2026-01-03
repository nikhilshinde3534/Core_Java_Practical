package Arrays;

public class array_6_replacezerowithone {

	public static void main(String[] args) {
		
		int arr[]= {0,1,0,0,1,0,1,1};
		// output:-{1,0,1,1,0,1,0,0};
		
		System.out.println("Before replacing 0's and 1's");

		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println("\n");
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==0)
			{
				arr[i]=1;
			}
			else
			{
				arr[i]=0;
			}
		}
		System.out.println("After replacing 0's and 1's");

		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
}
