package part3;

import java.util.ArrayList;

public class RecursionExamples {

	
	public int sillyFunc(int n) {
		if( n ==0 ) {
			return 0;
		}else {
			return 1+sillyFunc(n-1);
		}
	}
	
	public int fib( int n) {
		if( n == 0) {
			return 1;
		}else if( n == 1) {
			return 1;
		}else {
			return fib(n-1) + fib(n-2);
		}
	}
	
	public int addList(ArrayList<Integer> list) {
		
		return addListHelper(0, list);
	}
	
	public int addListHelper(int index, ArrayList<Integer> list) {
		if( index == list.size()) {
			return 0;
		}else {
			return list.get(index) + 
					addListHelper(index+1, list);
		}
		
	}
}
