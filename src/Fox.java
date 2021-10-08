import java.util.ArrayList;
import java.util.Random;

public class Fox implements MakesSound, Swims{

	@Override
	public String getSound() {
		
		return "ring a ding";
	}

	@Override
	public String howSwims() {
		
		return "fox paddle";
	}
	
	public static void main(String[] args) {
		Fox f= new Fox();
		MakesSound animal = new Fox();
		
		//doesnt work
		//System.out.println(animal.howSwims());
		
		Fox backToFox = (Fox) animal;
		System.out.println(backToFox.howSwims());
		
		System.out.println(f.howSwims());
		
		ArrayList<MakesSound> animals = new ArrayList<>();
		
		animals.add( new Fox());
		animals.add(new Squirrel(30));
		
		for( MakesSound m : animals) {
			System.out.println(m.getSound());
			System.out.println(m.xYearOldImitiationSound(3));
			
			if( m instanceof Fox) {

				Fox theFox = (Fox) m;
				System.out.println(theFox.howSwims());
			}
			
		}
		
		Squirrel ska = new Squirrel(39);
		
		isSoundTooLong(f);
		
		isSoundTooLong(animal);
		isSoundTooLong(ska); 
		
		
	}

	@Override
	public String xYearOldImitiationSound(int x) {
		if(x == 1) {
			return "rawr";
		}else {
			return "foxes dont make noises";
		}
	}
	
	
	static boolean isSoundTooLong( MakesSound m) {
		//sound is too long if its > 10 characters
		
		return m.getSound().length() > 10;
		
	}
	
	static void printSound(MakesSound m) {
		
		if( m.getSound().length()> 1) {
			System.out.println(m.xYearOldImitiationSound(4));
		}
	}
	
	static void makeSoundTest() {
		
		Random rnd = new Random();
		MakesSound ms;
		
		if( rnd.nextBoolean()) {
			ms = new Squirrel(54);
		}else {
			ms = new Fox();
		}
		
		System.out.println(ms.getSound());
	}

	@Override
	public int compareTo(MakesSound o) {
		
		return this.getSound().compareTo(o.getSound());
	}
	
	

}
