package adt;

import java.util.Iterator;

public class LinkedListPart2 implements ListADT, Iterable{


	LinkedNode head;
	int size;
	
	public LinkedListPart2() {
		head = null;
		size = 0;
	}
	
	
	@Override
	public void add(Object item) {
		
		// make a new node
		LinkedNode newNode = new LinkedNode(item);
		
		//if the list is empty, make the newNode the head
		if( size == 0) {
			head = newNode;
			size = 1;
		}else {
			// we are going to find the last node
			LinkedNode lastNode = head;
			
			while( lastNode.next!= null) {
				lastNode = lastNode.next;
			}
			lastNode.next = newNode;
			size++;
			
			
		}
		
	}

	@Override
	public void insert(int i, Object item) {
		
		// first check for valid index
		if( i < 0 || i >=size) {
			throw new IndexOutOfBoundsException();
		}
		
		LinkedNode newNode = new LinkedNode(item);
		
		
		if( i ==0) {
			newNode.next = head;
			head = newNode;
		}else {
			// find the node before the insertion point
			LinkedNode nodeBefore = head;
			
			int nodesLeft = i-1;
			while( nodesLeft != 0) {
				nodeBefore = nodeBefore.next;
				nodesLeft--;
			}
			newNode.next = nodeBefore.next;
			nodeBefore.next = newNode;
		}
		
		
	}

	@Override
	public Object get(int i) {
		
		int curSteps = 0;
		
		LinkedNode cur = head;
		// until we've gone the right number of steps,
		// keep stepping 
		while( curSteps < i) {
			cur = cur.next;
			// increment curSteps
			curSteps ++;
		}
		return cur.value;
	}

	@Override
	public int size() {
		
		return size;
	}

	@Override
	public Object remove(int i) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void set(int i, Object item) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public Iterator iterator() {
		
		return new List132Iterator(head);
	}
	
	public static void main(String[] args) {
		LinkedListPart2 myList = new LinkedListPart2();
		myList.add("aoeu");
		myList.add("oneth");
		myList.add("twoth");
		for(int i = 0; i < 50000; ++i) {
			myList.add(i);
		}
		
		// traverse in 3 ways
		System.out.println("hello");
		// first, is with get 
		for(int i = 0; i < myList.size(); ++i) {
			System.out.println(myList.get(i));
		}
		
		// explicit iterator
		Iterator iter = myList.iterator();
		
		while(iter.hasNext()) {
			System.out.println("explicit iterator") ;
			//get next value
			Object o = iter.next();
			// next both gets the value and advances the iterator
			System.out.println(o) ;
		}
		
		// for each loop
		for( Object o : myList) {
			System.out.println("for each") ;
			System.out.println(o);
		}
		
	}

}
