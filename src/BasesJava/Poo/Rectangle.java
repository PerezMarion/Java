package BasesJava.Poo;

public class Rectangle {

    double longueur;
    double largeur;

    double calculSurface() {
        return longueur * largeur;
    }

    double calculPerimetre() {
        return 2*(longueur+largeur);
    }
}