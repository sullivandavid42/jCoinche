package com.jCoinche_Client.Player;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by sulli on 11/8/16.
 */

public class Team {

    public enum t_Team { RED, BLUE }

    private t_Team t_team;
    public List<Player> t_playerlist = new ArrayList<Player>();

    public Team(t_Team team, int idp1, int idp2) {
        this.t_team = team;

        Player p1 = new Player(idp1, team, false);
        t_playerlist.add(p1);
        Player p2 = new Player(idp2, team, false);
        t_playerlist.add(p2);


    }
}
