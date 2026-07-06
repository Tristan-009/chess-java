package com.tristan.chess.pieces;

import com.tristan.chess.board.Board;
import com.tristan.chess.utils.Position;

public class Rook extends Piece {

    public Rook(Boolean isWhite) {
        super(isWhite);
    }

    @Override
    public String getSymbol() {
        return isWhite ? "R" : "r";
    }

    @Override
    public boolean isValidMove(
            Position from,
            Position to,
            Board board) {

        // pas même ligne ni même colonne
        if (from.getRow() != to.getRow() &&
                from.getCol() != to.getCol()) {
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
