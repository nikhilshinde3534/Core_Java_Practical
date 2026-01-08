package String;

public class removeduplicate {

	public static void main(String[] args) {
		
		String str = "Happy Diwali";
		int count;
		
		String new_str="";
		for(int i=0;i<str.length();i++)
		{
			count=0;
			for(int j=1;j<str.length();j++)
			{
				if(str.charAt(i)==str.charAt(j))
				{
					count++;
				}
			}
			if(count==0)
			{
				new_str=new_str+str.charAt(i);
			}
		}
		System.out.println("After removing duplicate character string is : "+new_str);
	}
}
