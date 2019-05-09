import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DeckTest {

    Deck deck, deck2;
    Card card;

    @Before
    public void before(){
        deck = new Deck();
        card = new Card(Suit.HEARTS, CardRank.THREE);
        deck2 = new Deck();
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

    @Test
    public void deckShuffled(){
        deck.populate();
        deck2.populate();
//        boolean answer1 = deck.equals(deck2);
//        assertEquals(true, answer1);
        deck.shuffle();
    }

}
