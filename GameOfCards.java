public class GameOfCards {
    private final int HAND_SIZE = 5;

    
    public static void main(String[] args) {
        Deck gameDeck = new Deck();
        Card[] player1_hand = new Card[HAND_SIZE];
        Card[] player2_hand = new Card[HAND_SIZE];
        int numRanks_1 = Deck.numRanks - 1; 
        int numSuits_1 = Deck.numSuits - 1; 

        for (int i =0; i < HAND_SIZE; i++){
            int suit = 1 + Math.round(Math.random()*numSuits_1)));
            int rank = 1 + Math.round(Math.random()*numRanks_1)));
            player1_hand[i] = new Card(rank, suit);
         }

        for (int i = 0; i < HAND_SIZE; i++){
            System.out.println(player1_hand[i]);
        }
    }
}
