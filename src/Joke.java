import java.util.Scanner;

public class Joke {
	
	private String intro;
	private String response1;
	private String response2;
	private Scanner s;
	
	public Joke(String initIntro, String initResponse1
			, String initResponse2) {
		intro = initIntro;
		response1 = initResponse1;
		response2 = initResponse2;
		s = new Scanner(System.in);
		
	}
	
	public void tellJoke() {
		System.out.println(intro);
		String response = s.nextLine();
		System.out.println("you said " + response);
		if( response.equals(response1)) {
			System.out.println("actually it's "+ response2);
		}else if( response.equals(response2)){
			System.out.println("actually it's "+ response1);
		}else {
			System.out.println(response1 + "!");
		}
	}

	
	public static void main(String[] args) {

		Joke j = new Joke("Where does a fruit go on vacation?",
				"Paris", "Pear-is");
		
//		String s = "abc";
//		String t = "ab";
//		t = t+"c";
//		//t = t.intern();
//		System.out.println(s + " " + t);
//		if( s == t) {
//			System.out.println("==");
//		}else {
//			System.out.println("!=");
//		}
		
	}
}
