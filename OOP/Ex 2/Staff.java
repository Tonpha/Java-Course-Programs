
public class Staff extends Employee{
	
	Staff(){
		super();
	}
	
	Staff(String name, String phone, String SSN, String office, double salary){
		super(name, phone, SSN, office, salary);
	}
	
	public String toString() {
		return super.toString();
	}

}
