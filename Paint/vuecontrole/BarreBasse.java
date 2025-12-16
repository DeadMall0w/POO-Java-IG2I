package Paint.vuecontrole;

import javax.swing.JPanel;


import java.awt.event.*;

import javax.swing.JLabel;
import java.awt.Color;
import java.awt.event.MouseEvent;



public class BarreBasse extends JPanel {

    private JLabel etiquetteTexte;
    private JLabel etiquettePosX;
    private JLabel etiquettePosY;

    public BarreBasse() {
        this.etiquetteTexte = new JLabel("Welcome on board !   ");
        this.etiquettePosX = new JLabel("x : ");
        this.etiquettePosY = new JLabel("y : ");


        this.setBackground(Color.LIGHT_GRAY);


        this.add(this.etiquetteTexte);
        this.add(this.etiquettePosX);
        this.add(this.etiquettePosY);
        
    }



   
    public String GetEtiquetteTexte() {
        return etiquetteTexte.getText();
    }

    public void SetEtiquetteTexte(String texte) {
        this.etiquetteTexte.setText(texte);
    }

       
    public String GetEtiquettePosX() {
        return etiquettePosX.getText();
    }

    public void SetEtiquettePosX(int position) {
        this.etiquettePosX.setText("x :  " + position);
    }

       
    public String GetEtiquettePosY() {
        return etiquettePosY.getText();
    }

    public void SetEtiquettePosY(int position) {
        this.etiquettePosY.setText("y :  " + position);
    }

    public void deplacementSouris (MouseEvent evt){
        SetEtiquettePosX(evt.getX());
        SetEtiquettePosY(evt.getY());

    }

}
