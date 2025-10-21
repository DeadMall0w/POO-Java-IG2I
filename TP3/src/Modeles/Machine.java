package TP3.src.Modeles;

import java.util.ArrayList;
import java.util.List;

public class Machine {
    private int dateAchevement;
    private double penaliteTotal;
    private List<Tache> listeTache;

    public Machine(){
        this.listeTache = new ArrayList<Tache>();
        

        dateAchevement = 0;
        penaliteTotal = 0;
    }


    public Machine(int dateAchevement, double penaliteTotal) {
        this();
        this.dateAchevement = dateAchevement;
        this.penaliteTotal = penaliteTotal;
    }


    public int getDateAchevement() {
        return dateAchevement;
    }


    public void setDateAchevement(int dateAchevement) {
        this.dateAchevement = dateAchevement;
    }


    public double getPenaliteTotal() {
        return penaliteTotal;
    }


    public void setPenaliteTotal(double penaliteTotal) {
        this.penaliteTotal = penaliteTotal;
    }


    public boolean AddTache(Tache t){
        if (t == null){
            return false;
        }

        if (t.setDateDebut(dateAchevement)){
            listeTache.add(t);
            dateAchevement = t.getDateFin();
            penaliteTotal += t.getCoutPenalite();
            return true;
        }
        return false;
    }

    @Override
public String toString() {
    if (listeTache.isEmpty()) return "Aucune tâche.";

    final int UNIT_PAR_CHAR = 10; // 1 '#' = 10 unités de temps
    StringBuilder sb = new StringBuilder();
    StringBuilder barre = new StringBuilder();
    StringBuilder repere = new StringBuilder();

    int position = 0;
    List<Integer> fins = new ArrayList<>();

    for (Tache t : listeTache) {
        int debut = t.getDateDebut();
        int fin = t.getDateFin();
        int duree = fin - debut;

        // Espace avant la tâche (si trou)
        int espaceAvant = (debut - position) / UNIT_PAR_CHAR;
        for (int i = 0; i < espaceAvant; i++) barre.append(" ");

        // ID formaté (#01)
        String id = String.format("#%02d", t.getId());

        // Longueur visuelle de la tâche
        int nbChar = Math.max(1, duree / UNIT_PAR_CHAR);
        barre.append(id);
        for (int i = 0; i < nbChar - id.length(); i++) barre.append("#");
        barre.append("|");

        fins.add(fin);
        position = fin;
    }

    // // Crée la ligne des temps de fin alignés sous les '|'
    // int index = 0;
    // position = 0;
    // for (Tache t : listeTache) {
    //     int debut = t.getDateDebut();
    //     int fin = t.getDateFin();

    //     int nbCharAvant = (debut - position) / UNIT_PAR_CHAR;
    //     for (int i = 0; i < nbCharAvant; i++) repere.append(" ");

    //     // Position approximative du '|' de fin
    //     int nbCharTache = Math.max(1, (fin - debut) / UNIT_PAR_CHAR);
    //     int totalChars = idWidth(t) + nbCharTache; // calcul pour alignement

    //     // On espace pour placer la valeur du fin juste sous le '|'
    //     for (int i = 0; i < totalChars; i++) repere.append(" ");
    //     repere.append(fin);

    //     position = fin;
    //     index++;
    // }
 
    repere.append("temps tot : " + dateAchevement +  " | penalite : " + penaliteTotal);

    sb.append(barre).append("\n").append(repere);
    return sb.toString();
}

// Petit helper pour calculer la largeur du tag ID
private int idWidth(Tache t) {
    return String.format("#%02d", t.getId()).length();
}



    
    
}
