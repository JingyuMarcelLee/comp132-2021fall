package trying;

public class ThrowExample {

	
	public void bleh() {
		System.out.println();
		Exception myExcept = new Exception();
		throw myExcept;
	}
	
	public static void main(String[] args) {
		try {
			ThrowExample te = new ThrowExample();
			te.bleh();
		} catch(Exception e) {
			e.printStackTrace();
			System.out.println("aiieee");
		} finally {
			System.out.println("finally");
		}
		
		
	}
}
