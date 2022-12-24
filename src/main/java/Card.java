public class Card {

    private String suit;
    private String face;

    public Card(String suit, String face) {
        this.suit = suit;
        this.face = face;
    }
    public String getSuit() {
        return suit;
    }
    public String getFace() {
        return face;
    }
    @Override
    public String toString() {
        return getFace() + " of " + getSuit();
    }

}