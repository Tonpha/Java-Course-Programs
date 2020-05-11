
public class Student extends Person{
	private String status;
	
	Student(){
		super();
		status = "No Status Given";
	}
	
	Student(String name, String phone, String SSN, String status){
		super(name, phone, SSN);
		this.status = status;
	}
	
	public String toString() {
		return super.toString() + "\nStatus: " + status;
	}

}
