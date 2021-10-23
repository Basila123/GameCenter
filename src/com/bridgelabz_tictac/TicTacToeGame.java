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
        do {
            if (player == 'X') {
            computer = 'O';
            System.out.println("Player is :" + player);
            System.out.println("Computer is" + computer);

        } else if (player == 'O') {
            computer = 'X';
            System.out.println("Player is:" + player);
            System.out.println("Computer is:" + computer);
        }
        else {
            System.out.println("Invalid entry");
            System.out.println("Do you want to try again press 'Y'for yes or 'N' for no");
            //  Scanner c=new Scanner(System.in);
            play = sc.next().charAt(0);
        }
    }while(play=='Y'|| play=='y');


        //play.close();
    }
}
