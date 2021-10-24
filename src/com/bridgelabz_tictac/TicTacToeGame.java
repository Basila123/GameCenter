package com.bridgelabz_tictac;
import java.util.*;
import java.util.stream.IntStream;

public class TicTacToeGame {
    //declaring char array as static
    static char board[] = new char[10];
    static char computer = ' ';
    static char player = ' ';
    static char turn = ' ';
    static String winner = null;
    static boolean continu = true;
    static String line = null;

    //static boolean continu= true;
    public static void main(String[] args) {
        System.out.println("WELCOME TO THE GAME");
        // calling the method createBoard
        showBoard();
        createBoard();
        userInput();
        makeMove();
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



/*{
        Scanner in = new Scanner(System.in);
        board = new String[9];
        turn = "X";
        String winner = null;

        for (int a = 0; a < 9; a++) {
            board[a] = String.valueOf(a + 1);
        }

        System.out.println("Welcome to 3x3 Tic Tac Toe.");
        printBoard();

        System.out.println(
            "X will play first. Enter a slot number to place X in:");

        while (winner == null) {
            int numInput;

           // Exception handling.
           // numInput will take input from user like from 1 to 9.
           // If it is not in range from 1 to 9.
           // then it will show you an error "Invalid input."
            try {
                numInput = in.nextInt();
                if (!(numInput > 0 && numInput <= 9)) {
                    System.out.println(
                        "Invalid input; re-enter slot number:");
                    continue;
                }
            }
            catch (InputMismatchException e) {
                System.out.println(
                    "Invalid input; re-enter slot number:");
                continue;
            }

            // This game has two player x and O.
            // Here is the logic to decide the turn.
            if (board[numInput - 1].equals(
                    String.valueOf(numInput))) {
                board[numInput - 1] = turn;

                if (turn.equals("X")) {
                    turn = "O";
                }
                else {
                    turn = "X";
                }

                printBoard();
                winner = checkWinner();
            }
            else {
                System.out.println(
                    "Slot already taken; re-enter slot number:");
            }
        }

        // If no one win or lose from both player x and O.
        // then here is the logic to print "draw".
        if (winner.equalsIgnoreCase("draw")) {
            System.out.println(
                "It's a draw! Thanks for playing.");
        }

        // For winner -to display Congratulations! message.
        else {
            System.out.println(
                "Congratulations! " + winner
                + "'s have won! Thanks for playing.");
        }
    }*/

