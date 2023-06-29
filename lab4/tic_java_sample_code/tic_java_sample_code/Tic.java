package tic;

public class Tic {
	String[][] board;
	int rows;
	int cols;
	String turn;
	public Tic(int row, int col) {
		board = new String[row][col];
		rows = row;
		cols = col;
		turn = "X";
		for(int i = 0; i<row; i++) {
			for(int j = 0; j<col; j++) {
				board[i][j] = "_";
			}
		}
	}

	public String getTurn() {
		return turn;
	}

	public String[][] getBoard() {
		return board;
	}

	public void setTurn(String turn) {
		this.turn = turn;
	}

	public void setBoard(String[][] board) {
		this.board = board;
	}

	public boolean isFull() {
		for(int i = 0; i<rows; i++) {
			for(int j = 0; j<cols; j++) {
				if(board[i][j].equals("_")) {
					return false;
				}
			}
		}
		return true;
	}

	public boolean isWin() {
		for(int i = 0; i<rows; i++) {
			if(board[i][0].equals(board[i][1]) && board[i][1].equals(board[i][2]) && !board[i][0].equals("_")) {
				return true;
			}
		}
		for(int i = 0; i<cols; i++) {
			if(board[0][i].equals(board[1][i]) && board[1][i].equals(board[2][i]) && !board[0][i].equals("_")) {
				return true;
			}
		}
		if(board[0][0].equals(board[1][1]) && board[1][1].equals(board[2][2]) && !board[0][0].equals("_")) {
			return true;
		}
		if(board[0][2].equals(board[1][1]) && board[1][1].equals(board[2][0]) && !board[0][2].equals("_")) {
			return true;
		}
		return false;
	}

	public boolean isValid(int row, int col) {
		if(row<0 || row>2 || col<0 || col>2) {
			return false;
		}
		if(board[row][col].equals("_")) {
			return true;
		}
		return false;
	}

	public boolean move(int row, int col) {
		if (!isValid(row, col)) return false;
		board[row][col] = turn;
		if(turn.equals("X")) {
			turn = "O";
		}
		else {
			turn = "X";
		}
		return true;
	}

	public String toString() {
		String result = "";
		for(int i = 0; i<rows; i++) {
			for(int j = 0; j<cols; j++) {
				result += board[i][j];
			}
			result += "\n";
		}
		return result;
	}

	public boolean equals(Object obj) {
		if(obj instanceof Tic) {
			Tic tic = (Tic) obj;
			if(tic.getTurn().equals(turn)) {
				for(int i = 0; i<rows; i++) {
					for(int j = 0; j<cols; j++) {
						if(!tic.getBoard()[i][j].equals(board[i][j])) {
							return false;
						}
					}
				}
				return true;
			}
		}
		return false;
	}

	public boolean isEmpty() {
		for(int i = 0; i<rows; i++) {
			for(int j = 0; j<cols; j++) {
				if(!board[i][j].equals("_")) {
					return false;
				}
			}
		}
		return true;
	}
}