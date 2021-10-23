package com.bridgelabz_tictac;
import java.util.*;
public class TicTacToeGame {
    //declaring char array as static
    static char board[] = new char[10];
    static char computer = ' ';
    static char player = ' ';
    static char play = ' ';
    static boolean continu = true;
    //static boolean continu= true;
    public static void main(String[] args) {
        System.out.println("WELCOME TO THE GAME");
        // calling the method createBoard
        createBoard();
        userInput();
        showBoard();
    }

    // Method to create an empty character array
    public static void createBoard() {
        for (int i = 1; i < board.length; i++) {
            board[i] = ' ';

        }
    }

    //Method to create selecting the symbols 'X' or 'O'
    public static void userInput() {
        System.out.println("Enter a character 'X' or 'O'");
        // giving preferance to player
        Scanner sc = new Scanner(System.in);
        player = sc.next().toUpperCase(Locale.ROOT).charAt(0);
            if (player == 'X') {
                computer = 'O';
                System.out.println("Player is :" + player);
                System.out.println("Computer is" + computer);

            } else if (player == 'O') {
                computer = 'X';
                System.out.println("Player is:" + player);
                System.out.println("Computer is:" + computer);
            } else {
                System.out.println("Invalid data. Please enter the choice");
                userInput();

            }


        //play.close();

    }
    public static void showBoard(){
        System.out.println("|---|---|---|");
        System.out.println("| " + board[1] + " | "
                + board[2] + " | " + board[3]
                + " |");
        System.out.println("|-----------|");
        System.out.println("| " + board[4] + " | "
                + board[5] + " | " + board[6]
                + " |");
        System.out.println("|-----------|");
        System.out.println("| " + board[7] + " | "
                + board[8] + " | " + board[9]
                + " |");
        System.out.println("|---|---|---|");
    }
}

