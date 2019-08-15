package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import main.LeftPaddingOperations;

class LeftPaddingOperationsTest {
	LeftPaddingOperations leftPadding = new LeftPaddingOperations();
	@Test
	void testDoLeftPadding1() {
		assertEquals("00100101", leftPadding.doLeftPadding1("100101", 8));
	}

	@Test
	void testDoLeftPadding2() {
		assertEquals("00100101", leftPadding.doLeftPadding2("100101", 8));
	}

}
