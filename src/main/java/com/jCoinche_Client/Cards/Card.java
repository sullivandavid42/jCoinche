package com.jCoinche_Client.Cards;


/**
 * Created by sulli on 11/8/16.
 */

public  class Card {

    public enum t_Color { PIQUE, COEUR, CARREAU, TREFFLE }
    public enum t_Rang { AS, TEN, NINE, EIGHT, SEVEN, ROI, DAME, VALET }

    private int  t_value;
    private t_Rang rang;
    private t_Color color;


    public Card(t_Color color, t_Rang rang) {
        this.color = color;
        this.rang = rang;
    }

    public  t_Color getColor() {return (this.color);}
    public  t_Rang getRang() {return (this.rang);}


    /*
    * Affiche le deck du joueur
    */

    public String getCardInfo() {
        return ("Carte de couleur " + getColor() + " de rang " + this.getRang());
    }
}
