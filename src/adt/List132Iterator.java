package adt;

import java.util.Iterator;

public class List132Iterator implements Iterator {

	LinkedNode next;
	
	public List132Iterator( LinkedNode n) {
		next = n;
	}
	
	@Override
	public boolean hasNext() {
		
		return next.next !=null;
	}

	@Override
	public Object next() {
		
		// return the actual value, not the node
		Object returnValue = next.value;
		next = next.next;
		return returnValue;
		
	}

}
