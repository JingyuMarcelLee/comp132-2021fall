package part2;

public class AdaptedSqurrel implements MakesSound {

	private Squirrel s;
	
	public AdaptedSqurrel() {
		s =new Squirrel("squirrel name");
	}

	@Override
	public String getTheSound() {
	
		return s.getSound();
	}
	
}
