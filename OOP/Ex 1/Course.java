
public class Course {
	// Defining fields
	int courseID;
	String courseName;
	
	// Constructor
	Course(int courseID, String courseName){
		this.courseID = courseID;
		this.courseName = courseName;
	}
	
	// Methods
	public int getCourseID() {
		return courseID;
	}
	
	public String getCourseName() {
		return courseName;
	}
	
	public void setCourseID(int courseID) {
		this.courseID = courseID;
	}
	
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

}
