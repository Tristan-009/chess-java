package com.tristan.chess;
import com.tristan.chess.pieces.Piece;
import com.tristan.chess.board.Board;
import com.tristan.chess.pieces.Knight;

public class Main {

    public static void main(String[] args) {
        Board board = new Board();
        board.display();

        Piece p = new Knight(true);
        System.out.println(p.getSymbol());

    }
}
