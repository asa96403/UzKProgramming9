package exercise1;

public enum CoursePhase {
	NOTSTARTED("Course not started yet"),
	ONGOING("Course is in progress"),
	FINISHED("Course has ended");
	
	private String message;
	private CoursePhase(String message) {
		this.message=message;
	}
	
	public String getMessage() {
		return message;
	}
}
