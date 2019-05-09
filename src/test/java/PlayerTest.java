import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlayerTest {

    Player player;
    Card card;

    @Before
    public void before(){
        player = new Player();
        card = new Card(Suit.HEARTS, CardRank.NINE);
    }

    @Test
    public void checkHandEmpty(){
        assertEquals(0, player.countCards());
    }

    @Test
    public void checkAddCard(){
        player.addCard(card);
        assertEquals(1, player.countCards());
    }
}
