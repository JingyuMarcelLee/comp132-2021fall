package part2;

public class Employee {

	private String name;
	
	public Employee(String n) {
		name = n;
	}
	
	public String getTitle() {
		return "Employee";
	}
	
	public String getName() {
		return name;
	}
	
	public void printIntroduction() {
		
		System.out.println("hello " + getTitle() + " " 
				+ getName());
	}
	
	public static void main(String[] args) {
		Employee e = new Employee("Nam");
		e.printIntroduction();
		
		Employee prof =
				new Professor("marcel", "robot dog guns");
		prof.printIntroduction();
		
		Professor profAsProfessor = (Professor) prof;
		System.out.println( profAsProfessor.getCourseName());
		
		profAsProfessor.printIntroduction();
		
		Employee csProf = new CSProfessor( "robot spreadsheet", "impoliteness robots","liwen");
		csProf.printIntroduction();
		Professor csProfAsProf = (Professor) csProf;
		System.out.println(csProfAsProf.getCourseName());
		
		
	}
	
}
