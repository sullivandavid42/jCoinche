package Actions;

import Player.Player;

/**
 * Created by sulli on 11/9/16.
 */
public class PrintOutput {

    public PrintOutput() {
      // Ne fait rien mais vu que java c'est de la merde il faut l'instancier
    }


    public void print_Distribution() {
        System.out.println("Distribution de 8 cartes à chaque joueurs.");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Done !");
    }

    public void print_AskContrat(Player player) {
        System.out.println("Joueur " + player.getID() +" donnez la valeur et la couleur du contrat :" );
    }

    public void print_BadContrat() {
        System.out.println("La valeur du contrat doit être supérieure à la première.");
    }


}
