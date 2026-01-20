package Paint.vuecontrole;

import java.awt.Graphics;

public class Triangle extends Forme {
    private Point p1, p2;
    private EnumCouleur couleur;

    public Triangle(Point p1, Point p2, EnumCouleur couleur) {
        super(couleur);
        this.p1 = p1;
        this.p2 = p2;
        this.couleur = couleur;
    }

    @Override
    public void seDessiner(Graphics g) {
        g.setColor(couleur.getCouleur());

        // point 1
        int xA = p1.x;
        int yA = p1.y;
        // point 2
        int xB = p2.x;
        int yB = p1.y;

        // point 3
        int xC = (p1.x + p2.x) / 2; 
        int yC = p2.y;

        int[] xs = {xA, xB, xC};
        int[] ys = {yA, yB, yC};
        g.drawPolygon(xs, ys, 3);
    }
}
