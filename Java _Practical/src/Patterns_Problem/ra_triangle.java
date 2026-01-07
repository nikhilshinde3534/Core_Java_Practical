package Patterns_Problem;

public class ra_triangle {

	public static void main(String[] args) {
		
		for(int r=1; r<=5; r++)
		{
			for(int c=1;c<=r*2-1;c++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
