package Cards;
import Cards.Card.t_Color;
import Cards.Card.t_Rang;
import Player.Team;

import java.util.Arrays;
import java.util.Random;

/**
 * Created by sulli on 11/8/16.
 */
public class CardDeck {

    /* Paquet de cartes */
    private Card cards[];

    /* Itération pour le mélange des cartes */
    private int NB_ITERATIONS = 3;


    public CardDeck() {
        this.cards = new Card[t_Color.values().length * t_Rang.values().length];
        for (int i = 0; i < t_Rang.values().length; i++) {
            for (int j = 0; j < t_Color.values().length; j++) {
                this.cards[i * t_Color.values().length + j] = new Card(t_Color.values()[j], t_Rang.values()[i]);
            }
        }
        this.MixDeck();
    }

    /*
    * Retourne le nombre de cartes restant
    */

    public int getNumCard() {
        return (this.cards.length);
    }


    /*
    * Mix the card deck
    */

    private void MixDeck() {
        Random r = new Random();
        for (int i = 0; i < NB_ITERATIONS; i++) {
            for (int j = 0; j < this.cards.length; j++) {
                this.ChangeCard(r.nextInt(this.cards.length), r.nextInt(this.cards.length));
            }
        }
    }


    /*
    * Change 2 cards
    */

    private void ChangeCard(int i, int j) {
        Card tmp;

        tmp  = this.cards[i];
        this.cards[i] = this.cards[j];
        this.cards[j] = tmp;
    }


    /*
    * @return : the pick card, or NULL if not enough card to pick
    */

    public Card PickCard() {
        if (cards == null)
            return null;
        else
        {
            Card retCard = this.cards[0];
            this.cards = Arrays.copyOfRange(this.cards, 1, this.cards.length);
            return retCard;
        }
    }

    /*
    * Distribue 8 cartes à tout le monde (1er tour)
    */

    public void Distribute(CardDeck deck, Team t1, Team t2) {
        for (int i = 1; i <= 8; i++) {
           t1.t_playerlist.get(0).TakeCard(deck.PickCard());
            t1.t_playerlist.get(1).TakeCard(deck.PickCard());
           t2.t_playerlist.get(0).TakeCard(deck.PickCard());
           t2.t_playerlist.get(1).TakeCard(deck.PickCard());
        }
    }
}
