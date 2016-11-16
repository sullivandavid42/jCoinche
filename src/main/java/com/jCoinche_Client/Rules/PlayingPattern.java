package com.jCoinche_Client.Rules;

/**
 * Created by sulli on 11/9/16.
 */


/*
* - Les joueurs doivent évaluer leurs mains et estimer le nombre de points qu'ils pensent pouvoir réaliser : cela définit le contrat
*
* But du jeu :
*
*   l’équipe preneuse doit réaliser le contrat annoncé pour gagner une manche, tout en réalisant
*   au minimum 82 points de plis hors annonces et/ou belote-rebelote,
*   la première équipe à atteindre au minimum 701 points gagne le jeu. Si les deux équipes dépassent 701 points,
*   celle qui a le plus haut score gagne le jeu.
*
* 1) Distribution des cartes (8 chacun) - FAIT
*
* 2) Enchères : Le joueur à la gauche du donneur commence. Il peut annoncer la valeur et la couleur du contrat
*    qu'il pense pouvoir réaliser avec son partenaire en fonction de son jeu. Il peut aussi décider de passer.
*
*    Une fois que le joueur a annoncé un contrat ou a passé, le joueur situé à sa gauche a le choix entre annoncer
*    un contrat supérieur ou passer.
*
*    La phase d'enchère prend fin si personne n'a annoncé de contrat lors du premier tour de parole, ou aussitôt que
*    3 joueurs passent après l'annonce de l'un des joueurs (un joueur n'est pas autorisé à surenchérir sur son propre contrat).
*    Auquel cas le dernier contrat annoncé l'emporte et la phase de jeu peut commencer.
*
*/

public class PlayingPattern {

   public  PlayingPattern() {

   }

}
