package part2;

public class A {

	public void g() {
		System.out.println("A version of G");
	}
	
	public void f() {
		System.out.println("A version of f");
	}
	
	public void h() {
		System.out.println("calling H");
		f();
	}
	
	public A() {
		System.out.println( "constructing A");
	}
}
