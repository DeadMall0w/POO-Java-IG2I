package TP5.reseau;

import java.util.HashSet;
import java.util.Set;

public class Client extends Point {
    private int nbcCaisse;

    public Client(int abscisse, int ordonne, int nbcCaisse) {
        super(abscisse, ordonne);
        this.nbcCaisse = nbcCaisse;
    }

    public int getNbcCaisse() {
        return nbcCaisse;
    }

    public void setNbcCaisse(int nbcCaisse) {
        this.nbcCaisse = nbcCaisse;
    }

    @Override
    public String toString() {
        return "Client{" + super.toString() + ", Nombre caisse=" + this.nbcCaisse + '}';
    }

    public static void main(String[] args) {

        Client c1 = new Client(5,5,10);
        Client c2 = new Client(-5,5,10);
        Client c3 = new Client(-5,-5,10);
        Client c4 = new Client(5,-5,10);
        Set<Point> mesClients = new HashSet<>();
        mesClients.add(c2);
        mesClients.add(c3);
        mesClients.add(c4);
        c1.ajouterRoutes(mesClients);
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
        System.out.println(c4);
    }
}
