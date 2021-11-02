package trying;

public class TryExceptExample {

	public static void first() {
		System.err.println("starting first");
		try {

			second();
		} catch (Exception e) {
			System.out.println("calling second was bad");
		}
		System.err.println("finish first");
	}

	public static void second() {
		System.err.println("starting second");
		// int i = 1 / 0;
		int[] arr = new int[4];
		try {
			int i = arr[4];
		} catch (Exception e) {
			System.err.println("caught in second");
		}
		System.err.println("finish second");
	}

	public static void f0() throws Exception {
		try {

			f1();
		} catch (Exception theException) {
			System.out.println("caught f1 exception in f0");
		}

		f1();
	}

	public static void f1() throws Exception {
		Exception e = new Exception();

		throw e;

	}

	public static void zeroth() {
		try {
			first();
		} catch (ArithmeticException e) {
			System.out.println("caught arith in main");
			// e.printStackTrace();
			System.err.println("stack trace printed");

		} catch (Exception e) {
			System.out.println("caught other exception");
		}
	}

	public static void main(String[] args) throws Exception {

		try {
			f0();
		} catch (Exception e) {

		}
	}

}
