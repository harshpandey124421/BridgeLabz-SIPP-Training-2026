public class DeckOfCards {
    public static String[] initializeDeck() {
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
        String[] deck = new String[suits.length * ranks.length];
        int index = 0;
        for (int i = 0; i < suits.length; i++) {
            for (int j = 0; j < ranks.length; j++) {
                deck[index++] = ranks[j] + " of " + suits[i];
            }
        }
        return deck;
    }
    public static String[] shuffleDeck(String[] deck) {
        int n = deck.length;
        for (int i = 0; i < n; i++) {
            int r = i + (int)(Math.random() * (n - i));
            String temp = deck[i];
            deck[i] = deck[r];
            deck[r] = temp;
        }
        return deck;
    }
    public static String[][] distributeCards(String[] deck, int nCards, int players) {
        if (nCards * players > deck.length) return null;
        String[][] distributed = new String[players][nCards];
        int deckIndex = 0;
        for (int i = 0; i < players; i++) {
            for (int j = 0; j < nCards; j++) {
                distributed[i][j] = deck[deckIndex++];
            }
        }
        return distributed;
    }
    public static void printPlayers(String[][] players) {
        for (int i = 0; i < players.length; i++) {
            System.out.println("Player " + (i + 1) + ":");
            for (int j = 0; j < players[i].length; j++) {
                System.out.println("  " + players[i][j]);
            }
        }
    }
    public static void main(String[] args) {
        String[] deck = initializeDeck();
        deck = shuffleDeck(deck);
        String[][] distributed = distributeCards(deck, 5, 4);
        if (distributed != null) printPlayers(distributed);
        else System.out.println("Not enough cards.");
    }
}