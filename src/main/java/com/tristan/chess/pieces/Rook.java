package com.tristan.chess.pieces;

public class Rook extends Piece {

    public Rook(Boolean isWhite) {
        super(isWhite);
    }

    @Override
    public String getSymbol() {
        return isWhite ? "R" : "r";
    }
}
