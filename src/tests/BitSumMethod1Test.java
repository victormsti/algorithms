package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import main.BitSumMethod1;

class BitSumMethod1Test {

	BitSumMethod1 bitSum = new BitSumMethod1();
	@Test
	void testBitSumCondition1() {
		assertEquals("11001", bitSum.bitSum("1101","1100"));
	}
	
	@Test
	void testBitSumCondition2() {
		assertTrue(bitSum.bitSum("101","11").equals("1000"));
	}


}
