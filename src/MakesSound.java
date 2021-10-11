import java.util.Random;

public interface MakesSound extends Comparable<MakesSound> {

	
	public final static int aoeu=30;
	public String getSound();
	
	public String xYearOldImitiationSound(int x);
	
	
	public static boolean sameSound( MakesSound ms1, MakesSound ms2) {
		
		if( ms1 instanceof Squirrel && ms2 instanceof Squirrel) {
			
			return ((Squirrel) ms1).toString().compareTo(
					((Squirrel) ms2).toString()) > 0;
			
		}
		
		return ms1.getSound().equals( ms2.getSound());
	}
	
	
	public static void main(String[] args) {
		double d = -434.5234;
		int i = (int) d;
		long l = Math.round(d);
		double d2 = (double) i;
		System.out.println(d2);
		
		//String s = (String) d2;
		String s = ""+ d2;
		
		Fox f = new Fox();
		
		MakesSound ms1;
		
		Random rnd = new Random();
		if( rnd.nextBoolean()) {
			ms1 = new Fox();
		}else {
			ms1 = new Squirrel(545.5);
		}
		Squirrel squir;
		
		if( ms1 instanceof Squirrel) {
			squir = (Squirrel) ms1;
		}else {
			System.out.println("cant change Fox to Squirrel");
		}
		
		
		
		
		
		
		
	}
}
