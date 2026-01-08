package String;

// Print the duplicate character in the string
// Check whether the duplicate character is present in the string
// Print the count of duplicate character in the string

public class duplicate_char {

	public static void main(String[] args) {
		
		String str = "Hello Pune";
		int count=0;
		
		for(int i=0;i<str.length()-1;i++)
		{
			for(int j=i+1;j<str.length();j++)
			{
				if(str.charAt(i)==str.charAt(j));
				{
					System.out.println(str.charAt(i));
					count++;
				}
			}
		}
		if(count==0)
		{
			System.out.println("The duplicae character is not present in the string");
		}
		else
		{
			System.out.println("The duplicae character is present in the string");
		}
	}
	
}
