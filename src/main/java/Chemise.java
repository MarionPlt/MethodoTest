public class Chemise extends Vetement {
    static String type = "chemise";
    static String couleur = "bleu";
    static float prix = 19.99f;
    public int stock=10;

    public Chemise() {
        super();
    }

    public static void catalogueIndivChemise() {
        String tab[] = new String[]{type+"  ", couleur, prix +"€"};

        for (int i = 0; i < tab.length; i++) {
            System.out.print(tab[i] + "\t");
        }
        System.out.println();
        ;
    }






}
