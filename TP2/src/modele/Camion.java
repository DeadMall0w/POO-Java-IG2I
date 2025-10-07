package TP2.src.modele;

public class Camion extends Voiture{
    private int tonnageMax;

    public Camion(){
        super();

        intiTonnageMax(0);
    }

    public Camion(int tonnageMax){
        this();

        intiTonnageMax(tonnageMax);
    }

    public void intiTonnageMax(int tonnageMax){
        if (tonnageMax < 0){
            tonnageMax = 0;
        }else{
            this.tonnageMax = tonnageMax;
        }
    }
}
