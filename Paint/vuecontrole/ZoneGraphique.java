package Paint.vuecontrole;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

import javax.swing.JPanel;

public class ZoneGraphique extends JPanel {

    Point pInit;
    Point pFin;
     boolean pinceauActif = false;

    public ZoneGraphique(Color c) {
        this.setBackground(c);
    }

    public void pressed(MouseEvent e) {
        System.out.println("Appuyé en : (" + e.getX() + ", " + e.getY() + ")");
        pInit = new Point(e.getX(), e.getY());
        pinceauActif = true;
        if (Selection.getOutil() == EnumOutil.PINCEAU) {
            dessinerPinceau(e.getX(), e.getY());
        }
    }

    public void released(MouseEvent e) {
        System.out.println("Relaché en : (" + e.getX() + ", " + e.getY() + ")");
        pFin = new Point(e.getX(), e.getY());
        pinceauActif = false;
        DessinerForme(pInit, pFin, Selection.getOutil(), Selection.getCouleur());
    }

    public void deplacementSouris(MouseEvent e) {
        // System.out.println(pinceauActif);
        if (Selection.getOutil() == EnumOutil.PINCEAU && pinceauActif) {
            dessinerPinceau(e.getX(), e.getY());
        }
    }
    
    private void dessinerPinceau(int x, int y) {
        // System.out.println("Dessin avec le pinceau !");
        int rayon = 5; // taille du pinceau
        Pinceau pinceau = new Pinceau(new Point(x, y), rayon, Selection.getCouleur());
        pinceau.seDessiner(this.getGraphics());
    }

    public void DessinerForme(Point p1, Point p2, EnumOutil outil, EnumCouleur couleur) {
        switch (outil) {
            case LIGNE:
                Ligne ligne = new Ligne(p1, p2, couleur);
                ligne.seDessiner(this.getGraphics());
                break;
            case FORME_CARRE:
                Carre carre = new Carre(p1, p2, couleur);
                carre.seDessiner(this.getGraphics());
                break;
            case OVALE:
                Ovale ovale = new Ovale(p1, p2, couleur);
                ovale.seDessiner(this.getGraphics());
                break;
            case PINCEAU:
                dessinerPinceau(p2.x, p2.y);
                break;
            case GOMME:
                // Selection.setCouleur(EnumCouleur.ROUGE);
                // Selection.setOutil(EnumOutil.PINCEAU);
                break;
            case TRIANGLE:
                Triangle triangle = new Triangle(p1, p2, couleur);
                triangle.seDessiner(this.getGraphics());
                break;
            default:
                break;
        }
    }
}
