/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chess;

import boardgame.Board;
import chess.pieces.King;
import chess.pieces.Rook;

/**
 *
 * @author Walter
 */
public class ChessMatch {
    
    private Board board;
    
    public ChessMatch(){
        board = new Board(8,8);
        initialSetup();
    }
    
    public ChessPiece[][] getPieces(){
        ChessPiece[][] mat  = new ChessPiece[board.getRows()][board.getColums()];
        for (int i = 0; i < board.getRows(); i++) {
            for (int j = 0; j < board.getColums(); j++) {
                mat[i][j] = (ChessPiece) board.piece(i,j);
            }            
        }
        return mat;
    }
    
    private void placeNewPiece(char column, int row, ChessPiece piece) {
        board.placePiece(piece, new ChessPosition(column, row).toPosition());
    }
    
    private void initialSetup() {
        placeNewPiece('c', 1, new Rook(board, Color.BRANCO));
        placeNewPiece('c', 2, new Rook(board, Color.BRANCO));
        placeNewPiece('d', 2, new Rook(board, Color.BRANCO));
        placeNewPiece('e', 2, new Rook(board, Color.BRANCO));
        placeNewPiece('e', 1, new Rook(board, Color.BRANCO));
        placeNewPiece('d', 1, new King(board, Color.BRANCO));

        placeNewPiece('c', 7, new Rook(board, Color.PRETO));
        placeNewPiece('c', 8, new Rook(board, Color.PRETO));
        placeNewPiece('d', 7, new Rook(board, Color.PRETO));
        placeNewPiece('e', 7, new Rook(board, Color.PRETO));
        placeNewPiece('e', 8, new Rook(board, Color.PRETO));
        placeNewPiece('d', 8, new King(board, Color.PRETO));
    }
    
}
