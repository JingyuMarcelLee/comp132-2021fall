package trying;

import static org.junit.Assert.*;

import org.junit.Test;

public class BestExceptionTest {

	@Test
	public void test() {
		fail("Not yet implemented");
	}

	@Test
	public void testCrashCrash() {
		try {

			BestException.crash(1);
			fail("testCrashCrash didnt crash");
		} catch (Exception e) {

		}
	}

	@Test
	public void testCrashNoCrash() {

		try {
			BestException.crash(5);
		} catch (Exception e) {
			fail("testCrashNoCrash did crash");
		}

	}

}
