package com.bridgelab.Assignment_11_12;

/**
 * @author atik
 *Program to build Deck of Cards,shuffle the deck and distributing 9 cards to 4 players
 */
public class DeckOfCards {
	static String[] deck = new String[52];

	// Creating common cards array for deck
	public static void buildDeck() {
		String[] suit = { " Spread : ", " Dimond : ", " club : ", "Heart : " };
		String[] rank = { " 2", " 3", " 4", " 5", " 6", " 7", " 8", " 9", " 10", " Jack", " Queen", " King", " Ace" };

		// Creating deck of 52 cards
		System.out.println("Deck of cards : ");
		for (int i = 0; i < deck.length; i++) {
			deck[i] = suit[i / 13] + rank[i % 13];
			System.out.println(" " + deck[i] + " , ");
		}
	}

	// Using random function and swapping method shuffling card of deck
	public static void shuffleDeck() {
		for (int j = 0; j < deck.length; j++) {

			int index = (int) (Math.random() * 51);

			String temp = deck[j];
			deck[j] = deck[index];
			deck[index] = temp;
		}

		System.out.println();
		System.out.println("Shuffled deck :");
		for (String m : deck) {
			System.out.println(" " + m + ", ");
		}
	}

	// Distributing 9 card to 4 players
	public static void cardDistribution() {
		int a = 0;
		for (int i = 1; i <= 4; i++) {
			System.out.println();
			System.out.print("Player " + i + " Cards : [ ");
			for (int j = 0; j < 9; j++) {
				System.out.print(deck[a] + ", ");
				a++;
			}
			System.out.println(" ]");
		}
	}

	public static void main(String[] args) {
		buildDeck();
		shuffleDeck();
		cardDistribution();
	}
}
