package tic;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TicTest {

	@Test
	void testEqual() {
		Tic board = new Tic(3, 3);
		board.move(0, 1);
		Tic board2 = new Tic(3,3);
		board2.move(0, 1);
		assertEquals(board.equals(board2),  true);
	}

	@Test
    void testEmpty() {
        Tic board = new Tic(3, 3);

        assertEquals(board.isEmpty(), true);
    }

	@Test
    void testWinner() {
        board.move(0, 0); board.move(1, 0); board.move(2, 0);
		board.move(0, 1); board.move(1, 1); board.move(2, 1);
		board.move(0, 2); board.move(1, 2); board.move(2, 2);
        board.move(0, 1);
        assertEquals(board.isWin(), true);
    }

	@Test
    void testMoveLegal() {
        Tic board = new Tic(3, 3);
        board.move(0, 2);
        boolean move = board.move(0, 1);
        assertEquals(move, true);
    }

	@Test
    void testBoardFull() {
		board.move(0, 0); board.move(1, 0); board.move(2, 0);
		board.move(0, 1); board.move(1, 1); board.move(2, 1);
		board.move(0, 2); board.move(1, 2); board.move(2, 2);
        Tic board = new Tic(3, 3);
        assertEquals(board.isFull(), true);
    }
}