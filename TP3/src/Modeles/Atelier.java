package TP3.src.Modeles;


import java.util.ArrayList;
import java.util.List;
public class Atelier {

    private int numberOfMachine;
    private List<Machine> listeMachine;

    
     public Atelier(int numberOfMachine) {
        listeMachine = new ArrayList<Machine>();
        if (numberOfMachine <= 1){
           this.numberOfMachine = 1; 
        }else{
            this.numberOfMachine = numberOfMachine;
        }

        for (int i = 0; i < this.numberOfMachine; i++) {
            listeMachine.add(new Machine());
        }
    }


     public int getNumberOfMachine() {
        return numberOfMachine;
    }



     public List<Machine> getListeMachine() {
         return listeMachine;
     }


     public void AddTache(Tache t, int n){
        listeMachine.get(n).AddTache(t);
     }

     @Override
     public String toString(){
        StringBuilder sb = new StringBuilder();

        for (Machine m : listeMachine) {
            sb.append(m.toString());  // ajoute la représentation de la machine
            sb.append("\n\n");        // ajout d’une ligne vide entre les machines (optionnel)
        }

        return sb.toString();
     } 


     public double getCoutTotal(){
        double res = 0;
        for (int i = 0; i < listeMachine.size(); i++) {
            res += listeMachine.get(i).getPenaliteTotal();
        }


        return res;
     }

}
