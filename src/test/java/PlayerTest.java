import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlayerTest {

    Player player;
    Card card;

    @Before
    public void setUp(){
        player = new Player("Ali");
        card = new Card(Suit.CLUBS, Rank.ACE);
    }

    @Test
    public void playerHasName(){
        assertEquals("Ali", player.getName());
    }

    @Test
    public void playersHandStartsEmpty(){
        assertEquals(0,player.cardCount() );
    }

    @Test
    public void playerCanTakeCard(){
        player.takeCard(card);
        assertEquals(1, player.cardCount());
    }

    @Test
    public void playerHasHandTotal(){
        player.takeCard(card);
        assertEquals(1,player.handValue());
    }
}
