public class Pantalon extends Vetement {
    static String type= "pantalon";
    static String couleur= "noir";
    static float prix= 34.99f;

    public Pantalon() {
        super();
    }
    public static void catalogueIndivPantalon() {
        String tab[] = new String[]{type, couleur,String.valueOf(prix)+"€"};

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

