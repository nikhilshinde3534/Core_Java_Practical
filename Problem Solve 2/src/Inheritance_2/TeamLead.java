package Inheritance_2;

public class TeamLead extends Developer{

	void lead()
	{
		System.out.println("Lead the Team...!");
	}
	
	public static void main(String[] args) {
		
		TeamLead lead = new TeamLead();
		lead.lead();
		lead.role();
		lead.companyDetails();
	}
}
