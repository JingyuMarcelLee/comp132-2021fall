package adt;

public class LinkedNode {
	
	LinkedNode next; 
	
	Object value; 
	
	public LinkedNode( Object v) {
		value = v;
		next = null;
	}
	
	public LinkedNode( Object v, LinkedNode n) {
		value = v; 
		next = n;
	}
	

	public void setNext(LinkedNode n) {
		next =n;
	}

}
