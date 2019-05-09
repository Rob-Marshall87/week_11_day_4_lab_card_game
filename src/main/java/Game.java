import java.util.ArrayList;

public class Game {

    private ArrayList<Player> players;
    private Deck deck;
    private Dealer dealer;

    public Game(){
        this.players = new ArrayList<>();
        this.deck = createNewDeck();
        this.dealer = new Dealer();
    }

    private Deck createNewDeck() {
        deck.populate();
        return deck;
    }

    private void deckShuffle(){
        deck.shuffle();
    }

    private void dealCards(){

    }

}
