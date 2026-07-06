package com.tristan.chess.board;

import com.tristan.chess.utils.Position;
import com.tristan.chess.pieces.*;

public class Board {

    private Piece[][] grid = new Piece[8][8];

    public Board() {
        initBoard();
    }

    private void initBoard() {

        // Vider le plateau
        for (int row = 0; row < 8; row++) {
            for (int col = 0; col < 8; col++) {
                grid[row][col] = null;
            }
        }
        // Pions noirs
        for (int col = 0; col < 8; col++) {
            grid[1][col] = new Pawn(false);
        }

        // Pions blancs
        for (int col = 0; col < 8; col++) {
            grid[6][col] = new Pawn(true);
        }

        // Tours noires
        grid[0][0] = new Rook(false); // a8
        grid[0][7] = new Rook(false); // h8

        // Tours blanches
        grid[7][0] = new Rook(true); // a1
        grid[7][7] = new Rook(true); // h1

        // Cavaliers noirs
        grid[0][1] = new Knight(false); // b8
        grid[0][6] = new Knight(false); // g8

        // Cavaliers blancs
        grid[7][1] = new Knight(true); // b1
        grid[7][6] = new Knight(true); // g1

        // Fous noirs
        grid[0][2] = new Bishop(false); // c8
        grid[0][5] = new Bishop(false); // f8

        // Fous blancs
        grid[7][2] = new Bishop(true); // c1
        grid[7][5] = new Bishop(true); // f1

        // Reines
        grid[0][3] = new Queen(false); // d8
        grid[7][3] = new Queen(true);  // d1

        // Rois
        grid[0][4] = new King(false); // e8
        grid[7][4] = new King(true);  // e1
    }

    // Version classique
    public Piece getPiece(int row, int col) {
        return grid[row][col];
    }

    public void setPiece(int row, int col, Piece piece) {
        grid[row][col] = piece;
    }

    public Piece getPiece(Position position) {
        return grid[position.getRow()][position.getCol()];
    }

    public void setPiece(Position position, Piece piece) {
        grid[position.getRow()][position.getCol()] = piece;
    }

    public void movePiece(Position from, Position to) {

        Piece piece = getPiece(from);

        if (piece == null) {
            System.out.println("Aucune pièce ici.");
            return;
        }

        if (!piece.isValidMove(from, to, this)) {
            System.out.println("Coup illégal.");
            return;
        }

        setPiece(to, piece);
        setPiece(from, null);
    }

    // Vérifie si une case est sur le plateau
    public boolean isInsideBoard(int row, int col) {
        return row >= 0 && row < 8 &&
                col >= 0 && col < 8;
    }

    // Affichage du plateau
    public void display() {
        System.out.println("  a b c d e f g h");

        for (int row = 0; row < 8; row++) {
            System.out.print((8 - row) + " ");
            for (int col = 0; col < 8; col++) {
                Piece piece = grid[row][col];

                if (piece == null) {
                    System.out.print(". ");
                } else {
                    System.out.print(piece.getSymbol() + " ");
                }
            }

            System.out.println(" " + (8 - row));
        }

        System.out.println("  a b c d e f g h");
    }
}