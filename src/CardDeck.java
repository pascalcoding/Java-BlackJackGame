import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class CardDeck {
    private final Card[] arrayOfCards = new Card[52];
    private int pos = 0;

    public CardDeck() {
        String[] suits = {"Clubs", "Diamonds", "Hearts", "Spades"};
        HashMap<String, Integer> cardsValues = createCardsValues();
        int i = 0;
        for (String suit : suits) {
            for (Map.Entry<String, Integer> entry : cardsValues.entrySet()) {
                arrayOfCards[i] = new Card(suit, entry.getKey(), entry.getValue());
                i++;
            }
        }
        mixCards(arrayOfCards);


    }

    public static HashMap<String, Integer> createCardsValues() {
        HashMap<String, Integer> cardsValues = new HashMap<String, Integer>();
        cardsValues.put("2", 2);
        cardsValues.put("3", 3);
        cardsValues.put("4", 4);
        cardsValues.put("5", 5);
        cardsValues.put("6", 6);
        cardsValues.put("7", 7);
        cardsValues.put("8", 8);
        cardsValues.put("9", 9);
        cardsValues.put("10", 10);
        cardsValues.put("K", 10);
        cardsValues.put("Q", 10);
        cardsValues.put("J", 10);
        cardsValues.put("A", 11);
        return cardsValues;
    }

    public static void mixCards(Card[] arr) {
        int max = 52;
        int a,b;
        Card temp;

        for (int i = 0; i < arr.length; i++) {
            a = (int)(Math.random()*(max-1));
            b = (int)(Math.random()*(max-1));
            temp = arr[a];
            arr[a] = arr[b];
            arr[b] = temp;

        }
    }

    public void printCards() {
        for (Card card: arrayOfCards) {
            System.out.println("Suit: " + card.getSuit() + ", Face: " + card.getFace() + ", Value: " + card.getValue());
        }
    }

    public Card drawCard() {
        Card returnCard = arrayOfCards[pos];
        if (pos < 52) { pos++; }
        return returnCard;
    }


}
