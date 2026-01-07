package Patterns_Problem;

public class right_angle_triangle_alphabettask2 {

	public static void main(String[] args) {
		
		int n=4;
		char ch='z';
		
		for(int r=1; r<=n; r++)
		{
			for(int c=1; c<=r; c++)
			{
				System.out.print(ch);
			}
			System.out.println();
			ch--;
		}
	}
}
