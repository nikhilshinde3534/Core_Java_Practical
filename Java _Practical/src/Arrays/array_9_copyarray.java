package Arrays;

public class array_9_copyarray {

	public static void main(String[] args) {
		
		int a[] = {34,76,90,82,51};
		int b[] = new int[a.length];
		
		for(int i=0;i<b.length;i++)
		{// i=0 0<4true i=1 1<5true , i=2 2<4true
			b[i]=a[i]; //b[0]=a[0]  34
					   //b[1]=a[1]  76
			           //b[2]=a[2]  90
			           //b[3]=a[3]  82
			           //b[4]=a[4]  51
		}
		
		System.out.println("After copying the array b is : ");
		for(int j=0;j<b.length;j++)
		{
			System.out.print(b[j]+" ");
		}		
	}
}
