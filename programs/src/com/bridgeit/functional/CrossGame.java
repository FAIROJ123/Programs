/*
 * @Purpose:Write a Program to play a Cross Game or Tic-Tac-Toe Game. Player 1 is the Computer and the Player 2 is the user. Player 1 take Random Cell that is the Column and Row. 
 * @Author:S.Fairoj
 * @Date:16/03/2018.
 */

package com.bridgeit.functional;

import java.util.InputMismatchException;
import java.util.Scanner;

import com.bridgeit.utillity.Util;

public class CrossGame 
{
	static String[] board;
	static String turn;
	
public static void main(String[] args)
{
	    Util util=new Util();
		Scanner in = new Scanner(System.in);
		board = new String[9];
		turn = "X";
		String winner = null;
		Util.populateEmptyBoard(board);

		System.out.println("Welcome to 2 Player Tic Tac Toe.");
		System.out.println("--------------------------------"); 	
		
		util.printBoard(board);
		System.out.println("X's will play first. Enter a slot number to place X in:");

		while (winner == null) {
			int numInput;
			try {
				numInput = in.nextInt();
				if (!(numInput > 0 && numInput <= 9)) {
					System.out.println("Invalid input; re-enter slot number:");
					continue;
				}
			} catch (InputMismatchException e) {
				System.out.println("Invalid input; re-enter slot number:");
				continue;
			}
			if (board[numInput-1].equals(String.valueOf(numInput))) {
				board[numInput-1] = turn;
				if (turn.equals("X")) {
					turn = "O";
				} else {
					turn = "X";
				}
				util.printBoard(board);
				winner = util.checkWinner(board,turn);
			} 
			else 
			{
				System.out.println("Slot already taken; re-enter slot number:");
				continue;
			}
		}
		if (winner.equalsIgnoreCase("draw")) {
			System.out.println("It's a draw! Thanks for playing.");
		} else {
			System.out.println("Congratulations! " + winner + "'s have won! Thanks for playing.");
		}
}


}
