package Constructor_Chaining;

	// Difference between Constructor and Method

public class User {

	User()
	{
		System.out.println("Non Parameter");
	}
	
	void fun()
	{
		System.out.println("fun");
	}
	
	public static void main(String[] args) {
		
		User User = new User();
		User.fun();
	}
}


//       Constructor					Method

//	1.No need to call 			1.Need to call method.
//    constructor.
//
//	2.Constructor will call		2.Method can call any 
//	  only once.				  no of times.
//
//	3.Constructor has no		3.Method has a return
//	  return type.				  type.
//
//	4.Constructor is used to	4.Method are used to
//	  initilized object.		  perform some task.
