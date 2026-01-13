package assignment_10;

public class StudentAdmission {
	 	String studentName;
	    String admissionType;
	    StudentAdmission() {
	        studentName = "Unknown";
	        admissionType = "General Admission";
	    }
	    StudentAdmission(String studentName) {
	        this.studentName = studentName;
	        admissionType = "Merit Admission";
	    }
	    void display() {
	        System.out.println("Student Name: " + studentName);
	        System.out.println("Admission Type: " + admissionType);
	        System.out.println();
	    }
}
