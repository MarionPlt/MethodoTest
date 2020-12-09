public class Casquette extends Vetement {
    static String type = "casquette";
    static String couleur = "vert";
    static float prix = 14.99f;
    public int stock = 10;

    public Casquette() {
        super();
    }

    public static void catalogueIndivCasquette() {
        String tab[] = new String[]{type, couleur, prix + "€"};

        for (int i = 0; i < tab.length; i++) {
            System.out.print(tab[i] + "\t");
        }
        System.out.println();

    }


}
