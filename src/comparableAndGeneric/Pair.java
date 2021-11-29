package comparableAndGeneric;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Random;
import java.util.TreeSet;

public class Pair implements Comparable<Pair> {

	private int first, second;
	
	public int getFirst() {
		return first;
	}

	public void setFirst(int first) {
		this.first = first;
	}

	public int getSecond() {
		return second;
	}

	public void setSecond(int second) {
		this.second = second;
	}

	public Pair( int f, int s) {
		first = f;
		second = s;
	}
	
	@Override
	public int compareTo(Pair o) {
		
		if( this.first < o.first) {
			return -1;
		}else if( this.first > o.first) {
			return 1;
		}else if( this.second < o.second) {
			return -1;
		}else if( this.second > o.second) {
			return 1;
		}else {
			return 0;
		}
	}
	public String toString() {
		return first + " " + second;
	}
	
	
	public static void main(String[] args) {
		
		ArrayList< Pair> pairs = new ArrayList<>();
		
		Random rnd = new Random();
		int size = 10;
		for( int i = 0 ; i < size; ++i) {
			pairs.add( new Pair( rnd.nextInt(10), 
					rnd.nextInt(10)));
			
		}
		System.out.println("hello");
		System.out.println(pairs);
		Collections.sort(pairs);
		System.out.println(pairs);
		Comparator<Pair> secondEle = new ComparePairSecdonElement();
		Collections.sort(pairs, secondEle);
		Comparator<Pair> onlySec = new ComparePairOnlySecond();
		Collections.shuffle(pairs);
		System.out.println(pairs);
		Collections.sort(pairs, onlySec);
		System.out.println(pairs);
		
		PriorityQueue<Pair> pqPairs = new PriorityQueue<>(secondEle);
		pqPairs.addAll(pairs);
		
		while(pqPairs.size() > 0) {
			System.out.println(pqPairs.poll());
		}
		
		TreeSet< Pair> tsPair = new TreeSet<>(pairs);
		System.out.println( tsPair.higher(new Pair(4,4)));)
	}

}
