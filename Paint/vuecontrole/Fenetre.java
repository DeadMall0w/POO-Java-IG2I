package Paint.vuecontrole;

import java.awt.BorderLayout;
import java.awt.event.MouseMotionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.Border;

import java.awt.event.MouseEvent;


public class Fenetre extends JFrame implements MouseMotionListener{


    BarreBasse b;
    BarreHaute bh;
    ZoneGraphique z;

    
    public Fenetre(int width, int length, String name, BarreBasse b, BarreHaute bh, ZoneGraphique z){
        // todo :
        // if (name == NULL){ }
        
        super();
        super.setSize(width, length);
        
        super.setTitle(name);
        super.setLocation(0, 0);
        super.setVisible(true);
        super.setDefaultCloseOperation(EXIT_ON_CLOSE);
    
        if (b != null){
            this.b = b;
            ajouterPanneau(this.b, BorderLayout.SOUTH);
        }

        if(bh != null){
            this.bh = bh;
            ajouterPanneau(bh, BorderLayout.NORTH);
        }

        if (z != null){
            this.z = z;
            ajouterPanneau(this.z, BorderLayout.CENTER);
            this.z.addMouseMotionListener(this);
        }
    }

    public void ajouterPanneau(JPanel p, String layout){
        super.add(p, layout);
    }

     @Override
    public void mouseDragged(MouseEvent e) {
        
    }


    @Override
    public void mouseMoved(MouseEvent e) {
        this.b.deplacementSouris(e);
    }
}
