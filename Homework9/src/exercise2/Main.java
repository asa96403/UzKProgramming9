package exercise2;

public class Main {

	public static void main(String[] args) {
		StudentFormatter shortFormat = s -> "Student " + s.name() + " , Year " + s.year();
		StudentFormatter longFormat = s -> s.name() + " studies " + s.major() + " in Year " + s.year();
		Student[] students = { new Student("André", 2, "Computer Science"), new Student("Max", 4, "Art"), new Student("Person", 3, "BWL") };
		for (int i = 0; i < students.length; i++) {
			System.out.println("Student " + (i+1)+ " :");
			System.out.println(shortFormat.format(students[i]));
			System.out.println(longFormat.format(students[i]));
		}
	}
}
