package mypack;

public class CourseManager {
	public static void main(String[] args) {
		Student kevin = new Student(10, 'F');
		//kevin.setStudentID(10);
		//kevin.setStudentType('F');
		System.out.println(kevin.getStudentID() + " " + kevin.getStudentType());
	}
}
