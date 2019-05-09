import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CardTest {

    Card card;

    @Before
    public void before(){
        card = new Card(Suit.HEARTS, CardRank.NINE);
    }

    @Test
    public void canGetSuit(){
        assertEquals(Suit.HEARTS, card.getSuit());
    }

    @Test
    public void canGetRank(){
        assertEquals(CardRank.NINE, card.getRank());
    }

    @Test
    public void queenHasValue10(){
        Card card = new Card(Suit.SPADES, CardRank.QUEEN);
        assertEquals(10, card.getValueFromEnum());
    }

}
