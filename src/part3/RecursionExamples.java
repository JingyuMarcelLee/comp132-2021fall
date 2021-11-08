package part3;

import java.util.ArrayList;
import java.util.Random;

public class RecursionExamples {

	public static int sillyFunc(int n) {
		if (n == 0) {
			return 0;
		} else {
			return 1 + sillyFunc(n - 1);
		}
	}

	public static int fib(int n) {
		if (n == 0) {
			return 1;
		} else if (n == 1) {
			return 1;
		} else {
			return fib(n - 1) + fib(n - 2);
		}
	}

	public static int addList(ArrayList<Integer> list) {

		return addListHelper(0, list);
	}

	public static int addListHelper(int index, ArrayList<Integer> list) {
		if (index == list.size()) {
			return 0;
		} else {
			return list.get(index) + addListHelper(index + 1, list);
		}

	}

	// move soure pile to dest pile
	public static void move(ArrayList<ArrayList<Integer>> piles, int source, int dest, int num) {

		ArrayList<Integer> curPile = piles.get(source);
		ArrayList<Integer> destPile = piles.get(dest);
		int otherIndex = 3 - source - dest;
		// System.out.println(piles);
		if (num == 1) {
			int lastItem = curPile.remove(curPile.size() - 1);
			destPile.add(lastItem);
			System.out.println(piles);

		} else {
			move(piles, source, otherIndex, num - 1);
			int curItem = curPile.remove(curPile.size() - 1);
			destPile.add(curItem);
			System.out.println(piles);

			move(piles, otherIndex, dest, num - 1);
		}

	}

	public static int coinRow(int curIndex, ArrayList<Integer> val) {

		if (curIndex == 0) {
			return val.get(0);
		} else if (curIndex == 1) {
			return Math.max(val.get(0), val.get(1));
		}

		int take = val.get(curIndex) + coinRow(curIndex - 2, val);
		int leave = coinRow(curIndex - 1, val);
		return Math.max(take, leave);

	}

	public static ArrayList<Integer> coinRowSol(int curIndex, ArrayList<Integer> val) {

		if (curIndex == 0) {
			ArrayList<Integer> result = new ArrayList<>();
			result.add( val.get(0));
			return result;
		} else if (curIndex == 1) {
			ArrayList<Integer> result = new ArrayList<>();
			result.add(  Math.max(val.get(0), val.get(1)));
			return result;
		}

		ArrayList<Integer> takeList = 
				coinRowSol(curIndex - 2, val);
		int take = val.get(curIndex);
		for(int i : takeList) {
			take+=i;
		}
		ArrayList<Integer> leaveList = 
				coinRowSol(curIndex - 1, val);
		int leave = 0;
		for(int i : leaveList) {
			leave+=i;
		}
		if( take > leave) {
			takeList.add(val.get(curIndex));
			return takeList;
		}else {
			return leaveList;
		}

	}
	
	public static ArrayList<Integer> coinRowSol( ArrayList<Integer> val){
		return coinRowSol(val.size()-1, val);
	}
	
	
	public static int pow( int x, int n) {
		if( n == 0) {
			return 1;
		}
		
		int recCall = pow(x,n/2);
		if( n %2 == 0) {
			int result = recCall*recCall; 
			return result;
		}else {
			int result = recCall*recCall*x;
			return result;
		}
		
		
		
	}
	
	
	public static int countZs(String s) {
		
		return countZs(s, 0, s.length());
		
	}
	
	public static int countZs(String s, int start, int end) {
		if( end-start == 1) {
			if( s.charAt(start) == 'z') {
				return 1;
			}else {
				return 0;
			}
		}
		
		int mid = (start+end)/2;
		int firstHalf = countZs(s, start, mid);
		int secondHalf =countZs(s, mid, end); 
		return firstHalf+secondHalf;
		
	}
	
	public static ArrayList<String> permute(String s){
		ArrayList<String> results = new ArrayList<>();
		
		if(s.length() == 1) {
			results.add( s);
			return results;
		}
		
		for(int i = 0; i < s.length(); ++i) {
			String newString = s.substring(0,i) +  
					s.substring(i+1, s.length());
			System.out.println(newString);
			ArrayList<String> recurResult = 
					permute(newString); 
			for(String r : recurResult) {
				results.add(s.charAt(i) + r); 
			}
		}
		
		return results;
		
		
		
	}

	public static void main(String[] args) {
		/*
		 * ArrayList< ArrayList<Integer> > piles = new ArrayList<>();
		 * 
		 * piles.add(new ArrayList<>()); piles.add(new ArrayList<>()); piles.add(new
		 * ArrayList<>());
		 * 
		 * for(int i = 10; i >=1; --i) { piles.get(0).add(i);
		 * 
		 * } move(piles, 0, 2, 10);
		 */
		Random rnd = new Random();
		ArrayList<Integer> vals = new ArrayList<>();
		for (int i = 0; i < 100; ++i) {
			vals.add(rnd.nextInt(10));
		}
		//ArrayList<Integer> result = coinRowSol( vals);
		//System.out.println(vals);
		//System.out.println(result);
		
		System.out.println(permute("ABCDEF"));
	}
}
