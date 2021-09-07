import static org.junit.Assert.*;

import org.junit.Test;

public class CandidateTest {

	@Test
	public void testConstructor() {
		Candidate myCandidate = new Candidate("Elena", 
				"i dont know", 9);
		assertEquals("Elena", myCandidate.getName());
		assertEquals("i dont know", myCandidate.getParty());
		assertEquals(9, myCandidate.getVotes());
	}
	
	@Test
	public void testSetParty() {
		Candidate myCandidate = new Candidate("Elena", 
				"i dont know", 9);
		myCandidate.setParty("a");
		assertEquals("a", myCandidate.getParty());
	}
	
	@Test
	public void testIncreaseVotesZeroArgument() {
		Candidate myCandidate = new Candidate("Elena", 
				"i dont know", 9);
		myCandidate.increaseVotes();
		assertEquals(10, myCandidate.getVotes());
	}
	
	@Test
	public void testIncreaseVotesOneArgument() {
		Candidate myCandidate = new Candidate("Elena", 
				"i dont know", 9);
		myCandidate.increaseVotes(15);
		assertEquals(24, myCandidate.getVotes());
	}


}
