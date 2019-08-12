package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import main.TruncateString;

class TruncateStringTest {
	TruncateString truncate = new TruncateString();

	@Test
	public void testTruncateAInFristTwoPositionsCondition1() {
		assertTrue(truncate.truncateAInFristTwoPositions("AABB").equals("BB"));
	}
	
	@Test
	public void testTruncateAInFristTwoPositionsCondition2() {
		assertTrue(truncate.truncateAInFristTwoPositions("ABBA").equals("BBA"));
	}
	
	@Test
	public void testTruncateAInFristTwoPositionsCondition3() {
		assertTrue(truncate.truncateAInFristTwoPositions("AAAA").equals("AA"));
	}
	
	@Test
	public void testTruncateAInFristTwoPositionsCondition4() {
		assertEquals("CE", truncate.truncateAInFristTwoPositions("AACE"));
	}
	
	@Test
	public void testAreFirstAndLastTwoCharactersTheSameCondition1() {
		assertEquals(false, truncate.areFirstAndLastTwoCharactersTheSame("abae"));
	}
	
	@Test
	public void testAreFirstAndLastTwoCharactersTheSameCondition2() {
		assertTrue(truncate.areFirstAndLastTwoCharactersTheSame("abcab"));
	}
	
	@Test
	public void testAreFirstAndLastTwoCharactersTheSameCondition3() {
		assertFalse(truncate.areFirstAndLastTwoCharactersTheSame("abctr"));
	}

}
