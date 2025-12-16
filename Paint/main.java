package Paint;

import javax.swing.JFrame;
import Paint.vuecontrole.*;
import java.awt.BorderLayout;
import java.awt.Color;

public class main {

    public static void main(String[] args) {
        BarreBasse b = new BarreBasse();
        ZoneGraphique z = new ZoneGraphique(Color.red);
        BarreHaute bh = new BarreHaute();

        Fenetre fen = new Fenetre(500, 600, "Paint",b ,bh ,z);
        
        
        // fen.ajouterPanneau(b, BorderLayout.SOUTH);
        // b.SetEtiquettePosY(10);
    }

}
