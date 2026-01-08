package String;

public class checkspecific_char {

	public static void main(String[] args) {
		
		String s="Housefull";
		int count = 0;
		char ch='k';
		
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)==ch)
			{
				count++;
			}
		}
		if(count==0)
		{
			System.out.println("Character "+ch+" is not present in the string "+s);
		}
		else
		{
			System.out.println("Character "+ch+" is present in the string "+s);
		}
	}
}
