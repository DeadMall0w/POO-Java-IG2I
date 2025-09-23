package TP1.src.modele;


public class Voiture {
    private int immatriculation;
    private String marque;
    private Moteur moteur;
    private boolean estDisponible;

    private static int voitureCount = 0;

    public Voiture(){ // Constructeur par défaut
        this.immatriculation = voitureCount++;
        this.marque = "marque par défaut";
        this.moteur = new Moteur();
        this.estDisponible = true;
    }

    public Voiture(String marque, Moteur moteur) {
        this();

        if (marque != null){
            this.marque = marque;
        }
        if (moteur != null){
            this.moteur = moteur;
        }
    }

    public Voiture(Moteur moteur) {
        this();

        if (moteur != null){
            this.moteur = moteur;
        }
    }

    public Voiture(String marque) {
        if (marque != null){
            this.marque = marque;
        }
    }


    public boolean GetEstDisponible(){
        return estDisponible;
    }

    public void SetEstDisponible(boolean etat){
        estDisponible = etat;
    }


    

    public void ChangerMoteur(Moteur m){
        if (m != null){
            this.moteur = m;
        }
    }

    public void VoitureInfo(){
        System.out.println("Immm : " + immatriculation + " | Marque : " + marque + " | Moteur : " + moteur.toString());
    }


    @Override
    public String toString(){
        return "Immm : " + immatriculation + " | Marque : " + marque + " | Dispo :"  + estDisponible + " | Moteur : " + moteur.toString() ;
    }


    
}
