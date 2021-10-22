package part2;

public class B extends A {

	public void g() {
		System.out.println("B version of G");
	}
	
	public void f() {
		System.out.println("B version of F");
	}
	
	public void superWeird() {
		System.out.println("superweird");
		super.f();
		
	}
	public B() {
		super();
		System.out.println("constructing B");
	}
}
