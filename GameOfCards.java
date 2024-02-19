public class GameOfCards {
    public static void main(String[] args) {

        final int HAND_SIZE = 5;
        Card[] player1_hand = new Card[HAND_SIZE];
        Card[] player2_hand = new Card[HAND_SIZE];
        int numRanks_1 = Deck.numRanks - 1;
        int numSuits_1 = Deck.numSuits - 1;

        for (int i = 0; i < HAND_SIZE; i++) {
            int rank = 1 + Math.round((float) Math.random() * numRanks_1);
            int suit = 1 + Math.round((float) Math.random() * numSuits_1);
            player1_hand[i] = new Card(rank, suit);
        }

        for (int i = 0; i < HAND_SIZE; i++) {
            System.out.println(player1_hand[i]);
        }
    }
}
