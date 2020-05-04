import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CardTest {

    Card card;

    @Before
    public void setUp(){
        card = new Card(Suit.CLUBS, Rank.ACE);
    }

    @Test
    public void cardHasSuit(){
        assertEquals(Suit.CLUBS, card.getSuit() );
    }

    @Test
    public void cardHasRank(){
        assertEquals(Rank.ACE, card.getRank());
    }

    @Test
    public void cardHasValue(){
        assertEquals(1,card.getValue());
    }

    @Test
    public void cardHasName(){
        assertEquals("ACE of CLUBS", card.cardName());
    }
}
