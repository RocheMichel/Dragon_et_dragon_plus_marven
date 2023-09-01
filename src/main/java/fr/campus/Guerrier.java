//----------------------------------------------------------------------------------- Class Guerrier -----------------------------------------------------------------------------------------------
package fr.campus;
public class Guerrier implements Personnage {

    //---------------------------------------------------------------------------------- Attributs ------------------------------------------------------------------------------------------------------
    private String nom_du_personnage;
    private String arme_principale_1;
    private String arme_principale_2;
    private String arme_deffencive_1;
    private String arme_deffencive_2;
    private int niveau_de_vie_guerrier;
    private int niveau_de_force_guerrier;
    //-------------------------------------------------------------------------------- Constructeur principal --------------------------------------------------------------------------------------------------------------------------------------------------
    public Guerrier(){
        this.nom_du_personnage = "";
        this.niveau_de_vie_guerrier = 10;
        this.niveau_de_force_guerrier = 20;
        this.arme_principale_1 = "";
        this.arme_principale_2 = "";
        this.arme_deffencive_1 = "";
        this.arme_deffencive_2 = "";
    }

    public Guerrier(String nom_du_personnage,int niveau_de_vie_guerrier,int niveau_de_force_guerrier,String arme_principale_1, String arme_principale_2,String arme_deffencive_1,String arme_deffencive_2) {
        this.nom_du_personnage = nom_du_personnage;
        this.niveau_de_vie_guerrier = niveau_de_vie_guerrier;
        this.niveau_de_force_guerrier = niveau_de_force_guerrier;
        this.arme_principale_1 = arme_principale_1;
        this.arme_principale_2 = arme_principale_2;
        this.arme_deffencive_1 = arme_deffencive_1;
        this.arme_deffencive_2 = arme_deffencive_2;
    }
    public Guerrier(String nom_du_personnage) {
        this();
        this.nom_du_personnage = nom_du_personnage;

    }
    public Guerrier(int niveau_de_vie_guerrier ) {
        this();
        this.niveau_de_vie_guerrier = niveau_de_vie_guerrier;

    }

    //ça permet d'accéder aux variable qui sont dans la classe
    public String getNom_du_personnage(){
        return nom_du_personnage;
    }
    public int getNiveau_de_vie_guerrier(){
        return niveau_de_vie_guerrier;
    }
    public int getNiveau_de_force_guerrier(){
        return niveau_de_force_guerrier;
    }
    public String getArme_principale_1(){
        return arme_principale_1;
    }
    public String getArme_principale_2(){
        return arme_principale_2;
    }
    public String getArme_deffencive_1(){
        return arme_deffencive_1;
    }
    public String getArme_deffencive_2(){
        return arme_deffencive_2;
    }

    //Modifier le valeurs de l'objet à l'extérieur de la classe

    public void setNom_du_personnage(String nomp){
        nom_du_personnage = nomp;
    }
    public void setNiveau_de_vie_guerrier(int nbr){
        niveau_de_vie_guerrier = nbr;
    }
    public void setNiveau_de_force_guerrier(int nbr){
        niveau_de_force_guerrier = nbr;
    }
    public void setArme_principale_1(String armep1){
        arme_principale_1 = armep1;
    }
    public void setArme_principale_2(String armep2){
        arme_principale_2 = armep2;
    }
    public void setArme_deffencive_1(String armedef1){
        arme_deffencive_1 = armedef1;
    }
    public void setArme_deffencive_2(String armedef2){
        arme_deffencive_2 = armedef2;
    }

    //toString permet de pouvoir lire les element quand je souhaite afficher sur le main toutes éléments du tableau
    public String toString() {
        return "le nom du guerrier est : " + this.nom_du_personnage + "\n" + "le niveau de vie : " + this.niveau_de_vie_guerrier + "\n" + "le niveau de force : " + this.niveau_de_force_guerrier + "\n" + "l'arme d'attaque n 1 est :" + this.arme_principale_1 + "\n"+ "l'arme d'attaque n 2 est " + this.arme_principale_2 + "\n"+ "l'arme defensif n 1 est : " + this.arme_deffencive_1 + "\n"+ "l'arme defensif n 2 est "+ this.arme_deffencive_2 + "\n";
    }
}