package Patterns_Problem;

public class rhombus_oneprint {

//	    1111
//	   1111
//	  1111
//	 1111
	
	public static void main(String[] args) {
		
		for(int r=1;r<=4;r++)
		{
			for(int s=3;s>r;s--)
			{
				System.out.print(" ");
			}
			for(int c=1;c<=4;c++)
			{
				System.out.print("1");
			}
			System.out.println();
		}
	}
}
