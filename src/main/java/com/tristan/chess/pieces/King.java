package com.tristan.chess.pieces;

public class King extends Piece {

    public King(Boolean isWhite) {
        super(isWhite);
    }

    @Override
    public String getSymbol() {
        return isWhite ? "k" : "K";
    }
}

