package Actions;
import Cards.CardDeck;
import Player.Player;
import Player.Team;


/**
 * Created by sulli on 11/8/16.
 */

public class InitGame {

    public InitGame() {
        Team team_blue = new Team(Team.t_Team.BLUE, 1, 2);
        Team team_red = new Team(Team.t_Team.RED, 3, 4);

        CardDeck deck = new CardDeck();
        PrintOutput print = new PrintOutput();
        print.print_Distribution();
        deck.Distribute(deck, team_blue, team_red);

        team_blue.getTeamDecks();
      //  System.out.println("A toi joueur ");
      //  System.out.println(team_blue.t_playerlist.get(0).ReadKeyboard());
      //  team_blue.t_playerlist.get(1).getPlayerCard();
       // team_blue.t_playerlist.get(1).TakeCard(deck.PickCard());
    }

}
