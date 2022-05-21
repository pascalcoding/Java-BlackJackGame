import java.util.ArrayList;

public class Player {
    ArrayList<Card> playerDeck = new ArrayList<>();

    public void addCard(Card card) {
        playerDeck.add(card);
    }

    public int deckValue() {
        int sum = 0;
        for (Card card : playerDeck) {
            sum += card.getValue();
        }
        if (sum > 21) {
            for (Card card : playerDeck) {
                if (card.getValue() == 11) {
                    card.setValue(1);
                }
            }
        }
        return sum;
    }

    public void printOneCard() {
        Card card = playerDeck.get(0);
        System.out.println(card.getSuit() + ", " + card.getFace());
    }

    public void printDeck() {
        for (Card card : playerDeck) {
            System.out.println(card.getSuit() + ", " + card.getFace());
        }
    }
}
