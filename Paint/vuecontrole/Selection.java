package Paint.vuecontrole;

public class Selection {
    private static EnumCouleur couleur;
    private static EnumOutil outil;

    public static EnumCouleur getCouleur() {
        return couleur;
    }

    public static void setCouleur(EnumCouleur couleur) {
        Selection.couleur = couleur;
    }

    public static EnumOutil getOutil() {
        return outil;
    }

    public static void setOutil(EnumOutil outil) {
        Selection.outil = outil;
    }
}
