
public class Employee extends Person{
	protected String office;
	protected double salary;
	
	Employee(){
		super();
		office = "No Office";
	}
	
	Employee(String name, String phone, String SSN, String office, double salary){
		super(name, phone, SSN);
		this.office = office;
		this.salary = salary;
	}
	
	public String toString() {
		return super.toString() + "\nOffice: " + office + "\nSalary: " + salary;
	}

}
