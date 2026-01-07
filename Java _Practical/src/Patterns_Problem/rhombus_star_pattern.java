package Patterns_Problem;

public class rhombus_star_pattern {

//	* * * * 
//	  * * * * 
//	    * * * * 
//	      * * * * 
	
	public static void main(String[] args) {
		
		for(int r=1;r<=4;r++)
		{
			for(int s=1;s<r;s++)
			{
				System.out.print(" ");
			}
			for(int c=1;c<=4;c++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
