package TP3.src.Modeles;

/*
-tempsProduction: int
-dateDebut: int
-dateLimite: int
-penaliteUnitaire: double
 * 
 */
public class Tache {
    private static final int MIN_TEMPS_PROD = 50;

    private static int dernierId;
    private int id;
    private int tempsProduction;
    private int dateDebut;
    private int dateLimite;
    private double penaliteUnitaire;

    
    private Tache() {
        id = dernierId++; // chaque tache à un id unique (croissant)

        tempsProduction = MIN_TEMPS_PROD;
        dateLimite = Integer.MAX_VALUE;
        penaliteUnitaire = 0;
        dateDebut = -1; // on n'a pas encore commencé cette tache

    }
    
    /**
     * 
     * @param tempsProduction Temps que la tâche prend à s'effectuer (en min)
     * @param dateDebut Date de début de production (-1 si on pas encore commencé) (en min) (0 -> 0min après l'instant initial) 
     * @param penaliteUnitaire Coût de la pénalité en cas de dépassement de la date limite (en min)
    */
    public Tache(int _tempsProduction, int _dateLimite, double _penaliteUnitaire) {
        this();
        
        this.tempsProduction = Math.max(_tempsProduction, MIN_TEMPS_PROD); // Minoré par MIN_TEMPS_PROD (50[min] dans la consigne) 
        this.dateLimite = Math.max(_dateLimite, 2*_tempsProduction); // minimise par 2 x temps de production
        this.penaliteUnitaire = _penaliteUnitaire;
    }

    public Tache(int _tempsProduction){
        this();

        this.tempsProduction = Math.max(_tempsProduction, MIN_TEMPS_PROD);
    }


    @Override
    public String toString(){
        return id + "- temps prod : " + tempsProduction + " | date debut : " + dateDebut + " | dateLimite : " + dateLimite + " | penalite : " + penaliteUnitaire;
    }

    public int getId() {
        return id;
    }

    public int getTempsProduction() {
        return tempsProduction;
    }

    public int getDateDebut() {
        return dateDebut;
    }

    public int getDateLimite() {
        return dateLimite;
    }

    public double getPenaliteUnitaire() {
        return penaliteUnitaire;
    }

    public boolean setDateDebut(int _dateDebut)
    {
        this.dateDebut = _dateDebut;
        return true;
    }

    // tests
    public static void main(String[] args) {
        Tache t1 = new Tache();
        Tache t2 = new Tache(150);
        Tache t3 = new Tache(20);
        Tache t4 = new Tache(90, 200, 5);
        Tache t5 = new Tache(60,80,-2);

        System.out.println(t1);
        System.out.println(t2);
        System.out.println(t3);
        System.out.println(t4);
        System.out.println(t5);



    }

    public double getCoutPenalite(){
        //ri × max {ci − di; 0}

        return penaliteUnitaire * Math.max(dateDebut + tempsProduction - dateLimite, 0);
    }

    public int getDateFin(){
        return dateDebut + tempsProduction;
    }
}
