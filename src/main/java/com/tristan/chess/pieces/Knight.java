package com.tristan.chess.pieces;

import com.tristan.chess.board.Board;
import com.tristan.chess.utils.Position;

public class Knight extends Piece {

    public Knight(boolean isWhite) {
        super(isWhite);
    }

    @Override
    public String getSymbol() {
        return isWhite ? "N" : "n";
    }

    @Override
    public boolean isValidMove(
            Position from,
            Position to,
            Board board) {

        int rowDiff =
                Math.abs(to.getRow() - from.getRow());

        int colDiff =
                Math.abs(to.getCol() - from.getCol());

        return (rowDiff == 2 && colDiff == 1) || (rowDiff == 1 && colDiff == 2);
    }
}