
public static class  StaticFinalDemo {
	
	int notStaticInt;
	static int staticInt;
	
	public StaticFinalDemo() {
		notStaticInt = 5;
		staticInt = 10;
	}
	
	public static void staticFunc() {
		System.out.println("im static " + staticInt);
	}
	
	public void notStaticFunc() {
		System.out.println("im not static " + notStaticInt + staticInt);
	}
	public static void main(String[] args) {
		
		StaticFinalDemo sfd = new StaticFinalDemo();
		
		System.out.println(staticInt);
		
		// doesnt work
		//System.out.println(notStaticInt);
		
		System.out.println(sfd.notStaticInt);
		
		// a little weird
		System.out.println(sfd.staticInt);
		
		System.out.println(StaticFinalDemo.staticInt);
		
		
		StaticFinalDemo.staticFunc();
		
		sfd.notStaticFunc(); 
		
		System.out.println( Math.abs(-3));
		System.out.println( Math.min(4,10));
		
	}

}
