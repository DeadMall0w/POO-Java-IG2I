package TP5.reseau;

import java.util.Objects;

public class Route implements Comparable<Route> {
    private double distance;
    private Point debut;
    private Point fin;

    public Route(Point debut, Point fin) {
        if(fin != null && debut!=null){
            this.fin = fin;
            this.debut = debut;
            calculLongueur();
        }
    }

    private void calculLongueur() {
        double dx = debut.getAbscisse() -  fin.getAbscisse();
        double dy = debut.getOrdonne() -  fin.getOrdonne();
        this.distance = Math.sqrt(Math.pow(dx, 2) + Math.pow(dy, 2));
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Route route = (Route) o;
        return Objects.equals(debut, route.debut) && Objects.equals(fin, route.fin);
    }

    @Override
    public int hashCode() {
        return Objects.hash(debut, fin);
    }

    @Override
    public int compareTo(Route route) {
        if(this.equals(route)) return 0;
        return Double.compare(this.distance, route.distance);
    }

    public double getDistance() {
        return distance;
    }

    public Point getDebut() {
        return debut;
    }

    public void setDebut(Point debut) {
        this.debut = debut;
        calculLongueur();
    }

    public Point getFin() {
        return fin;
    }

    public void setFin(Point fin) {
        this.fin = fin;
        calculLongueur();
    }

    @Override
    public String toString() {
        return "Route{" +
                "Origine[" +
                "abscisse=" + debut.getAbscisse() +
                ", ordonnee=" + debut.getOrdonne() +
                ", id=" + debut.getId() +"]"+
                ",Destination[" +
                "abscisse=" + fin.getAbscisse() +
                ", ordonnee=" + fin.getOrdonne() +
                ", id=" + fin.getId() +"]" +
                ", distance=" + distance +
                '}';
    }

    public static void main(String[] args) {

    }
}
