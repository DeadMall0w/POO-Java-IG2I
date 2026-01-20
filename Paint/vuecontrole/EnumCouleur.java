package Paint.vuecontrole;

import java.awt.Color;


public enum EnumCouleur {
    
    BLANC(Color.WHITE),
    NOIR(Color.BLACK),
    BLEU(Color.BLUE),
    VERT(Color.GREEN),
    ROUGE(Color.RED),
    JAUNE(Color.YELLOW),
    GRIS(Color.GRAY);

    private final Color couleurAWT;


    EnumCouleur(Color couleur) {
        this.couleurAWT = couleur;
    }

    public Color getCouleur() {
        return couleurAWT;
    }


    @Override
    public String toString() {
        return this.name();    
    }
}