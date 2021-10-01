import java.util.Random;

public class RandomDemo {
	
	public static void main(String[] args) {
		
		Random r = new Random();
		
		
		for(int i = 0; i < 10; ++i) {
			int num = r.nextInt(10);
			
			double randD = r.nextDouble();
			System.out.println(num);
			System.out.println(randD);
		}
	}

}
