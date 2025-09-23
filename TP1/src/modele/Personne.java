package TP1.src.modele;

public class Personne {
    private int id;
    private String nom;
    private String prenom;
    private String adresse;

    private Voiture voitureConduite = null;

    private static int personneCount = 0;

    private Personne(){
        this.id = personneCount ++;
    
        this.nom = "Nom par défaut";
        this.prenom = "Prénom par défaut";
        this.adresse = "Adresse par défaut";
    }


    public Personne(String nom, String prenom, String adresse){
        this();

        this.nom = nom;
        this.prenom = prenom;
        this.adresse = adresse;
    }


    public String GetNom(){
        return this.nom;
    }

    public String GetPrenom(){
        return this.prenom;
    }

    public String GetAdresse(){
        return this.adresse;
    }

    public void SetAdresse(String adresse){
        this.adresse = adresse;
    }

    public Voiture getVoitureConduite(){
        return voitureConduite;
    }

    public boolean AffecterVoiture(Voiture v){
        if (v != null && voitureConduite == null && v.GetEstDisponible() == true){
            voitureConduite = v;
            v.SetEstDisponible(false);
            return true;
        }
        return false;
    }


    public boolean RestituerVoiture(){
        if (voitureConduite == null){
            return false;
        }
        voitureConduite.SetEstDisponible(true);
        voitureConduite = null;
        return true;
    }


    public boolean estPieton(){
        return (voitureConduite==null)?true:false;
    }



    @Override
    public String toString(){
        return nom + " -" + "prenom" + prenom + " @ " + adresse;
    }

}


