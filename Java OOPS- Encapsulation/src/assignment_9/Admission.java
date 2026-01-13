package assignment_9;

public class Admission {
	private int marks;
	private char grade;
	
	Admission(int marks) {
		setMarks(marks);
	}
	
	public void setMarks(int marks) {
		this.marks = marks;
		if(marks > 90) {
			grade = 'A';
		}
		else if(marks >80) {
			grade = 'B';
		}
		else if(marks > 70) {
			grade = 'C';
		}
		else {
			grade = 'F';
		}
	}
	public String getResult() {
		return "Marks: " +this.marks+ ", Grade: " +grade;
	}
	
}
