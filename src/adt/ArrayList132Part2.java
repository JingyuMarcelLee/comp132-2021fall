package adt;

public class ArrayList132Part2 implements ListADT{

	Object[] arr;
	int size;  
	
	public ArrayList132Part2() { 
		arr = new Object[10];
		size = 0;
	}
	
	@Override
	public void add(Object item) {
		
		
		if( size == arr.length) {
			// instead of adding one item, we will double the arr
			// this will let us do fewer copies
			Object[] newArr = new Object[size*2];
			for(int i = 0; i < size; ++i) {
				newArr[i] = arr[i];
			}
			arr = newArr;
		}
		
		/// we know theres space now 
		arr[size] = item;
		size++;
		
	}

	@Override
	public void insert(int i, Object item) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Object get(int i) {
		// should throw an error for index 
		// out of bounds ( 0 <= i < size)
		return arr[i];
	}

	@Override
	public int size() {
		
		return size;
	}

	@Override
	public Object remove(int i) {
		
		
		// just need to copy elements past the removed
		// element to lower index
		
		Object o = arr[i] ;
		for( int ii = i+1; ii < size; ++ii) {
			arr[ii-1]=arr[ii];
		}
		size--; 
		return o;
	}

	@Override
	public void set(int i, Object item) {
		
		arr[i] = item;
		
	}

	
	
}
