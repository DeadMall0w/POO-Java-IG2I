package TP2.src.modele;

public class Pilote extends Personne{
 
    private int nbPrix;
    private int nbAbandon;


    public Pilote(String nom, String prenom, String adresse){
        super(nom, prenom, adresse);

    }


    public int getNbAbandon() {
        return nbAbandon;
    }


    public int getNbPrix(){
        return nbPrix;
    }

    public void gagnerPrix(){
        nbPrix++;
    }


    public void abandoner(){
        nbAbandon++;
    }

    public void retirerPrix(){
        if (nbPrix >= 1){
            nbPrix--;
        }
    }
}
