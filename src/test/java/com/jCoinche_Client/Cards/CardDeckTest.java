package com.jCoinche_Client.Cards;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by sulli on 11/9/16.
 */
public class CardDeckTest {
    @Test
    public void getNumCard() throws Exception {
        CardDeck deck = new CardDeck();
        if (deck != null) {
            System.out.println("Deck Created : OK");
            if (deck.getNumCard() != 32){
               fail("Card Number Problem : " + deck.getNumCard()  + " : FAILED");
            }
            else
               System.out.println("32 Cards have been created : OK");
        }
        else
           fail("Deck Initialisation : FAILED");
    }

    @Test
    public void pickCard() throws Exception {
        CardDeck deck = new CardDeck();
        if (deck.getNumCard() == 0) {

        }

    }

    @Test
    public void distribute() throws Exception {

    }

}