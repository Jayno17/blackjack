import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GameTest {
    Game game;
    Player player;
    Player dealer;
    Deck deck;
    Card card1;
    Card card2;
    Card card3;
    Card card4;


    @Before
    public void setUp(){
        game = new Game(deck);
        player = new Player("Ali");
        dealer = new Player("Julia");
        deck = new Deck();
        game.addPlayer(player);
        game.addPlayer(dealer);
        card1 = new Card(Suit.DIAMONDS, Rank.QUEEN);
        card2 = new Card(Suit.CLUBS, Rank.FIVE);
        card3 = new Card(Suit.DIAMONDS, Rank.TEN);
        card4 = new Card(Suit.DIAMONDS, Rank.EIGHT);

    }

    @Test
    public void cardsDealt(){
        game.cardsDealt(1);
        assertEquals(1, player.cardCount());
        assertEquals(1, dealer.cardCount());
    }
    @Test
    public void canDealMultipleCards(){
        game.cardsDealt(2);
        assertEquals(2, player.cardCount());
        assertEquals(2, dealer.cardCount());

    }

    @Test
    public void canCheckCards(){
        player.takeCard(card1);
        player.takeCard(card2);
        dealer.takeCard(card3);
        dealer.takeCard(card4);
        assertEquals(dealer, game.bestHand());
    }




}
