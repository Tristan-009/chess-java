package com.tristan.chess;
import com.tristan.chess.pieces.Piece;
import com.tristan.chess.board.Board;
import com.tristan.chess.pieces.Knight;
import com.tristan.chess.utils.Position;

public class Main {

    public static void main(String[] args) {
        Board board = new Board();
        board.display();

        Board b = new Board();
        Position king = new Position(7, 4);

        System.out.println(
                board.getPiece(king).getSymbol()
        );


    }
}
