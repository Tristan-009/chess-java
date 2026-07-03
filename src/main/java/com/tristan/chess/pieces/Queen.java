package com.tristan.chess.pieces;

public class Queen extends Piece {

    public Queen(Boolean isWhite) {
        super(isWhite);
    }

    @Override
    public String getSymbol() {
        return isWhite ? "Q" :"q";
    }
}
