package fr.campus;

import java.util.ArrayList;
import java.util.Scanner;
//partie getheros

public class Menu_du_jeux {
    private Guerrier mon_personnage;
    private Magicien mon_personnage1;
    private String class_du_personnage;
    private String reponse;
    private Scanner clavier;
    private deplacement_du_joueur deplacementDuJoueur;
    private deplacement_du_joueur nbr_aleatoire;


    public Menu_du_jeux() {
        this.class_du_personnage = null;
        this.mon_personnage = new Guerrier();
        this.mon_personnage1 = new Magicien();
        this.reponse = "";
        this.clavier = new Scanner(System.in);
        this.deplacementDuJoueur = new deplacement_du_joueur();
        this.nbr_aleatoire = new deplacement_du_joueur();
    }


    public void start() {

        try {
            int initialisation_du_personnage;
            System.out.print("Vous souhaitez créer un nouveau personnage (1) ou quitter le jeu (2) : ");
            initialisation_du_personnage = clavier.nextInt();
            clavier.nextLine();
            System.out.println(" ");
            if (initialisation_du_personnage == 2) {
                System.exit(0);
            }
            System.out.print("quel type de personnage vous voulez créer : Guerrier (g), Magicien (m)");
            this.class_du_personnage = clavier.nextLine();
//---------------------------information ci je choisie le guerrier --------------------------------
            ArrayList<Personnage> personnages = Database.getHeroes();
            if (this.class_du_personnage.equals("g")) {
                System.out.println(personnages.get(0));
//            this.class_du_personnage = "guerrier";
//            System.out.print("Quel nom voulez-vous donner à votre personnage ?");
//            this.mon_personnage.setNom_du_personnage(clavier.nextLine());
//            System.out.print("Quelles armes principales souhaitez-vous : Hache (h) ou épée (e) ou quitté le jeux (q)?");
//            reponse = clavier.nextLine();
//            if (reponse.equals("h")) {
//                this.mon_personnage.setArme_principale_1("Hache");
//            } else {
//                if (reponse.equals("e")) {
//                    this.mon_personnage.setArme_principale_1("Epée");
//                } else {
//                    if (reponse.equals("q")) {
//                        System.exit(0);
//                    }
//                }
//            }
//
//            System.out.print("Quelles armes defensives souhaitez-vous : Bouclier du templier (bt) ou bouclier du barbarre (bb) ou quitté le jeux (q)?");
//            reponse = clavier.nextLine();
//
//            if (reponse.equals("bt")) {
//                this.mon_personnage.setArme_deffencive_1("Bouclier du Templier");
//
//            } else {
//                if (reponse.equals("bb")) {
//                    this.mon_personnage.setArme_deffencive_1("Bouclier du barbare");
//                } else {
//                    if (reponse.equals("q")) {
//                        System.exit(0);
//                    }
//                }
//            }
//            System.out.println("Le nom du personnage est :  " + this.mon_personnage.getNom_du_personnage());
//            System.out.println(" Le niveau de vie est : " + this.mon_personnage.getNiveau_de_vie_guerrier());
//            System.out.println(" le niveau de force est : " + this.mon_personnage.getNiveau_de_force_guerrier());
//            System.out.println(" Mon arme pricipale est : " + this.mon_personnage.getArme_principale_1());
//            System.out.println(" Mon arme pricipale est : " + this.mon_personnage.getArme_deffencive_1());
            } else {
                if (this.class_du_personnage.equals("m")) {

                    System.out.println(personnages.get(1));

//                this.class_du_personnage = "magicien";
//                System.out.print("Quel nom voulez-vous donner à votre personnage ?");
//                this.mon_personnage1.setNom_du_personnage(clavier.nextLine());
//                System.out.print("Quelles armes principales souhaitez-vous : Incantation des enfer (i) ou Soif du mal (s) ou quitté le jeux (q)?");
//                reponse = clavier.nextLine();
//                if (reponse.equals("i")) {
//                    this.mon_personnage1.setSort_principale_1_principale_1("Incantation des enfer");
//                } else {
//                    if (reponse.equals("s")) {
//                        this.mon_personnage1.setSort_principale_1_principale_1("Soif du mal");
//                    } else {
//                        if (reponse.equals("q")) {
//                            System.exit(0);
//                        }
//                    }
//                }
//
//                System.out.print("Quelles armes defensives souhaitez-vous : Défense cornus (d) ou bouclier de lumière (b) ou quitté le jeux (q)?");
//                reponse = clavier.nextLine();
//
//                if (reponse.equals("d")) {
//                    this.mon_personnage1.setSort_deffencive_1_deffencive_1("Défense cornus");
//
//                } else {
//                    if (reponse.equals("b")) {
//                        this.mon_personnage1.setSort_deffencive_1_deffencive_1("bouclier de lumière");
//                    } else {
//                        if (reponse.equals("q")) {
//                            System.exit(0);
//                        }
//                    }
//                }
//                System.out.println("Le nom du personnage est :  " + this.mon_personnage1.getNom_du_personnage());
//                System.out.println(" Le niveau de vie est : " + this.mon_personnage1.getNiveau_de_vie_magicien());
//                System.out.println(" le niveau de force est : " + this.mon_personnage1.getNiveau_de_force_magicien());
//                System.out.println(" Mon sort d'attaque est : " + this.mon_personnage1.getSort_principale_1());
//                System.out.println(" Mon sort de défense est : " + this.mon_personnage1.getSort_deffencive_1());
                }
            }
        }catch (Exception e) {
            System.out.println("Le charactère rentré n'est pas adapté veuillez rentrer l'entier demandé");
            e.printStackTrace();

        }
    }

    public void modifier_personnage() {
        try {
            System.out.println("Voulez-vous modifier votre personnage ? si oui tapé (o) si non tapé (n)");
            reponse = clavier.nextLine();

            if (reponse.equals("o") && (this.class_du_personnage.equals("guerrier"))) {

                System.out.print("Quel nom voulez-vous donner à votre personnage ?");
                this.mon_personnage.setNom_du_personnage(clavier.nextLine());
                System.out.print("Quelles armes principales souhaitez-vous : Hache (h) ou épée (e) ou quitté le jeux (q)?");
                reponse = clavier.nextLine();
                if (reponse.equals("h")) {
                    this.mon_personnage.setArme_principale_1("Hache");
                } else {
                    if (reponse.equals("e")) {
                        this.mon_personnage.setArme_principale_1("Epée");
                    } else {
                        if (reponse.equals("q")) {
                            System.exit(0);
                        }
                    }
                }
                System.out.print("Quelles armes defensives souhaitez-vous : Bouclier du templier (bt) ou bouclier du barbarre (bb) ou quitté le jeux (q)?");
                reponse = clavier.nextLine();
                if (reponse.equals("bt")) {
                    this.mon_personnage.setArme_deffencive_1("Bouclier du Templier");
                } else {
                    if (reponse.equals("bb")) {
                        this.mon_personnage.setArme_deffencive_1("Bouclier du barbare");
                    } else {
                        if (reponse.equals("q")) {
                            System.exit(0);
                        }
                    }
                }
                System.out.print("Quelles qu'elle niveau de vie voulez-vous appliquer à votre personnage ?");
                this.mon_personnage.setNiveau_de_vie_guerrier(clavier.nextInt());

                System.out.print("Quelles niveau de Force voulez-vous appliquer à votre personnage ?");
                this.mon_personnage.setNiveau_de_force_guerrier(clavier.nextInt());

                System.out.println(" ");
                System.out.println("Voici les changement qui ont étaient appliqué : ");
                System.out.println(" ");
                System.out.println("Le nom du personnage est :  " + this.mon_personnage.getNom_du_personnage());
                System.out.println(" Le niveau de vie est : " + this.mon_personnage.getNiveau_de_vie_guerrier());
                System.out.println(" le niveau de force est : " + this.mon_personnage.getNiveau_de_force_guerrier());
                System.out.println(" Mon arme pricipale est : " + this.mon_personnage.getArme_principale_1());
                System.out.println(" Mon arme pricipale est : " + this.mon_personnage.getArme_deffencive_1());
            } else {
                if ((reponse.equals("o")) && (this.class_du_personnage.equals("magicien"))) {
                    System.out.print("Quel nom voulez-vous donner à votre personnage ?");
                    this.mon_personnage1.setNom_du_personnage(clavier.nextLine());
                    System.out.print("Quelles sort d'attaque souhaitez-vous : Incantation des enfer (i) ou  Soif du mal (s) ou quitté le jeux (q)?");
                    reponse = clavier.nextLine();
                    if (reponse.equals("i")) {
                        this.mon_personnage1.setSort_principale_1_principale_1("Incantation des enfer");
                    } else {
                        if (reponse.equals("s")) {
                            this.mon_personnage1.setSort_principale_1_principale_1("Soif du mal");
                        } else {
                            if (reponse.equals("q")) {
                                System.exit(0);
                            }
                        }
                    }
                    System.out.print("Quelles sort defensives souhaitez-vous : Défense cornus (d) ou bouclier de lumière (b) ou quitté le jeux (q)?");
                    reponse = clavier.nextLine();
                    if (reponse.equals("d")) {
                        this.mon_personnage1.setSort_deffencive_1_deffencive_1("Défense cornus");
                    } else {
                        if (reponse.equals("b")) {
                            this.mon_personnage1.setSort_deffencive_1_deffencive_1("bouclier de lumière");
                        } else {
                            if (reponse.equals("q")) {
                            System.exit(0);
                            }
                        }
                    }
                    System.out.print("Quelles qu'elle niveau de vie voulez-vous appliquer à votre personnage ?");
                    this.mon_personnage1.setNiveau_de_vie_magicien(clavier.nextInt());

                    System.out.print("Quelles niveau de Force voulez-vous appliquer à votre personnage ?");
                    this.mon_personnage1.setNiveau_de_force_magicien(clavier.nextInt());

                    System.out.println(" ");
                    System.out.println("Voici les changement qui ont étaient appliqué : ");
                    System.out.println(" ");
                    System.out.println("Le nom du personnage est :  " + this.mon_personnage1.getNom_du_personnage());
                    System.out.println(" Le niveau de vie est : " + this.mon_personnage1.getNiveau_de_vie_magicien());
                    System.out.println(" le niveau de force est : " + this.mon_personnage1.getNiveau_de_force_magicien());
                    System.out.println(" Mon arme pricipale est : " + this.mon_personnage1.getSort_principale_1());
                    System.out.println(" Mon arme pricipale est : " + this.mon_personnage1.getSort_deffencive_1());

                }
            }
        }catch (Exception e) {
            System.out.println("Le charactère rentré n'est pas adapté veuillez rentrer la lettre demandée en minuscule");
            e.printStackTrace();
        }
    }
}

////    public void plateau_jeux_deplacement_du_joueur(){
////        int nbr_de = 0;
//////        System.out.println("Voulez vous commencer l'aventure (cl) ou voulez-vous quitter la partie (q)?");
//////        reponse = clavier.nextLine();
////           deplacementDuJoueur.deplacement();
////        System.out.println(deplacementDuJoueur);
////
//////        System.out.println("");
//////        System.out.println("Le "+this.class_du_personnage+" est sur la case "+ deplacementDuJoueur.nbr_aleatoire();+" Du plateau du jeux");
//////        System.out.println("");
//////        System.out.print("Voulez vous jeter le dés ? tapé (l) ou quitter tapé (q)");
//////        reponse = clavier.nextLine();
////
////
////
////    }
//}

