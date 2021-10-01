import java.util.Random;

public class Restaurant {

	double quality;
	double goodVisits;
	double badVisits;
	Random rand;
	
	public Restaurant(double quality) {
		this.quality =quality;
		goodVisits = 0;
		badVisits =0;
		rand = new Random();
	}
	
	public boolean visit() {
		
		double val = rand.nextDouble();
		if(val > quality) {
			goodVisits++;
			return true;
		}else {
			badVisits++;
			return false;
		}
	}
	
	public double getKnownQuality() {
		if(goodVisits+badVisits == 0) {
			return 1;
		}else {
			return goodVisits / (goodVisits+badVisits);
		}
	}
	
	
	public static void main(String[] args) {
		Random r = new Random();
		Restaurant a = new Restaurant(r.nextDouble());
		Restaurant b = new Restaurant(r.nextDouble());
		
		int totalVisits = 10;
		double good = 0;
		double bad = 0;
		for(int i=  0; i < totalVisits; i++) {
			double val = r.nextDouble();
			boolean curVisit;
			if(val > .50) {
				curVisit = a.visit();
			}else {
				curVisit = b.visit();
			}
			if(curVisit) {
				good++;
			}
		}
		System.out.println(good/totalVisits);
		
	}
}
