package Inheritance_1;

public class RBI {
	
	double balance;
	
	void deposit(double amount)
	{
		if(amount>0)
		{
			balance += amount;
			
			System.out.println("Deposit Successfull...! : After Deposit : "+balance);
		}
		
	}
}
