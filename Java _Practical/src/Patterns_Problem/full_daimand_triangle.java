package Patterns_Problem;

public class full_daimand_triangle {

	public static void main(String[] args) {
		
		// Pyramid
		for(int r=1; r<=4; r++)
		{
			for(int s=4; s>=r; s--)
			{
				System.out.print(" ");
			}
			for(int c=1; c<=r; c++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		
		// Reverse Pyramid
		for(int r=3; r>=1; r--)
		{
			for(int s=4; s>=r; s--)
			{
				System.out.print(" ");
			}
			for(int c=1; c<=r; c++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
