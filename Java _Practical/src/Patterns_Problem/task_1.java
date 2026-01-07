package Patterns_Problem;

public class task_1 {

	public static void main(String[] args) {
		
//		0
//		1 2
//		3 4 5
//		6 7 8 9
		
		int i=0;
		
		for(int r=0; r<4; r++)
		{
			for(int c=0; c<=r; c++)
			{
				System.out.print(i);
				i++;
			}
			System.out.println();
		}
	}
}
