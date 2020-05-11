
public class Faculty extends Employee{
	private String officeHours;
	private String rank;
	
	Faculty(){
		super();
		officeHours = "No Office Hours";
		rank = "No Rank";
	}
	
	Faculty(String name, String phone, String SSN, String office, double salary, String officeHours, String rank){
		super(name, phone, SSN, office, salary);
		this.officeHours = officeHours;
		this.rank = rank;
	}
	
	public String toString() {
		return super.toString() + "\nOffice Hours: " + officeHours + "\nRank: " + rank;
	}

}
