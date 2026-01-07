package Patterns_Problem;

public class reverse_triangle {

	public static void main(String[] args) {
		
		for(int r=1;r<=4;r++)
		{
			for(int s=1;s<=r;s++)
			{
				System.out.print(" ");
			}
			for(int c=4;c>=r;c--)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
