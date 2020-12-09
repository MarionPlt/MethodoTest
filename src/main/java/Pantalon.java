public class Pantalon extends Vetement {
    static String type= "pantalon";
    static String couleur= "noir";
    static float prix= 34.99f;
    public int stock=12;

    public Pantalon() {
        super();
    }
    public static void catalogueIndivPantalon() {
        String tab[] = new String[]{type, couleur, prix +"€"};

        for (int i = 0; i < tab.length; i++) {
            System.out.print(tab[i] + "\t");
        }
        System.out.println();
    }


}

