
public class ClassName {

	private int myIntField;
	private String myStringField;
	
	public ClassName( int initialField) {
		myIntField = initialField;
		myStringField = "didnt initialize string field";
		
		// dont do this
		//initialField = myIntField;
	}
	
	public ClassName( int initialIntValue, String initialStringValue) {
		myIntField = initialIntValue;
		myStringField = initialStringValue;
	}
	
	public void print() {
		System.out.println(myIntField + " " + myStringField);
	}
	
	public void add5ToIntField() {
		myIntField = myIntField +5;
		int localVariable = 7;
		print();
	}
	
	public int getMyIntField() {
		return myIntField;
	}
	
	
	
	public static void main(String[] args) {
		ClassName classNameObject = new ClassName(5);
		ClassName classNameInstance = new ClassName(3, "aoeu");
		classNameObject.print();
		classNameObject.add5ToIntField();
		classNameInstance.print();
		// ClassName is a data type already
		
		classNameObject.method(4,5);
		//
		//classNameObject.method("aoeu4",5);
		
		System.out.println( -17/4);
		System.out.println( 45/80);
		
		// mod operator, remainder operator 
		System.out.println( 17%4);// 1
		
		double x = 3.4;
		System.out.println(.1+.2);
		
		boolean b = (4==5); 
		boolean c = true;
	}
	
	public void method(int parameter0, int parameter1) {
		System.out.println("concatenate " + " this string");
	}
}
