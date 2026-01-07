package Patterns_Problem;

public class left_angle_triangle_number {

	public static void main(String[] args) {
		
		int i=5;
		
		for(int r=1;r<=i;r++)
		{
			for(int s=4;s>=r;s--)
			{
				System.out.print(" ");
			}
			for(int c=1;c<=r;c++)
			{
				System.out.print(r);
			}
			System.out.println();
		}
	}
}

