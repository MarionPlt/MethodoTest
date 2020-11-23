class Vetement {
    private String type;
    private String couleur;
    private float prix;
    private int taille;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getCouleur() {
        return couleur;
    }

    public void setCouleur(String couleur) {
        this.couleur = couleur;
    }

    public float getPrix() {
        return prix;
    }

    public void setPrix(float prix) {
        this.prix = prix;
    }

    public int getTaille() {
        return taille;
    }

    public void setTaille(int taille) {
        this.taille = taille;
    }

    public Vetement(String type) {
        this.type = type;
    }


    public Vetement(String type, String couleur, float prix, int taille) {
        this.type = type;
        this.couleur = couleur;
        this.prix = prix;
        this.taille = taille;
    }
}
