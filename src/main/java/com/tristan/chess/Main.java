package com.tristan.chess;

import com.tristan.chess.board.Board;
import com.tristan.chess.utils.Position;

public class Main {

    public static void main(String[] args) {

        Board board = new Board();

        board.display();

        Position from = new Position(6,4); // e2
        Position to = new Position(4,4);   // e4

        board.movePiece(from, to);

        System.out.println();

        board.display();
    }
}