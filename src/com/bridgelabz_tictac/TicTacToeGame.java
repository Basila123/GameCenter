package com.bridgelabz_tictac;

public class TicTacToeGame {
    //declaring char array as static
    static char board[]=new char[10];
    public static void main(String[] args){
        System.out.println("WELCOME TO THE GAME");
        // calling the method createBoard
        createBoard();
    }
    // Method to create an empty character array
    public static void createBoard(){
        for(int i =1; i<board.length;i++){
            board[i]= ' ';

        }
    }
}
