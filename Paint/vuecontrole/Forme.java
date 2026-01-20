package Paint.vuecontrole;

import java.awt.Color;
import java.awt.Graphics;

public abstract class Forme {
    private EnumCouleur couleur;
    private boolean fini;

    public boolean isFini() {
        return fini;
    }

    public void setFini(boolean fini) {
        this.fini = fini;
    }

    public Forme(EnumCouleur couleur) {
        this.couleur = couleur;
    }

    public void seDessiner(Graphics g) {
        g.setColor(couleur.getCouleur());
    }
}
