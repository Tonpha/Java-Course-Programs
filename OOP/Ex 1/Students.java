
public class Students {
	// Defining fields
	int studentID;
	String studentName;
	int numberOfCourses = 0;
	Course[] CourseArray = new Course[5];
	
	// Constructor
	Students(int studentID, String studentName) {
		this.studentID = studentID;
		this.studentName = studentName;
	}
	
	// Methods
	public int getStudentID() {
		return studentID;
	}
	
	public String getStudentName() {
		return studentName;
	}
	
	public void setStudentID(int studentID) {
		this.studentID = studentID;
	}
	
	public void setStudentName (String studentName) {
		this.studentName = studentName;
	}
	
	public boolean addCourse(Course course) {
		// Check if the course array is full
		if (numberOfCourses == CourseArray.length) {
			System.out.println("The course list is full.");
			return false;
		} else {
			// Add the new course and increase the course count
			CourseArray[numberOfCourses] = course;
			numberOfCourses++;
			return true;
		}
	}

}
