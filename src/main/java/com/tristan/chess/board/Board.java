package com.tristan.chess.board;
import com.tristan.chess.pieces.*;

public class Board {

    private Piece[][] grid = new Piece[8][8];

    public Board() {
        initBoard();
    }

    private void initBoard() {
        for (int row = 0; row < 8; row++) {
            for (int col = 0; col < 8; col++) {
                grid[row][col] = null;
            }
        }
    }

    public Piece getPiece(int row, int col) {
        return grid[row][col];
    }

    public void setPiece(int row, int col, Piece piece) {
        grid[row][col] = piece;
    }

    public boolean isInsideBoard(int row, int col) {
        return row >= 0 && row < 8 && col >= 0 && col < 8;
    }

    public void display() {
        System.out.println("  a b c d e f g h");

        for (int row = 0; row < 8; row++) {
            System.out.print((8-row) + " ");

            for (int col = 0; col < 8; col++) {
                Piece piece = grid[row][col];

                if (piece == null) {
                    System.out.print(". ");
                } else {
                    System.out.print(piece.getSymbol() + " ");
                }
            }
            System.out.println(" " + (8 - row));
        }
        System.out.println("  a b c d e f g h");
    }
}
