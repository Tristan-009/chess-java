package com.tristan.chess.pieces;

import com.tristan.chess.board.Board;
import com.tristan.chess.utils.Position;

public class Pawn extends Piece {

    public Pawn(boolean isWhite) {
        super(isWhite);
    }

    @Override
    public String getSymbol() {
        return isWhite ? "P" : "p";
    }

    @Override
    public boolean isValidMove(
            Position from,
            Position to,
            Board board
    ) {

        int direction = isWhite ? -1 : 1;

        int rowDiff = to.getRow() - from.getRow();
        int colDiff = to.getCol() - from.getCol();

        // avancer d'une case
        if (colDiff == 0 &&
                rowDiff == direction &&
                board.getPiece(to) == null) {
            return true;
        }

        // avancer de deux cases au départ
        if (colDiff == 0 &&
                rowDiff == 2 * direction &&
                board.getPiece(to) == null) {

            if (isWhite && from.getRow() == 6) {
                return true;
            }

            if (!isWhite && from.getRow() == 1) {
                return true;
            }
        }

        return false;
    }
}