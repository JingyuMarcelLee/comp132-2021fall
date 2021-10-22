package part2;

public class Professor extends Employee {

	private String courseName;
	
	public Professor( String name, String cn) {
		super(name);
		
		courseName = cn;
	}
	
	public String getCourseName() {
		return courseName;
	}
	
	public String getTitle() {
		return "doctor professor phd";
	}
	
	
	
}
