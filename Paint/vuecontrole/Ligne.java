package Paint.vuecontrole;

import java.awt.Graphics;

public class Ligne extends Forme {
    private Point p1, p2;
    private EnumCouleur couleur;

    public Ligne(Point p1, Point p2, EnumCouleur couleur) {
        super(couleur); 
        this.p1 = p1;
        this.p2 = p2;
        this.couleur = couleur;
    }

    @Override
    public void seDessiner(Graphics g) {
        g.setColor(couleur.getCouleur());
        g.drawLine(p1.getX(), p1.getY(), p2.getX(), p2.getY());
    }
}

