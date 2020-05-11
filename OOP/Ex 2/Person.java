
public class Person {
	protected String name;
	protected String phone;
	protected String SSN;
	
	Person(){
		name = "No name";
		phone = "No phone number";
		SSN = "No SSN";
	}
	
	Person(String name, String phone, String SSN){
		this.name = name;
		this.phone = phone;
		this.SSN = SSN;
	}
	
	public String toString() {
		return "Name: " + name + "\nPhone: " + phone + "\nSSN: " + SSN;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	public String getPhone() {
		return phone;
	}
	
	public void setSSN(String SSN) {
		this.SSN = SSN;
	}
	
	public String getSSN() {
		return SSN;
	}
}
