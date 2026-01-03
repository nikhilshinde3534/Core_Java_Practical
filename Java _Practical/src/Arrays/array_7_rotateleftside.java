package Arrays;

public class array_7_rotateleftside {

	public static void main(String[] args) {
		
		int a[]= {57,82,64,91,30};
		
		System.out.println("Before rotation array in left : ");
		for(int j=0;j<a.length;j++)
		{
			System.out.print(a[j]+" ");
		}
		System.out.println("\n");
		
		int temp=a[0];
		for(int i=0;i<a.length-1;i++)
		{
			a[i]=a[i+1];
		}
		
		a[a.length-1]=temp;
		
		System.out.println("After rotation array in left : ");
		for(int j=0;j<a.length;j++)
		{
			System.out.print(a[j]+" ");
		}
	}
}
