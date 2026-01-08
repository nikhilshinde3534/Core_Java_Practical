package String;

public class reverse_string {

	public static void main(String[] args) {
		
		System.out.println("-------------------- Output 1 ---------------------");
		
		String b = "You all are very very very good students";
		
		String[] words = b.split(" ");
		String reversed ="";
		
		for(int i=words.length-1;i>=0;i--)
		{
			reversed+=words[i]+" ";
		}
		System.out.println(reversed.trim());
		System.out.println("\n");
		
		
		System.out.println("-------------------- Output 3 ---------------------");
		
		String a = "You all are very very very good students";
		
		for(int i=a.length()-1;i>=0;i--)
		{
			System.out.print(a.charAt(i));
		}	
	}
}



