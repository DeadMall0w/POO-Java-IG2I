package Paint.vuecontrole;

import java.awt.Graphics;

public class Pinceau extends Forme {
    private Point centre;
    private int rayon;
    private EnumCouleur couleur;

    public Pinceau(Point centre, int rayon, EnumCouleur couleur) {
        super(couleur);
        this.centre = centre;
        this.rayon = rayon;
        this.couleur = couleur;
    }

    @Override
    public void seDessiner(Graphics g) {
        g.setColor(couleur.getCouleur());
        g.fillOval(centre.x -rayon, centre.y - rayon, 2 * rayon, 2 * rayon);
    }
}
