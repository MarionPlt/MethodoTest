public  class Vetement {
    public String type;
    public String couleur;
    public float prix;
    public int taille;
    static int stock ;


    public Vetement() {

    }

    public static void message() {
        System.out.println("Stock épuisé en cours de réapprovisionnement");
    }

    public void catalogueIndiv() {

    }
    public void catalogueTotal(){
        Chemise.catalogueIndivChemise();
        Pantalon.catalogueIndivPantalon();
        Casquette.catalogueIndivCasquette();
    }

    public static void main (String[] args){
        stock = Chemise.stock + Pantalon.stock + Casquette.stock;
    }
}


