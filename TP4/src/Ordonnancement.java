package TP4.src;

import java.util.ArrayList;
import java.util.List;
import TP4.src.Modeles.Tache;
import TP4.src.Modeles.Atelier;


public interface Ordonnancement{
    public static List<Tache> copierTaches(List<Tache> taches){
        List<Tache> copie = new ArrayList<Tache>();
        for(int i = 0; i < taches.size(); i++){
            copie.add(new Tache(taches.get(i)));
        }

        return copie;
    }


    public Atelier Ordonnancer(int nbMachine, List<Tache>taches);
}
