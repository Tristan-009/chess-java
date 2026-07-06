package com.tristan.chess.pieces;

import com.tristan.chess.board.Board;
import com.tristan.chess.utils.Position;

public class Bishop extends Piece{

    public Bishop(Boolean isWhite) {
        super(isWhite);
    }

    @Override
    public String getSymbol() {
        return isWhite ? "B" : "b";
    }

    @Override
    public boolean isValidMove(
            Position from,
            Position to,
            Board board) {

        int rowDiff =
                Math.abs(
                        to.getRow()
                                - from.getRow());

        int colDiff =
                Math.abs(
                        to.getCol()
                                - from.getCol());

        // déplacement diagonal
        if (rowDiff != colDiff) {
            return false;
        }

        int rowStep =
                Integer.compare(
                        to.getRow(),
                        from.getRow());

        int colStep =
                Integer.compare(
                        to.getCol(),
                        from.getCol());

        int row = from.getRow() + rowStep;
        int col = from.getCol() + colStep;

        while (row != to.getRow()) {

            if (board.getPiece(row, col) != null) {
                return false;
            }

            row += rowStep;
            col += colStep;
        }

        return true;
    }
}
