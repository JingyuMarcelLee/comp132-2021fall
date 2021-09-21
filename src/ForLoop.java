
public class ForLoop {
	
	
	public static void main(String[] args) {
		int sum=0;
		for( int i = 30; i <= 50; i += 2
		) {
			sum = sum +i;
			
		}
		System.out.println(sum);
		
		for(int posPrime = 2; posPrime < 100; posPrime++) {
			boolean hasDiv = false;
			for( int j = 2; j < posPrime; ++j){
				if(posPrime%j == 0) {
					hasDiv = true;
				}
			}
			if(!hasDiv) {
				System.out.println(posPrime);
			}
		}
	}

}
