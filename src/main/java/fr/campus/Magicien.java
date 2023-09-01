package fr.campus;

public class Magicien implements Personnage {
    private String nom_du_personnage;
    private String sort_principale_1;
    private String sort_principale_2;
    private String sort_deffencive_1;
    private String sort_deffencive_2;
    private int niveau_de_vie_magicien;
    private int niveau_de_force_magicien;
//-------------------------------------------------------------------------------- Constructeur principal --------------------------------------------------------------------------------------------------------------------------------------------------

    public Magicien(){

        this.nom_du_personnage = "";
        this.niveau_de_vie_magicien =5;
        this.niveau_de_force_magicien = 20;
        this.sort_principale_1 = "";
        this.sort_principale_2 = "";
        this.sort_deffencive_1 = "";
        this.sort_deffencive_2 = "";


    }

    public Magicien(String nom_du_personnage,int niveau_de_vie_magicien,int niveau_de_force_magicien,String sort_principale_1, String sort_principale_2,String sort_deffencive_1,String sort_deffencive_2){

        this.nom_du_personnage = nom_du_personnage;
        this.niveau_de_vie_magicien =niveau_de_vie_magicien ;
        this.niveau_de_force_magicien = niveau_de_force_magicien;
        this.sort_principale_1 = sort_principale_1;
        this.sort_principale_2 = sort_principale_2;
        this.sort_deffencive_1 = sort_deffencive_1;
        this.sort_deffencive_2 = sort_deffencive_2;


    }
    // c'est pour appeler les variable
    public String getNom_du_personnage(){
        return nom_du_personnage;
    }
    public int getNiveau_de_vie_magicien(){
        return niveau_de_vie_magicien;
    }
    public int getNiveau_de_force_magicien(){
        return niveau_de_force_magicien;
    }
    public String getSort_principale_1(){
        return sort_principale_1;
    }
    public String getSort_principale_2(){
        return sort_principale_2;
    }
    public String getSort_deffencive_1(){
        return sort_deffencive_1;
    }
    public String getSort_deffencive_2(){
        return sort_deffencive_2;
    }
    //cela permet à modifier les variable
    public void setNom_du_personnage(String nomp){
        nom_du_personnage = nomp;
    }
    public void setNiveau_de_vie_magicien(int nbr){niveau_de_vie_magicien = nbr;}
    public void setNiveau_de_force_magicien(int nbr){niveau_de_force_magicien = nbr;}
    public void setSort_principale_1_principale_1(String armep1){
        sort_principale_1 = armep1;
    }
    public void setSort_principale_2_principale_2(String armep2){
        sort_principale_2 = armep2;
    }
    public void setSort_deffencive_1_deffencive_1(String armedef1){
        sort_deffencive_1 = armedef1;
    }
    public void setSort_deffencive_2_deffencive_2(String armedef2){
        sort_deffencive_2 = armedef2;
    }

    //toString permet de pouvoir lire les element quand je souhaite afficher sur le main toutes éléments du tableau
    public String toString() {
        return "le nom du magicien est : " + this.nom_du_personnage + "\n" + "le niveau de vie : " + this.niveau_de_vie_magicien + "\n" + "le niveau de force : " + this.niveau_de_force_magicien + "\n" + "le sort d'attaque n 1 est :" + this.sort_principale_1 + "\n"+ "le sort d'attaque n 2 est " + this.sort_principale_2 + "\n"+ "le sort defensif n 1 est : " + this.sort_deffencive_1 + "\n"+ "le sort defensif n 2 est "+ this.sort_deffencive_2 +"\n";
    }
}
