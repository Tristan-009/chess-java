package com.tristan.chess;
import com.tristan.chess.pieces.Piece;
import com.tristan.chess.board.Board;
import com.tristan.chess.pieces.Knight;
import com.tristan.chess.utils.Position;

public class Main {

    public static void main(String[] args) {
        Board board = new Board();
        board.display();

        Position p = new Position(6, 4);

        System.out.println(p.getRow());
        System.out.println(p.getCol());

    }
}
