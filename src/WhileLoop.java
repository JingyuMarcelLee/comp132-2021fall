
public class WhileLoop {

	public static void main(String[] args) {
		
		
		long start = 3; 
		
		
		while( start!=1) {
			System.out.println(start);
			if( start%2 == 0) {
				start = start/2;
			}else {
				start = start*3+1;
			}
		}
		
		int counter = 0;
		while(counter< 100) {
			System.out.println(counter);
			counter+=1;
		}
		
		int x = 0;
		while(x*x -25 <= x) {
			x+=1;
		}
		System.out.println(x);
		
	}
}
