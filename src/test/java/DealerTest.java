import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DealerTest {

    Dealer dealer;
    Deck deck;
    Card card;
    Player player;

    @Before
    public void before(){
        dealer = new Dealer();
        deck = new Deck();
        deck.populate();
        card = new Card(Suit.SPADES, CardRank.ACE);
        player = new Player();
    }

    @Test
    public void checkDealCard(){
        dealer.dealCard(deck, player);
        assertEquals(51, deck.getNumberOfCards());
        assertEquals(1, player.countCards());
    }

}
