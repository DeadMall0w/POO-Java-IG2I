package TP1.src.modele;

public class Moteur {
    private int puissance;
    private char carburant;


    public static int MIN_PUISSANCE = 300;
    public static int MAX_PUISSANCE = 1500;

    public static char DIESEL = 'D';
    public static char ESSENCE = 'E';


    // * CONSTRUCTEURS

    public Moteur(){ // * Constructeur par défaut -> pas d'argument
        this.puissance = MIN_PUISSANCE;
        this.carburant = DIESEL;
    }

    /**
     * Constructeur du moteur
     * @param puissance Puissance en chevaux du moteur
     */
    public Moteur(int puissance, char carburant) {
        this(); // * Appelle le constructeur par défaut
        if (puissance > MAX_PUISSANCE){
            this.puissance = MAX_PUISSANCE;
        }else if (puissance < MIN_PUISSANCE){
            this.puissance = MIN_PUISSANCE;
        }else{
            this.puissance = puissance;
        }

        // TODO : vérifier si c'est un type de carburant valdide
        this.carburant = carburant;
    }


    /**
     * @deprecated utiliser NouvelleClasse à la place
     * @param m Moteur que l'on veut copier
     */
    public Moteur(Moteur m){
        this(); //* Appelle le constructeur par défaut

        if (m != null){
            this.puissance = m.puissance;
            this.carburant = m.carburant;
        }
    }


    // * Set/Get

    public void setPuissance(int puissance){
        if (puissance > MAX_PUISSANCE){
            this.puissance = MAX_PUISSANCE;
        }else if (puissance < MIN_PUISSANCE){
            this.puissance = MIN_PUISSANCE;
        }else{
            this.puissance = puissance;
        }
    }



    public void afficherInfos() {
        System.out.println("Moteur : " + puissance + " ch, carburant=" + carburant);
    }



    // * Override

    @Override
    public String toString(){
        return "Moteur : " + puissance + " ch, carburant=" + carburant;
    }
}
