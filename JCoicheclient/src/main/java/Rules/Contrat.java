package Rules;

import Actions.PrintOutput;
import Cards.Card;

/**
 * Created by sulli on 11/9/16.
 */
public class Contrat {
    int valeur;
    Card.t_Color color;
    PrintOutput printt = new PrintOutput();
    boolean mainContrat = false;

    public Contrat(int valeur, Card.t_Color color) {
        this.valeur = valeur;
        this.color = color;
        this.mainContrat = false;
    }

    public int getValeur() {
        return (this.valeur);
    }

    public Card.t_Color getColor() {
        return (this.color);
    }

    public void setValeur(int valeur) {
        this.valeur = valeur;
    }

    public void setColor(Card.t_Color color) {
        this.color = color;
    }

    public void setMainContrat(boolean bool) {
        this.mainContrat = bool;
    }

    public boolean getMainContrat() {
        return (this.mainContrat);
    }

    /*
    * Vérifie que le contrat passé soit bien supérieur au précédent
    * S'il est bon, il devient le contrat principal. (maincontrat)
    */
    public boolean checkContrat(int valeur, Contrat contrat) {
        if (valeur <= contrat.valeur) {
            this.printt.print_BadContrat();
            return (false);
        }
        else {
            this.mainContrat = true;
            return (true);
        }
    }

    /*
    * Enleve la valeur de main à un contrat
    */
    public void setMain(Contrat old, Contrat newest) {
        old.setMainContrat(false);
        newest.setMainContrat(true);
    }
}
