import java.util.ArrayList;

public class ForEachDemo {
	
	public static void main(String[] args) {
		
		ArrayList<String> stuff = new ArrayList<>();
		stuff.add("zeroth");
		stuff.add("oneth");
		stuff.add("twoth");
		
		for(int i = 0; i < stuff.size(); ++i) {
			System.out.println(stuff.get(i));
		}
		
		//for each
		for(String item : stuff) {
			System.out.println(item);
		}
		
	}

}
