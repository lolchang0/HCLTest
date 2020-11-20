package mypack;

public class Student9 {
	int studentID;
	static char studentType;
	static String studentName;
	
	public Student9(char sType, String fname, String lname) {
		this.studentType = sType;
		this.studentName = fname + " " + lname;
	}
	
	public static void displayDetails(Student9 student) {
		System.out.println(studentType + " " + studentName);
	}
	
	public static void main(String args[]) {
		Student9 student = new Student9('F', "Kevin", "Chang");
		displayDetails(student);
	}
}
