import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Squirrel implements MakesSound{
	

	double weight;
	
	public Squirrel(double weight ) {
		this.weight = weight;
	}
	@Override
	public String getSound() {
		return "squirrel squirrel";
	}

	@Override
	public String xYearOldImitiationSound(int x) {
		
		return "cheep cheep";
	}

	

	public int compareTo(Squirrel that) {
		
		if( this.weight < that.weight) {
			return -1;
		}else if( this.weight == that.weight) {
			return 0;
		}else {
			return 1;
		}
	}
	
	
	public String toString() {
		return this.weight + "";
	}
	
	public static void main (String[] args) {
		Random rnd = new Random();
		Squirrel s0 = new Squirrel(rnd.nextInt(6));
		Squirrel s1 = new Squirrel(rnd.nextInt(10));
		
		if( s0.compareTo(s1) <0) {
			System.out.println("s0 is smaller" + s0.weight);
		}
		
		ArrayList<Squirrel> squirrels = new ArrayList<>();
		for(int i =0 ; i < 10; i++) {
			squirrels.add(new Squirrel(rnd.nextInt(20)));
		}
		
		System.out.println(squirrels);
		
		Collections.sort(squirrels);
		
		System.out.println(squirrels);
	}
	@Override
	public int compareTo(MakesSound o) {
		
		return this.getSound().compareTo(o.getSound());
	}

}
