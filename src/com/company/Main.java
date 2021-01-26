package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    var ttt = new TicTacToe();
	    var scanner = new Scanner(System.in);

	    while (true) {
	        printBoard(ttt);

            System.out.print("Enter row and column index (row column): ");

            var row = scanner.nextInt();
            var column = scanner.nextInt();

            System.out.println();

            var result = ttt.placeMark(row-1, column-1);

            if(result == GameResult.X_WON) {
                System.out.println("X WON !!!");
                break;
            } else if(result == GameResult.O_WON) {
                System.out.println("O WON !!!");
                break;
            } else if(result == GameResult.DEUCE) {
                System.out.println("DEUCE !!!");
                break;
            }
        }
    }

    public static void printBoard(TicTacToe ttt) {
       var board = ttt.getBoard();

        System.out.println("---1---2---3--");

        for (int i = 0; i < board.length; i++) {
            System.out.print(i+1);
            for (int j = 0; j < board[i].length; j++) {
                var item = "";
                if(board[i][j] == FieldType.EMPTY) {
                    item = "|   ";
                } else {
                    item = "| " +board[i][j]+ " ";
                }
                System.out.print(item);
            }
            System.out.println("|");
            System.out.println("--------------");
        }
    }
}
