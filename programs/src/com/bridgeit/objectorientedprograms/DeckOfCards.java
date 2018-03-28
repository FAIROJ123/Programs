package com.bridgeit.objectorientedprograms;

import com.bridgeit.utillity.Util;

public class DeckOfCards 
{
	 public static void main(String[] args) {
		
				Util utility = new Util();
				String[] suits = { "Clubs", "Diamonds", "Hearts", "Spades" };
				String[] cards = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace" };

				String[] deck = utility.Deck(suits, cards);
				System.out.println("Deck OF Cards : ");
				System.out.println("_______________\n");
				for (int i = 0; i < deck.length; i++) {
					System.out.print(deck[i] + " ");
				}
				System.out.print(
						"\n----------------------------------------------------------------------------------------------------------------------");
				utility.distribute(deck);
		}

}
