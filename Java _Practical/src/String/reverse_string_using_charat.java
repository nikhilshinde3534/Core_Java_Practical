package String;

public class reverse_string_using_charat {

	public static void main(String[] args) {
		
		// 1. Reverse the string using charAt method
		String name="fifa";
		// afif
		System.out.println("After Reversing the string : ");
		for(int i=name.length()-1;i>=0;i--)
		{
			System.out.print(name.charAt(i));
		}
		
		
		// 2. Reverse the string using tochararray method
		String name1="fifa";
		System.out.println("\nAfter Reversing the String : ");
		char arr[] = name1.toCharArray();
		for(int i=name1.length()-1;i>=0;i--)
		{
			System.out.print((i));
		}
	}
}
