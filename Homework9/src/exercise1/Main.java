package exercise1;

public class Main {

	public static void main(String[] args) {
		CoursePhase[] phases = CoursePhase.values(); 
		for(CoursePhase phase: phases) {
			System.out.println(phase.name());
			System.out.println("message: " + phase.getMessage());
		}
	}

}
