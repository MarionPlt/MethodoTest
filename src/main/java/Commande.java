import java.util.ArrayList;
import java.util.Scanner;

public class Commande {




//fonction choix du type de vetement => test integration


    public static void main(String[] args) {
       Vetement test = new Vetement();
       ArrayList<Vetement> commande = new ArrayList();
        System.out.println("Bienvenue dans notre boutique");
        System.out.println("Veuillez consulter notre catalogue");

        test.catalogueTotal();
        System.out.println("Que voulez vous commander?");
        Scanner sc = new Scanner(System.in);
        String choix = sc.nextLine();
        switch (choix){
            case  "chemise" :
                Vetement chemise = new Chemise();
                Vetement.ajouter(commande,chemise);
            case  "pantalon" :
                Vetement pantalon = new Pantalon();
                Vetement.ajouter(commande,pantalon);
            case  "casquette" :
                Vetement casquette = new Casquette();
                Vetement.ajouter(commande,casquette);
        }
        System.out.println("Votre commande en cours : ");
        for(Vetement elem: commande)
        {
            System.out.println (elem);
        }




    }
}
