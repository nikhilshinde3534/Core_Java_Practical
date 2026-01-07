
package Patterns_Problem;

public class left_angle_triangle {

	public static void main(String[] args) {
		
		for(int r=1; r<=4; r++)
		{
			for(int s=3; s>=r; s--)
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

