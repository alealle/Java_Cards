import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Deck {
    private List<Card> deck;

    public Deck() {
        deck = new ArrayList<Card>();
        for (int i = 1; i <= 13; i++) {
            for (int j = 1; j <= 4; j++) {
                deck.add(new Card(i, j));
            }
        }
    }

    public static void main(String[] args) {
        Deck myDeck = new Deck();
        for (Card card : myDeck.deck) {
            System.out.println(card.cardToString(card.getRank(), card.getSuit()));
        }
    }
}
