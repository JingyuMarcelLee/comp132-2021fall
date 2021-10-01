import java.util.ArrayList;
import java.util.Scanner;

public class Practice0924 {

	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		ArrayList<Double> list = new ArrayList<Double>();
		Integer x = sc.nextInt();
		
		for(int i = 0; i < x; ++i) {
			double d = sc.nextDouble();
			list.add(d);
		}
		
		for( Double d : list) {
			System.out.println(d+10);
		}
		
		ArrayList<Double> positives = new ArrayList<>();
		
		for(Double d : list) {
			if( d >=0 ) {
				positives.add(d);
			}
		}
		
		
		
	}
}
