


/*
 * @Purpose:Extend the above program to create a Player Object having Deck of Cards, and having ability to Sort by Rank and maintain the cards in a Queue implemented using Linked List. Do not use any Collection Library. Further the Player are also arranged in Queue. Finally Print the Player and the Cards received by each Player.
 * @Author:S.Fairoj
 * @Date:29/03/2018
 * */



package com.bridgeit.objectorientedprograms;

import java.util.LinkedList;
import java.util.Queue;

import com.bridgeit.datastructures.QueueImpl;
import com.bridgeit.utillity.Util;

public class DeckQueue
{
	public static void main(String[] args) {

		Util utility = new Util();
		String[] suits = { "Clubs", "Diamonds", "Hearts", "Spades" };
		String[] cards = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace" };

		String[] deck = utility.Deck(suits, cards);
		Queue1 queue = new Queue1();
		int indexOfDeck = 0;
		for (int i = 0; i < 4; i++) {
			LinkedList<String> linkList = new LinkedList<String>();
			for (int j = 0; j < 9; j++) {
				linkList.add(deck[indexOfDeck]);
				indexOfDeck++;
			}
			queue.enqueue(linkList);
		}

		queue.getelement();
}
}
