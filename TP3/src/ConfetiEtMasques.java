// mail prof : nathan.davouse@inria.fr
package TP3.src;
import java.util.ArrayList;
import java.util.List;

import TP3.src.Modeles.*;

public class ConfetiEtMasques {
   public static void main(String[] args) {
        System.out.println("Hello, world ! (3)");
        

        Atelier atelier = new Atelier(3); 


        // Machine m1 = new Machine();

        List<Tache> listeTaches = new ArrayList<>();

        listeTaches.add(new Tache(1, 50, 10));
        listeTaches.add(new Tache(2, 75, 15));
        listeTaches.add(new Tache(3, 60, 12));
        listeTaches.add(new Tache(4, 80, 8));
        listeTaches.add(new Tache(5, 30, 5));
        listeTaches.add(new Tache(6, 55, 10));
        listeTaches.add(new Tache(7, 90, 20));
        listeTaches.add(new Tache(8, 40, 7));
        listeTaches.add(new Tache(9, 70, 15));
        listeTaches.add(new Tache(10, 65, 12));
        listeTaches.add(new Tache(11, 35, 5));
        listeTaches.add(new Tache(12, 50, 10));
        listeTaches.add(new Tache(13, 85, 18));
        listeTaches.add(new Tache(14, 60, 12));
        listeTaches.add(new Tache(15, 45, 8));
        listeTaches.add(new Tache(16, 55, 10));
        listeTaches.add(new Tache(17, 75, 15));
        listeTaches.add(new Tache(18, 50, 10));
        listeTaches.add(new Tache(19, 65, 12));
        listeTaches.add(new Tache(20, 80, 18));


        
        // Machine 1
        atelier.AddTache(listeTaches.get(0), 1);
        atelier.AddTache(listeTaches.get(3), 1);
        atelier.AddTache(listeTaches.get(6), 1);
        atelier.AddTache(listeTaches.get(9), 1);
        atelier.AddTache(listeTaches.get(12), 1);
        atelier.AddTache(listeTaches.get(15), 1);
        atelier.AddTache(listeTaches.get(18), 1);

        // // Machine 2
        atelier.AddTache(listeTaches.get(1), 2);
        atelier.AddTache(listeTaches.get(4), 2);
        atelier.AddTache(listeTaches.get(7), 2);
        atelier.AddTache(listeTaches.get(10), 2);
        atelier.AddTache(listeTaches.get(13), 2);
        atelier.AddTache(listeTaches.get(16), 2);
        atelier.AddTache(listeTaches.get(19), 2);

        // // Machine 3
        atelier.AddTache(listeTaches.get(2), 0);
        atelier.AddTache(listeTaches.get(5), 0);
        atelier.AddTache(listeTaches.get(8), 0);
        atelier.AddTache(listeTaches.get(11), 0);
        atelier.AddTache(listeTaches.get(14), 0);
        atelier.AddTache(listeTaches.get(17), 0);



        System.out.println(atelier);
        System.out.println(atelier.getCoutTotal());
   }


}
