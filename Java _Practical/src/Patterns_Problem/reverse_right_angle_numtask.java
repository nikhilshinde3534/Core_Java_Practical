package Patterns_Problem;

public class reverse_right_angle_numtask {

	
	public static void main(String[] args) {
		
		int number= 9;
		
		for(int r=1; r<=5; r++)
		{
			for(int c=5; c>=r; c--)
			{
				System.out.print(number);
			}
			number--;
			number--;
			
			System.out.println();
		}
	}
}
