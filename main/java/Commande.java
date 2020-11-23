import java.util.ArrayList;

public class Commande {


    public static ArrayList ajouter(Vetement vetement) {
        ArrayList commande = new ArrayList<Vetement>();
        if (vetement.stock !=0) {
            commande.add(vetement);
            vetement.stock--;
        } else {
            vetement.message();
        }
        return commande;
    }

//fonction choix du type de vetement => test integration



    public static void main(String[] args) {
        Vetement test = new Vetement();
        System.out.println("Bienvenue dans notre boutique");
        System.out.println("Veuillez consulter notre catalogue");
        test.catalogueTotal();

    }
}
