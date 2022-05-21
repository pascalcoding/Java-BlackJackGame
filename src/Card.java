public class Card {
    private final String suit;
    private final String face;
    private int value;

    public Card(String suit, String face, int value) {
        this.suit = suit;
        this.face = face;
        this.value = value;
    }

    public void setValue(int value) { this.value = value; }

    public int getValue() {
        return value;
    }

    public String getSuit() {
        return suit;
    }

    public String getFace() {
        return face;
    }
}
