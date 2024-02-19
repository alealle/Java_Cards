import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Deck {
    private Card[][] cards;
    public static int numSuits = 4;
    public static int numRanks = 13;
    public static int numCards = numRanks * numSuits;

    public Deck() {
        cards = new Card[numSuits][numRanks];
        for (int s = Card.DIAMONDS; s <= Card.SPADES; s++) {
            for (int r = Card.ACE; r <= Card.KING; r++) {
                cards[s - 1][r - 1] = new Card(r, s);
            }
        }
    }

    public Card getCard(int suit, int rank) {
        return cards[suit][rank];
    }

    public static void main(String[] args) {
        Deck myDeck = new Deck();
        for (int s = Card.DIAMONDS; s <= Card.SPADES; s++) {
            for (int r = Card.ACE; r <= Card.KING; r++) {
                System.out.println(myDeck.cards[s - 1][r - 1].toString());
            }
        }
    }
}
