package com.tristan.chess.pieces;

import com.tristan.chess.board.Board;
import com.tristan.chess.utils.Position;
public abstract class Piece {
    protected boolean isWhite;
    public Piece(boolean isWhite) {
        this.isWhite = isWhite;

    }
    public boolean isWhite() {
        return isWhite;

    }
    public abstract String getSymbol();

    public abstract boolean isValidMove(
            Position from,
            Position to,
            Board board
    );
}