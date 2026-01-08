package String;

public class vowels_instring {

	public static void main(String[] args) {
		
		String s="Nikhil";
		int count = 0;
		
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i' || s.charAt(i)=='o' || s.charAt(i)=='u')
			{
				count++;
			}
		}
		if(count==0)
		{
			System.out.println("Vowels are not present in the string");
		}
		else
		{
			System.out.println("Vowels are present in the string");
		}
	}
}
