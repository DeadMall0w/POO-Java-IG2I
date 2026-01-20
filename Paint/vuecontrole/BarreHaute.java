package Paint.vuecontrole;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JButton;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// Importez votre EnumCouleur (Assurez-vous qu'elle est accessible, ex: modele.EnumCouleur)


public class BarreHaute extends JPanel implements ActionListener {

    private JLabel etiquetteCouleur;

    private JComboBox<EnumCouleur> couleurComboBox; 
    private JComboBox<EnumOutil> outilComboBox;

    public BarreHaute() {
        EnumCouleur[] toutesLesCouleurs = EnumCouleur.values(); 
        EnumOutil[] tousLesOutils = EnumOutil.values();
        
        this.setBackground(Color.LIGHT_GRAY);
        
        this.etiquetteCouleur = new JLabel("Couleur : ");
        this.add(this.etiquetteCouleur);

        this.couleurComboBox = new JComboBox<>(toutesLesCouleurs);
        this.couleurComboBox.setSelectedIndex(0);
        this.couleurComboBox.addActionListener(this); 

        this.add(this.couleurComboBox);

        JLabel etiquetteOutil = new JLabel("Outil : ");
        this.add(etiquetteOutil);
        this.outilComboBox = new JComboBox<>(tousLesOutils);
        this.outilComboBox.setSelectedIndex(0);
        this.outilComboBox.addActionListener(this);
        this.add(this.outilComboBox);

        Selection.setOutil(EnumOutil.PINCEAU);
        Selection.setCouleur(EnumCouleur.BLANC);

        JButton clear = new JButton("Tout supprimer");
        this.add(clear);

        JButton retour = new JButton("Retour");
        this.add(retour);

       
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == this.couleurComboBox) {
            EnumCouleur couleurSelectionne = (EnumCouleur) this.couleurComboBox.getSelectedItem();
            System.out.println("Couleur sélectionné : " + couleurSelectionne);
            Selection.setCouleur(couleurSelectionne);


        } else if (e.getSource() == this.outilComboBox) {
            EnumOutil outilSelectionne = (EnumOutil) this.outilComboBox.getSelectedItem();
            System.out.println("Outil sélectionné : " + outilSelectionne);
            if (outilSelectionne == EnumOutil.GOMME){
                Selection.setCouleur(EnumCouleur.ROUGE); // todo : recup la couleur de fond automatiquement
                Selection.setOutil(EnumOutil.PINCEAU);
            }else{
                Selection.setOutil(outilSelectionne);
            }
        }
    }

}