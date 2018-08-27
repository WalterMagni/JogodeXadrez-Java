/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import boardgame.Board;
import boardgame.Position;
import chess.ChessMatch;

/**
 *
 * @author Walter
 */
public class Program {
    
    public static void main(String[] args){
        
        ChessMatch cm = new ChessMatch();
        UI.printBoard(cm.getPieces());
        
    }
    
}
