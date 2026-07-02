package com.tristan.chess.pieces;

public class Bishop extends Piece{

    public Bishop(Boolean isWhite) {
        super(isWhite);
    }

    @Override
    public String getSymbol() {
        return isWhite ? "b" : "B";
    }
}
