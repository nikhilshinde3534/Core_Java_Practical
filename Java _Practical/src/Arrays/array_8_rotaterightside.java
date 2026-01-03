package Arrays;

public class array_8_rotaterightside {

	public static void main(String[] args) {
		
int a[]= {57,82,64,91,30};
		
		System.out.println("Before rotation array in right : ");
		for(int j=0;j<a.length;j++)
		{
			System.out.print(a[j]+" ");
		}
		System.out.println("\n");
		
		int temp=a[a.length-1];
		for(int i=a.length-1;i>0;i--)
		{
				a[i]=a[i-1];
		}
		
		a[0]=temp;
		
		System.out.println("After rotation array in right : ");
		for(int j=0;j<a.length;j++)
		{
			System.out.print(a[j]+" ");
		}
	}
}
