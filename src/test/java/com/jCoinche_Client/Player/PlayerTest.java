package com.jCoinche_Client.Player;

import com.jCoinche_Client.Cards.Card;
import org.junit.Before;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by sulli on 11/9/16.
 */
public class PlayerTest {

    protected List<Card> p_card = new ArrayList<Card>();

    @Before
    public void initCard() {
        Card test1 = new Card(Card.t_Color.CARREAU, Card.t_Rang.DAME);
        Card test2 = new Card(Card.t_Color.CARREAU, Card.t_Rang.DAME);
        Card test3 = new Card(Card.t_Color.CARREAU, Card.t_Rang.DAME);

        this.p_card.add(test1);
        this.p_card.add(test2);
        this.p_card.add(test3);
    }

    @org.junit.Test
    public void getNumCard() throws Exception {

    }

    @org.junit.Test
    public void getID() throws Exception {

    }

    @org.junit.Test
    public void set_isDealer() throws Exception {

    }

    @org.junit.Test
    public void takeCard() throws Exception {

    }

    @org.junit.Test
    public void readKeyboard() throws Exception {

    }

    @org.junit.Test
    public void getPlayerCard() throws Exception {

    }

}