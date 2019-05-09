import java.util.ArrayList;

public class Player {

    private ArrayList<Card> hand;

    public Player(){
        this.hand = new ArrayList<>();
    }


    public int countCards() {
        return hand.size();
    }

    public void addCard(Card card) {
        hand.add(card);
    }


}
