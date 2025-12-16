package Paint.vuecontrole;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// Importez votre EnumCouleur (Assurez-vous qu'elle est accessible, ex: modele.EnumCouleur)


public class BarreHaute extends JPanel implements ActionListener {

    private JLabel etiquetteCouleur;

    private JComboBox<EnumCouleur> couleurComboBox; 

    public BarreHaute() {
        EnumCouleur[] toutesLesCouleurs = EnumCouleur.values(); 
        
        this.setBackground(Color.LIGHT_GRAY);
        
        this.etiquetteCouleur = new JLabel("Couleur : ");
        this.add(this.etiquetteCouleur);

        this.couleurComboBox = new JComboBox<>(toutesLesCouleurs);
        
        this.couleurComboBox.setSelectedIndex(0);

        this.couleurComboBox.addActionListener(this); 
        
        this.add(this.couleurComboBox);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        EnumCouleur elementSelectionne = (EnumCouleur) this.couleurComboBox.getSelectedItem();
        
    }

}