
public class ClassTester {
	// Program that tests the Students and Course classes
	public static void main(String[] args) {
		// Creating two courses
		Course course1 = new Course(1, "BINF8211");
		Course course2 = new Course(2, "BINF6006");
		
		// Creating the student
		Students student = new Students(811496619, "Tony Pham");
		
		// Adding the courses to the student's list
		student.addCourse(course1);
		student.addCourse(course2);
		
		// Displaying the student's information
		System.out.println("The student's ID is " + student.getStudentID());
		System.out.println("The student's name is " + student.getStudentName());
		System.out.println("The student's courses are " + student.CourseArray[0].getCourseName() + " and " + student.CourseArray[1].getCourseName());

	}

}
