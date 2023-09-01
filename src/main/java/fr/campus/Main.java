package fr.campus;//import com.mysql.cj.jdbc.Driver; // ça me permet de pour voir me connecter sur ma base de données pour y avoir acces sur mon mains
//
//import javax.xml.transform.Result;
//import java.sql.*; // outil de gestion du driver ça permet d'utiliser le driver


public class Main {
    public static void main(String[] args) {

        Menu_du_jeux depart_du_programme = new Menu_du_jeux();
        depart_du_programme.start();
        depart_du_programme.modifier_personnage();
//        depart_du_programme.plateau_jeux_deplacement_du_joueur();

    }

}