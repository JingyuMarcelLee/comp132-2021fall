package adt;

import java.util.Arrays;

public class ArrayList132 implements ListADT {

	Object[] arr;

	// make a size 0 array to start
	public ArrayList132() {
		arr = new Object[0];
	}

	@Override
	public void add(Object item) {

		// arrays dont expand. if we want
		// a bigger one, we have to make a new one
		Object[] newArr = new Object[size() + 1];

		// copy over the old stuff
		for (int i = 0; i < arr.length; ++i) {
			newArr[i] = arr[i];

		}

		// add new item
		newArr[size()] = item;
		// overwrite old array
		arr = newArr;

	}

	@Override
	public void insert(int i, Object item) {
		// TODO Auto-generated method stub

	}

	@Override
	public Object get(int i) {

		return arr[i];
	}

	@Override
	public int size() {

		return arr.length;
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

	public static void main(String[] args) {

		ArrayList132 arrList = new ArrayList132();
		arrList.add("zeroth");
		arrList.add("oneth");
		
		// actually add an Integer
		arrList.add(2);
		System.out.println(Arrays.toString(arrList.arr));
	
		System.out.println( arrList.get(1));
		System.out.println(arrList.size());
	
	}

}
