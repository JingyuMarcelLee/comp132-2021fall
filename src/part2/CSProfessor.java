package part2;

public class CSProfessor extends Professor {

	String spreadsheet;

	public CSProfessor(String s, String cn, String name) {
		super(name, cn);
		spreadsheet = s;

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

	public boolean equals(Object other) {
		if (!(other instanceof CSProfessor)) {
			return false;
		} else {

			CSProfessor oth = (CSProfessor) other;
			return getName().equals(oth.getName());
		}
	}

}
