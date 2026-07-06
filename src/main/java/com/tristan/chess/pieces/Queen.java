package com.tristan.chess.pieces;

import com.tristan.chess.board.Board;
import com.tristan.chess.utils.Position;

public class Queen extends Piece {

    public Queen(Boolean isWhite) {
        super(isWhite);
    }

    @Override
    public String getSymbol() {
        return isWhite ? "Q" :"q";
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

        boolean rookMove =
                from.getRow() == to.getRow()
                        ||
                        from.getCol() == to.getCol();

        boolean bishopMove =
                rowDiff == colDiff;

        if (!rookMove && !bishopMove) {
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

        while (row != to.getRow() ||
                col != to.getCol()) {

            if (board.getPiece(row, col) != null) {
                return false;
            }

            row += rowStep;
            col += colStep;
        }

        return true;
    }
}
