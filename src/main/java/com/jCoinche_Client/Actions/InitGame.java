package com.jCoinche_Client.Actions;
import com.jCoinche_Client.Cards.CardDeck;
import com.jCoinche_Client.Player.Team;


/**
 * Created by sulli on 11/8/16.
 */

public class InitGame {

    public InitGame() {

        Team team_blue = new Team(Team.t_Team.BLUE, 1, 2);
        Team team_red = new Team(Team.t_Team.RED, 3, 4);

        CardDeck deck = new CardDeck();
        deck.Distribute(deck, team_blue, team_red);

      //  System.out.println("A toi joueur ");
      //  System.out.println(team_blue.t_playerlist.get(0).ReadKeyboard());
      //  team_blue.t_playerlist.get(1).getPlayerCard();
    }

}
