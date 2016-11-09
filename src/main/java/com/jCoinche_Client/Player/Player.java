package com.jCoinche_Client.Player;

import com.jCoinche_Client.Cards.Card;
import com.jCoinche_Client.Player.Team.t_Team;

import java.util.*;

/**
 * Created by sulli on 11/8/16.
 */

public class Player {

    /*
    * t_id -> player's ID
    * t_team -> player's team (lookat t_Team enum)
    * t_isDealer -> boolean, if dealer TRUE
    * t_playerCard -> Player's cards array
    */
    private int t_id;
    private t_Team t_team;
    private boolean t_isDealer;
    private List<Card> t_playerCard = new ArrayList<Card>();

    public Player(int id, t_Team team, boolean isDealer) {
        this.t_id = id;
        this.t_team = team;
        this.t_isDealer = isDealer;
    }

    /*
    * Retourne le nombre de cartes présentes dans le deck du player
    */
    public int getNumCard() {
        return (this.t_playerCard.size());
    }

    /*
    * @return player's ID
    */
    public int getID() {
        return (this.t_id);
    }


    /*
    * @effect : active l'état de dealer à un joueur
    */

    public void set_isDealer(boolean bo) {
        this.t_isDealer = bo;
    }


    /*
    * Permet au joueur de prendre une carte
    */

    public void TakeCard(Card card) {
        this.t_playerCard.add(card);
       //  System.out.println("C to : " + this.t_id);
    }


    /*
    * Lis l'entrée clavier de l'user et retourne un OBJECT
     */

    public Object ReadKeyboard() {
        Scanner scan = new Scanner(System.in);
        Object input = scan.nextLine();
        return (input);
    }


    /*
    * Affiche les infos cartes du player
    */

    public void getPlayerCard() {
        System.out.println("Player " + this.t_id + ": ");
        for (int i = 0; i < this.t_playerCard.size(); i++)
        {
            System.out.println(this.t_playerCard.get(i).getCardInfo());
        }
    }
}
