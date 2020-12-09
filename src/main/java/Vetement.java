import java.util.ArrayList;

public  class Vetement {
    public String type;
    public int stock;


    public Vetement() {

    }

    public static void message() {
        System.out.println("Stock épuisé en cours de réapprovisionnement");
    }

    public void catalogueIndiv() {

    }

    public static void catalogueTotal() {

       Chemise.catalogueIndivChemise();
       Pantalon.catalogueIndivPantalon();
       Casquette.catalogueIndivCasquette();
    }

    public static void ajouter(ArrayList listedAchat, Vetement vetement) {
        listedAchat.add(vetement);
        vetement.stock--;

    }

}



