package part2;

public class TextMessage extends Object{

	private String message;

	private String number;
	
	public TextMessage( String m, String n) {
		message = m;
		number = n;
	}
	
	public String getNumber() {
		return number;
	}
	
	public String getMessage() {
		return message;
	}
	
	public String getType() {
		return "Text";
	}
	
	public void print() {
		System.out.println("printing");
		System.out.println(getMessage());
		System.out.println(getType());
		
	}
	
	public boolean equals( TextMessage other) {
		return this.message.equals(other.message);
	}
	
	
	
}
