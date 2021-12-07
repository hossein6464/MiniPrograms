package chapter7;

public class DeckOfCards {

    public static void main(String[] args) {

        String[] suits = {"Spades", "Hearts", "Clubs", "Diamonds"};
        String[] ranks = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};

        // 52 Random Cards
        int[] deck = new int[52];

        // 1- Initialize cards
        for (int i = 0; i < deck.length; i++)
            deck[i] = i;

        // 2- Shuffle the cards
        for (int i = 0; i < deck.length; i++) {

            // Generate an index randomly
            int index = (int) (Math.random() * deck.length);

            // Swap card at current index(i) with a card at random index
            int temp = deck[i];
            deck[i] = deck[index];
            deck[index] = temp;
        }

        // 3- Display the first four cards
        for (int i = 0; i < 52; i++) {

            String suit = suits[deck[i] / 13];
            String rank = ranks[deck[i] % 13];

            System.out.println("Card number " + deck[i] + ": " + rank + " of " + suit);
        }
    }
}
