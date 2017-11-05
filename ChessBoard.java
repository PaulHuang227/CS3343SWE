package chess;

import piece.Piece;

public class ChessBoard 
{
	private Cell[][] board;
	private static ChessBoard theChessBoard = new ChessBoard();

	public ChessBoard()
	{
		board = new Cell[8][8];
	}
	
	public void initialize(int x, int y, Piece p)
	{
		Cell cell = new Cell(x, y, p);
		board[x][y] = cell;
	}

	public static ChessBoard getInstance() {
		return theChessBoard;
	}
}
