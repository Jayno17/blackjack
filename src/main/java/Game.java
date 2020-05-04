import java.util.ArrayList;

public class Game {

    ArrayList<Player> players;
    Deck deck;

    public Game(Deck deck){
        this.players = new ArrayList<Player>();
        this.deck = new Deck();
    }

    public void addPlayer(Player player) {
        this.players.add(player);
    }

    public void cardsDealt(int numOfCards) {
        for(Player player :this.players){
            for (int i = 0; i < numOfCards; i ++){
                Card card = deck.dealOne();
                player.takeCard(card);
            }

        }
    }

    public Player bestHand() {
    }
}
