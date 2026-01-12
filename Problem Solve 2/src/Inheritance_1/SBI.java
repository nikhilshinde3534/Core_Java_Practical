package Inheritance_1;

public class SBI extends RBI{
	
	void deposit()
	{
		int age=23;
		if(age>=18)
		{
			super.deposit(1000); // Parent
		}
		else
		{
			System.out.println("Can't Deposit");
		}
	}

	public static void main(String[] args) {
		
		SBI s = new SBI();
		s.balance=5000;
		s.deposit();
	}
}
