package Arrays;

public class array_12_transpose_of_matrix {

	public static void main(String[] args) {
		
		int A[][]= {{1,2,3,4},
					{5,6,7,8},
					{9,8,7,6},
					{5,4,3,2}};
		
		int B[][]= new int[4][4];
		
		for(int i=0;i<A.length;i++)
		{
			for(int j=0;j<A.length;j++)
			{
				B[i][j]=A[j][i];
			}
		}
		// for printinh the transpose of matrix
		System.out.println("Transpose of matrix is :");
		for(int i=0;i<B.length;i++)
		{
			for(int j=0;j<B.length;j++)
			{
				System.out.print(B[i][j]+" ");
			}
			System.out.println();
		}
	}
}
