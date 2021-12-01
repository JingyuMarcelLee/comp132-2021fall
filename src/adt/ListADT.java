package adt;

public interface ListADT {

	
	// adding items of type Object allows us
	// to add any object
	public void add( Object item);
	
	public void insert( int i, Object item);
	
	public Object get(int i); 
	
	public int size(); 
	
	public Object remove( int i); 
	
	public void set( int i, Object item); 
	
}
