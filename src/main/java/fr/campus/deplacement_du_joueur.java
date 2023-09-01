package fr.campus;

import java.util.Random;

public class deplacement_du_joueur {
    private int emplacement_du_joueur;

    private int nbr_du_dice;

    public deplacement_du_joueur() {
        this.nbr_du_dice = 0;
        this.emplacement_du_joueur = 1;
    }

    public void nbr_aleatoire() {
        Random nbr_du_dice = new Random();
        this.nbr_du_dice = nbr_du_dice.nextInt(7);
        System.out.println(this.nbr_du_dice);
    }

    public int getNbr_du_dice() {return nbr_du_dice;}

    public void setNbr_du_dice(int nbr) {nbr_du_dice = nbr;}

    public void deplacement() {
        int nbr_de_case_que_dispose_le_plateau = 64;
        int nbr_aleatoire = nbr_du_dice;
        emplacement_du_joueur = 1;
        System.out.println(emplacement_du_joueur);
        nbr_aleatoire = nbr_du_dice;
        while (emplacement_du_joueur < nbr_de_case_que_dispose_le_plateau) {
            emplacement_du_joueur = emplacement_du_joueur + nbr_aleatoire;
            System.out.println(emplacement_du_joueur);
        }
    }

    public int getEmplacement_du_joueur() {return emplacement_du_joueur;}
    public void setEmplacement_du_joueur(int nbr) {emplacement_du_joueur = nbr;}

}
