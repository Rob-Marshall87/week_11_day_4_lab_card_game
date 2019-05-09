import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DeckTest {

    Deck deck;
    Card card;

    @Before
    public void before(){
        deck = new Deck();
        card = new Card(Suit.HEARTS, CardRank.THREE);
    }

    @Test
    public void checkEmpty(){
        assertEquals( 0, deck.getNumberOfCards());
    }

    @Test
    public void checkAddCard(){
        deck.addCard(card);
        assertEquals(1, deck.getNumberOfCards());
    }

    @Test
    public void checkFullDeck(){
        deck.populate();
        assertEquals(52, deck.getNumberOfCards());
    }

    @Test
    public void canDealCard(){
        deck.addCard(card);
        assertEquals(card, deck.dealCard());
        assertEquals(0, deck.getNumberOfCards());
    }

}
