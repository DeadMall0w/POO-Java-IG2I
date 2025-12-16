// mail prof : nathan.davouse@inria.fr
package TP4.src;
import java.util.ArrayList;
import java.util.List;

import TP4.src.Modeles.*;

public class ConfetiEtMasques {
   public static void main(String[] args) {
        System.out.println("Hello, world ! (3)");
        
        Atelier atelier = new Atelier(3); 

        List<Tache> listeTaches = new ArrayList<>();

        listeTaches.add(new Tache(100, 250, 10));
        listeTaches.add(new Tache(75, 150, 15));
        listeTaches.add(new Tache(50, 300, 12));
        listeTaches.add(new Tache(160, 500, 8));
        
        
        List<Tache> list2 = Ordonnancement.copierTaches(listeTaches);
        
        System.out.println("liste tache");
        System.out.println(list2);
        listeTaches.add(new Tache(700, 500, 8));

        System.out.println();
        System.out.println();
        System.out.println("liste 2");
        System.out.println(list2);

        System.out.println();
        System.out.println();
        System.out.println("liste Tache");

        System.out.println(listeTaches);


        
        // atelier.AddTache(listeTaches.get(1), 0);
        // atelier.AddTache(listeTaches.get(0), 0);
        // atelier.AddTache(listeTaches.get(2), 0);
        // atelier.AddTache(listeTaches.get(3), 0);
        
        // System.out.println(atelier);
        // System.out.println(atelier.getCoutTotal());
   }


}
