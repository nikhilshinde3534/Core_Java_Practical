package Patterns_Problem;

public class Character_Pattern_4 {

	public static void main(String[] args) {
		
		char a='A';
		
		for(int r=1;r<=5;r++)
		{
			for(int c=1;c<=5;c++)
			{
				System.out.print(a+" ");
			}
			System.out.println();
			a++;
		}
	}
}
