package String;

public class lexicographically {

	// Check whether the string is equals lexicographically
	
	public static void main(String[] args) {
		
		String s1=new String("BAT");
		String s2=new String("BAT");
		System.out.println(s1.compareTo(s2)); //66-98=32  97-97=0  116-116=0  
		
		if(s1.compareTo(s2)==0)
		{
			System.out.println("Both String objects are lexicographically equals....!");
		}
		else if(s1.compareTo(s2)<0)
		{
			System.out.println("String object "+s1+" is less than string object "+s2+" lexicographically ");
		}
		else
		{
			System.out.println("String object "+s1+" is greater than string object "+s2+" lexicographically ");
		}
	}
}
