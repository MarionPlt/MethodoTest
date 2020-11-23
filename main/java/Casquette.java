public class Casquette extends Vetement {
    static String type= "casquette" ;
    static String couleur = "vert";
    static float prix = 14.99f;

    public Casquette() {
        super();
    }
    public static void catalogueIndivCasquette() {
        String tab[] = new String[]{type, couleur, String.valueOf(prix)+"€"};

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
                stock = 20;
                break;
            case 2:
                stock = 20;
                break;
        }
    }
}
