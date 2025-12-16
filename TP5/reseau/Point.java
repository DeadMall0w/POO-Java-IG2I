package TP5.reseau;

import java.util.*;

public abstract class Point {
    private double abscisse;
    private double ordonne;
    private int id;
    private static int dernierId = -1;
    private Map<Route, Double> routes;

    public Point(double abscisse, double ordonne) {
        this.abscisse = abscisse;
        this.ordonne = ordonne;
        dernierId++;
        this.id = dernierId;
        this.routes = new HashMap<>();
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Point point = (Point) o;
        return id == point.id;
    }

    @Override
    public int hashCode() {
        return id;
    }


    public double getAbscisse() {
        return abscisse;
    }

    public void setAbscisse(int abscisse) {
        this.abscisse = abscisse;
    }

    public double getOrdonne() {
        return ordonne;
    }

    public void setOrdonne(int ordonne) {
        this.ordonne = ordonne;
    }

    public int getId() {
        return id;
    }

    public HashMap<Route, Double> getRoutes() {
        return new HashMap<>(routes);
    }

    public void ajouterRoutes(Collection<Point> mesDestinations) {
        for (Point point : mesDestinations) {
            Route route = new Route(this, point);
            routes.put(route, route.getDistance());
        }
    }

    public double getDistance(Point p) {
        for (Route route : routes.keySet()) {
            if(route.getFin().equals(p) && route.getDebut().equals(this)) {
                return  routes.get(route);
            }
        }
        return Double.POSITIVE_INFINITY;
    }

    public int getNbRoutes() {
        return this.routes.size();
    }

    @Override
    public String toString() {
        String s = "Point{" +
                "abscisse=" + abscisse +
                ", ordonne=" + ordonne + ", route=" + "{";

        for(Route route : routes.keySet()) {
            s += route.toString() + ",";
        }

        s += "}";
        return s;
    }

    public static void main(String[] args) {
        Collection<Point> points = new ArrayList<>();
    }
}
