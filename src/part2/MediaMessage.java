package part2;

public class MediaMessage extends TextMessage{
	
	private String file;
	
	public MediaMessage( String m, String n, String f) {

		super(m,n);
		
		file = f;
	}
	
	public void print() {
		super.print();
		System.out.println("file = " +file);
		
	}
	
	public boolean equals(MediaMessage other) {
		if( !super.equals(other)) {
			return false;
		}else {
			return other.file.equals(this.file);
		}
	}
	
	
	public static void main(String[] args) {
		MediaMessage mm = new MediaMessage("heres a message",
				 "8675309", "file.jpg");
		System.out.println( mm.getMessage());
		System.out.println(mm.getType());
		
		TextMessage tm = new TextMessage("im a text", 
				"1234");
		tm.print();
		
		mm.print();
		
		System.out.println(mm.getNumber());
	}
	
	public String getType() {
		return "media";
	}

}
