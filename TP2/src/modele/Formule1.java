package TP2.src.modele;

import java.text.Normalizer.Form;

public class Formule1 extends Voiture {
    private String sponsor;
    public Formule1(){
        super(); // appelle Voiture.this(); (constructeur sans argument de Voiture)
        this.initiateSponsor(null);
    
    }

    public Formule1(final String sponsor){
        this();
        this.initiateSponsor(sponsor);
    }



    public String getSponsor(){
        return sponsor;
    }

    public void setSponsor(final String sponsor){
        this.initiateSponsor(sponsor);
    }

    @Override
    public String toString(){
        return "Formule1 {" + super.toString() + "} - Sponsor : " + sponsor;
    }

    public void initiateSponsor(final String sponsor){
        this.sponsor = (sponsor!=null)?sponsor:"SPONSOR"; 
    }


}
