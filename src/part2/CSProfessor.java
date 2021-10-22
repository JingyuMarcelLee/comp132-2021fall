package part2;

public class CSProfessor extends Professor{

	String spreadsheet;
	
	public CSProfessor(String s, String cn, String name) {
		super(name, cn);
		spreadsheet= s;
		
	}
	public String getTitle() {
		return "tech wizard";
	}
	public String getFavSpreadsheet() {
		return spreadsheet;
	}
	public String getCourseName() {
		return "awesome " + super.getCourseName();
	}
	
	
}
