package TP2.src;

import TP2.src.modele.*;


public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, world ! (2)");


        Formule1 v1 = new Formule1();
        System.out.println(v1);
    }

    
    void TestTP1(){
        // System.out.println("Gestion des moteurs : ");


        // // Création d'objets moteurs
        // Moteur m1 = new Moteur(150, 'E');
        // Moteur m2 = new Moteur(1900, 'D');
        // Moteur m3 = new Moteur(m2);

        // // Interaction avec la classe
        // m1.afficherInfos();
        // m2.afficherInfos();
        // m3.afficherInfos();

        // // Changement de puissance
        // m2.setPuissance(450);

        // // Affichage dans la console
        // System.out.println(m2.toString());
    

        // // * Gestion des voitures
        // System.out.println("Gestion des voitures : ");

        // Voiture maVoiture = new Voiture("Ferrari", m3);
        // Voiture maVoiture2 = new Voiture("Peugeot", m2);

        // maVoiture.VoitureInfo();
        // maVoiture2.VoitureInfo();

        // Moteur m1 = new Moteur(null);
        // Moteur m2 = new Moteur(1000, 'E');
        // Voiture v1 = new Voiture(null, m1);
        // Voiture v2 = new Voiture("Ferrari", m2);
        // Voiture v3 = new Voiture("Ferrari", m2);

        // System.out.println("v1 : " + v1.toString());
        // System.out.println("v2 : " + v2.toString());
        // System.out.println("v3 : " + v3.toString());
        // m2.setPuissance(1200);
        // System.out.println("v2 : " + v2.toString());
        // System.out.println("v3 : " + v3.toString());

        
        Moteur m1 = new Moteur(750, 'D');
        Moteur m2 = new Moteur(1000, 'D');

        Voiture v1 = new Voiture("Ferrari", m1);
        Voiture v2 = new Voiture("Redbull", m2);


        Personne p1 = new Personne("Verstappen", "Max", "Chez Max");
        Personne p2 = new Personne("Hamilton", "Lewis", "Chez lewis");
        Personne p3 = new Personne("voleur", "Jean", "Paris");

        if (!p1.AffecterVoiture(v1)){
            System.err.println("ERREUR - N'a pas pu prendre la voiture libre");
        }

        if (p2.AffecterVoiture(v1)){
            System.err.println("ERREUR - Voiture deja prise");
        }
        
        if (p1.AffecterVoiture(v2)){
            System.err.println("ERREUR - Deja dans une voiture");
        }

        if (!p2.AffecterVoiture(v2)){
            System.err.println("ERREUR - N'a pas pu prendre la voiture libre");
        }

        if (p3.RestituerVoiture()){
            System.err.println("ERREUR - A pu rendre une voiture qui n'existe pas");
        }

        if (!p1.RestituerVoiture()){
            System.err.println("ERREUR - N'a pas pu restituer la voiture !");
        }

        if (!p3.AffecterVoiture(v1)){
            System.err.println("ERREUR - N'a pas pu voler la voiture");
        }

        if (p1.AffecterVoiture(null)){
            System.err.println("ERREUR - A pu prendre une voiture nulle");
        }



        // cas de chat GPT
        // 2. Restitution multiple
        if (p3.RestituerVoiture() && p3.RestituerVoiture()) {
            System.err.println("ERREUR - A pu restituer deux fois d'affilée");
        }

        // 3. Attribution en chaîne (libération puis réutilisation)
        if (!p2.RestituerVoiture()) {
            System.err.println("ERREUR - p2 n'a pas pu rendre v2");
        }
        if (!p1.AffecterVoiture(v2)) {
            System.err.println("ERREUR - v2 n'a pas pu être reprise par p1 après restitution");
        }

        // 4. Même personne prend deux fois la même voiture
        if (!p1.RestituerVoiture()) {
            System.err.println("ERREUR - p1 n'a pas pu rendre v2");
        }
        if (!p1.AffecterVoiture(v2)) {
            System.err.println("ERREUR - p1 n'a pas pu prendre v2 la première fois");
        }
        if (p1.AffecterVoiture(v2)) {
            System.err.println("ERREUR - p1 a pu prendre deux fois la même voiture");
        }

        // 5. Restitution multiple encore (après libération)
        if (!p1.RestituerVoiture()) {
            System.err.println("ERREUR - p1 n'a pas pu rendre v2");
        }
        if (p1.RestituerVoiture()) {
            System.err.println("ERREUR - p1 a pu restituer encore une fois alors qu'il n'a plus de voiture");
        }
    }
}
