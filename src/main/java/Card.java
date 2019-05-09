public class Card {

    private Suit suit;
    private CardRank value;

    public Card(Suit suit, CardRank value) {
        this.suit = suit;
        this.value = value;
    }


    public Suit getSuit() {
        return suit;
    }

    public CardRank getRank() {
        return value;
    }

    public int getValueFromEnum() {
        return value.getValue();
    }

}
