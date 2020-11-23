public class Chemise extends Vetement {
    static String type = "chemise";
    static String couleur = "bleu";
    static float prix = 19.99f;


    public Chemise() {
        super();
    }

    public static void catalogueIndivChemise() {
        String tab[] = new String[]{type+"  ", couleur, String.valueOf(prix)+"€"};

        for (int i = 0; i < tab.length; i++) {
            System.out.print(tab[i] + "\t");
        }
        System.out.println();
        ;
    }

    public static void main(String args[]) {
        int taille = 0;
        int stock;
        switch (taille) {
            case 1:
                stock = 10;
                break;
            case 2:
                stock = 15;
                break;
            case 3:
                stock = 10;
                break;
            case 4:
                stock = 8;
                break;
        }
    }
}
