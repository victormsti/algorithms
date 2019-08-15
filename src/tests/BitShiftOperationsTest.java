package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import main.BitShiftOperations;

class BitShiftOperationsTest {
	
	BitShiftOperations bit = new BitShiftOperations();
	
	@Test
	void testDoShiftRight() {
		assertEquals(1, bit.doShiftRight(8, 3));
	}
	
	@Test
	void testDoShiftRightThrow() {
		assertThrows(IllegalArgumentException.class, ()-> bit.doShiftRight(8, 22));
	}

	@Test
	void testDoShiftLeft() {
		assertEquals(12, bit.doShiftLeft(3, 2));
	}

}
