package comparableAndGeneric;

import java.util.Comparator;

public class ComparePairSecdonElement implements Comparator<Pair>  {

	@Override
	public int compare(Pair o1, Pair o2) {
		
		if(o1.getSecond() < o2.getSecond()) {
			return -1;
		}else if(o1.getSecond() > o2.getSecond()) {
			return 1;
		}else {
			return o1.getFirst()-o2.getFirst();
		}
		
	}

}
