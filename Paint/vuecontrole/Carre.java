package Paint.vuecontrole;

import java.awt.Graphics;

public class Carre extends Forme {
    private Point p1, p2;
    private EnumCouleur couleur;

    public Carre(Point p1, Point p2, EnumCouleur couleur) {
        super(couleur);
        this.p1 = p1;
        this.p2 = p2;
        this.couleur = couleur;
    }

    @Override
    public void seDessiner(Graphics g) {
        g.setColor(couleur.getCouleur());
        int x = Math.min(p1.x, p2.x);
        int y = Math.min(p1.y, p2.y);
        int size = Math.max(Math.abs(p2.x - p1.x), Math.abs(p2.y - p1.y));
        g.drawRect(x, y, size, size);
    }
}
