package Types_of_Variable;

public class User {

	// Types of Method :- Instance Method and Static Method
	
	String username; // Instance Variable
	
	String password; // Instance Variable
	
	String email; // Instance Variable
	
	static String address="Pune"; // Static Variable 
	
	
	// Instance Method :-
	// Method defined without using static keyword
	void register()
	{
		// Can we access Instance Variable in Instance Method -> YES 
		System.out.println(username);
		System.out.println(password);
		System.out.println(email);
		
		// Can we access Static Variable in Instance Method -> YES 
		System.out.println(address);
	
	}
	
	// Static Method :-
	// Method defined using static keyword
	static void getCount()
	{
		// Can we access Instance Variable in Static Method -> Directly (NO) - Indirectly(YES) using object
		User u = new User();
		System.out.println(u.username);
		System.out.println(u.password);
		System.out.println(u.email);
		
		// Can we access Static Variable in Static Method -> YES 
		System.out.println(address);
	}
	
	void m1()
	{
		// Can we call Instance Method in another Instance Method ? YES
		register();
		
		// Can we call Static Method in another Instance Method ? YES
		getCount();
	}
	
	static void m2()
	{
		// Can we call Instance Method in another Static Method ? Directly (NO) - Indirectly(YES) using object
		User u = new User();
		u.register();
		
		// Can we call Static Method in another Ststic Method ? YES
		getCount();

	}
	
	
	public static void main(String[] args) {
		
		
	}
}
