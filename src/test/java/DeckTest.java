import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DeckTest {

    Deck deck;

    @Before
    public void setUp(){
        deck = new Deck();
    }

//    @Test
//    public void deckStartsEmpty(){
//        assertEquals(0, deck.CardCount());
//    }

    @Test
    public void deckHas52Cards(){
        assertEquals(52,deck.CardCount() );
    }

}
