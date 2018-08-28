/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;


import chess.ChessMatch;
import chess.ChessPiece;
import chess.ChessPosition;
import java.util.Scanner;

/**
 *
 * @author Walter
 */
public class Program {
    
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        ChessMatch cm = new ChessMatch();
        
        while(true){
            UI.printBoard(cm.getPieces());
            System.out.println();
            System.out.print("Source: ");
            ChessPosition source = UI.reedChessPosition(sc);
            
            System.out.println();
            System.out.print("target: ");
            ChessPosition target = UI.reedChessPosition(sc);
            
            ChessPiece capturedPiece = cm.performChessMove(source, target);
        
        }
        
        
    }
    
}
