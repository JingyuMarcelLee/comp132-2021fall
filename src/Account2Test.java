import static org.junit.Assert.*;

import org.junit.Test;

public class Account2Test {

	@Test
	public void test() {
		fail("Not yet implemented");
	}
	
	@Test 
	public void test2() {
		assertEquals(5, 5-0);
		assertTrue( 5==5);
		//assertEquals(.3, .1+.2);
		assertEquals(.3, .1+.2, .0001);
		assertTrue( (Math.abs(.3-.1-.2) < .0001));
	}

}
