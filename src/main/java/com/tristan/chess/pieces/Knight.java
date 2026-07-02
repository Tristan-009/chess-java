package com.tristan.chess.pieces;

public class Knight extends Piece {

    public Knight(Boolean isWhite) {
        super(isWhite);
    }

    @Override
    public String getSymbol() {
        return isWhite ? "n" : "N";
    }
}
