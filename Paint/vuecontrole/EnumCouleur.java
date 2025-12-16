package Paint.vuecontrole;

import java.awt.Color; // Importez la classe Color de AWT

/**
 * Type énuméré représentant les couleurs disponibles avec leur objet Color associé.
 */
public enum EnumCouleur {
    
    // Déclaration des éléments d'énumération, chacun appelant le constructeur
    ROUGE(Color.RED),
    BLEU(Color.BLUE),
    VERT(Color.GREEN),
    JAUNE(Color.YELLOW),
    NOIR(Color.BLACK),
    BLANC(Color.WHITE), // Ajout d'une sixième couleur par courtoisie
    GRIS(Color.GRAY);

    // Propriété de l'énumération demandée : une instance de java.awt.Color
    private final Color couleurAWT;

    /**
     * Constructeur pour chaque élément de l'énumération.
     * @param couleur La constante Color de AWT associée à cette couleur.
     */
    EnumCouleur(Color couleur) {
        this.couleurAWT = couleur;
    }

    // Accesseur (Getter) pour la propriété Color
    public Color getCouleur() {
        return couleurAWT;
    }

    /**
     * Surcharge de la méthode toString() pour un affichage plus lisible 
     * dans les JComboBox ou pour le débogage.
     * Par exemple, affiche "Rouge" au lieu de "ROUGE".
     */
    @Override
    public String toString() {
        // Convertit le nom de l'élément (ex: "ROUGE") en minuscule, 
        // puis met la première lettre en majuscule (ex: "Rouge").
        String name = this.name();
        return name.substring(0, 1).toUpperCase() + name.substring(1).toLowerCase();
    }
}