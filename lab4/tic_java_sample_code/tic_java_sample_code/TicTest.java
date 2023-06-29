package tic;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TicTest {

	@Test
	void testEqual() {
		Tic board = new Tic(3, 3);
		board.move(0, 1);
		Tic board2 = new Tic(3,3);
		board2.move(1, 0);
		assertEquals(board.equals(board2),  true);
	}

}