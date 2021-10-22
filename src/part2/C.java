package part2;

import java.util.ArrayList;

public class C extends B{
	
	public void f() {
		System.out.println("C version of f");
	}
	public C() {
		super();
		System.out.println("Constructing C");
	}
	
	public static void main(String[] args) {
		A theAC = new C();
		B theBC = new C();
		C theCC = new C();
		theAC.f();
		theBC.f();
		theCC.f();
		
		theAC.g();
		theBC.g();
		theCC.g();
		
		A actuallyA = new A();
		actuallyA.h();
		
		theAC.h();
		theBC.h();
		theCC.h();
		
		A theAD = new D();
		theAD.h();
		
		//theAC.superWeird();
		theBC.superWeird();
		
		B actuallyB = new B();
		
		ArrayList<A> allTheThings = new ArrayList<>();
		allTheThings.add(actuallyA);
		allTheThings.add(actuallyB);
		allTheThings.add(theCC);
		allTheThings.add(theAC);
		allTheThings.add(theBC);
		
		for( A anAObject : allTheThings) {
			anAObject.h();
		}
		
		
	}

}
