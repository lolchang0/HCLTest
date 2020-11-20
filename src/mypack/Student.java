package mypack;

public class Student {
	int studentID;
	char studentType;
	
	public Student(int studentID, char studentType) {
		this.studentID = studentID;
		this.studentType = studentType;
	}
	public void setStudentID(int studentID) {
		this.studentID = studentID;
	}
	public void setStudentType(char studentType) {
		this.studentType = studentType;
	}
	public int getStudentID() {
		return studentID;
	}
	public char getStudentType() {
		return studentType;
	}
}
