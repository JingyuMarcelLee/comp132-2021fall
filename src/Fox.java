import java.util.ArrayList;

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
		animals.add(new Squirrel());
		
		for( MakesSound m : animals) {
			System.out.println(m.getSound());
			System.out.println(m.xYearOldImitiationSound(3));
			
			if( m instanceof Fox) {

				Fox theFox = (Fox) m;
				System.out.println(theFox.howSwims());
			}
			
		}
		
		
	}

	@Override
	public String xYearOldImitiationSound(int x) {
		if(x == 1) {
			return "rawr";
		}else {
			return "foxes dont make noises";
		}
	}
	
	
	
	

}
