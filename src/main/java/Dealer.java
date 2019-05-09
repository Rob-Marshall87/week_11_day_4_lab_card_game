public class Dealer {

    public Dealer(){
    }

    public void dealCard(Deck deck, Player player){
        player.addCard(deck.dealCard());
    }
}
