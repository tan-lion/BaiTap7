import java.util.ArrayList;
import java.util.List;

public class Student {
	String name;
	int yearOld;
	float math;
	float physic;
	float chemistry;
	List<Student> listStudent = new ArrayList<>();

	public Student() {
	}

	public Student(String name, int yearOld, float math, float physic, float chemistry) {
		super();
		this.name = name;
		this.yearOld = yearOld;
		this.math = math;
		this.physic = physic;
		this.chemistry = chemistry;
	}

	@Override
	public String toString() {
		return "name: " + name + ", yearOld: " + yearOld + ", math: " + math + ", physic: " + physic + ", chemistry: "
				+ chemistry;
	}

	//Function list student
	public void listStudent() {

		// Declare
		Student student_1 = new Student("Student 1", 20, 6, 7, 8);
		Student student_2 = new Student("Student 2", 21, 7, 7, 8);
		Student student_3 = new Student("Student 3", 22, 8, 8, 8);

		// add student
		listStudent.add(student_1);
		listStudent.add(student_2);
		listStudent.add(student_3);

		// Output
		for (Student student : listStudent) {
			System.out.println(student);
		}
	}

	// Function average score
	public void averageScore() {
		for (Student subStudent : listStudent) {
			System.out.println("Name: " + subStudent.name + ", Average score: "
					+ ((subStudent.math + subStudent.physic + subStudent.chemistry) / 3));
		}
	}

}
