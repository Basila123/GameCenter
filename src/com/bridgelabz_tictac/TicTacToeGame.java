package com.bridgelabz_tictac;
import java.util.*;
import java.util.Random;

public class TicTacToeGame {
    //declaring char array as static
    static char board[] = new char[10];
    static char computer = ' ';
    static char player = ' ';
    static char turn = ' ';
    static boolean continu = true;
    //static  ran;


    //static boolean continu= true;
    public static void main(String[] args) {
        System.out.println("WELCOME TO THE GAME");
        // calling the method createBoard

        showBoard();
        createBoard();
        userInput();
        while(continu) {
            showBoard();
            makeMove();
        }
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
        Random ran = new Random();
        int random=ran.nextInt(2);
        System.out.println(ran);
        if(random==0) {
            System.out.println("Head");
            board[ran.nextInt(9) + 1] = computer;
        }
        else{
            System.out.println("Tail");
            System.out.println("Player turn");
            makeMove();
        }

        //play.close();

    }

    public static void showBoard() {
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
    //make move
    public static void makeMove(){
        System.out.println("Choose an index from 1 to 9 to write 'X': ");
        Scanner scanner = new Scanner(System.in);
        int index = scanner.nextInt();
        if (board[index]==' '){
            board[index]=player;
        }else{
            System.out.println("   ****** Choose an empty place! ******   ");
            System.out.println();
            makeMove();
        }
    }

}



