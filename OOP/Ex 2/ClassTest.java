
public class ClassTest {
	// Program that tests the Employee, Faculty, Person, Staff, and Student classes
	public static void main(String[] args) {
		// Creates an object of each class Person, Student, Employee, Faculty, and Staff
		Person p = new Person("Joe Brown", "123-123-1234", "123-12-1234");
		Student s1 = new Student("Brittany Smith", "234-234-2345", "234-23-2345", "junior");
		Employee e = new Employee("Nick Jones", "345-345-3456", "345-34-3456", "Boyd324", 34000);
		Faculty f = new Faculty("Kait Lunes", "456-456-4567", "456-45-4567", "Boyd111", 80000, "3-5", "Associate");
		Staff s2 = new Staff("Rowan Powers", "567-56-5678", "567-56-5678", "Boyd202", 26000);
		
		// Prints info for each object
		System.out.println("The Person object contains:\n" + p.toString() + "\n");
		System.out.println("The Student object contains:\n" + s1.toString() + "\n");
		System.out.println("The Employee object contains:\n" + e.toString() + "\n");
		System.out.println("The Faculty object contains:\n" + f.toString() + "\n");
		System.out.println("The Staff object contains:\n" + s2.toString() + "\n");

	}

}
