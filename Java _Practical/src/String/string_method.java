package String;

public class string_method {

	public static void main(String[] args) {
		//String str="City" replace i with e
		
		String str="City";
		System.out.println("After Replacing character i with e : "+str.replace("i", "e"));
		
		
		//Stringbuilder
		StringBuilder sb = new StringBuilder("Pune");
		sb.replace(3, 4, "a");
		System.out.println("After replacing the character string is : "+sb);
		System.out.println("------------------------------------------------");
		
		String str2="I Love My Family";
		System.out.println("After Replacing space with Star : "+str2.replace("\s", "*"));
		System.out.println("------------------------------------------------");;
		
		String str3="Cra1vi8ta0Te5c3h6"; //remove the number from the string
		System.out.println("After Removing the number from the string : "+str3.replaceAll("[0-9]",""));
		System.out.println("------------------------------------------------");;

		String str4="*fct%123@gma^il.co!m$"; //remove the special character from the string
		System.out.println("After Removing the special character : "+str4.replaceAll("[!,@,#,$,%,^,&,*]",""));
		
	}
}
