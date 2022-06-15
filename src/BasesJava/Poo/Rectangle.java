package BasesJava.Poo;

public class Rectangle {

    private double longueur;
    private double largeur;
    double calculSurface() {
        return longueur * largeur;
    }
    double calculPerimetre() {
        return 2*(longueur+largeur);
    }

    // Methode qui ne sert qu'a afficher quelque chose
    public void motFin(){
        System.out.println("C'est fini !");
    }

    // Accesseurs ou getters : methodes qui donnent la possibilite de lire des attributs prives
    public double getLongueur() {
        return longueur;
    }
    public double getLargeur() {
        return largeur;
    }

    // Manipulateurs ou setters : methodes qui donnent la possibilite de modifier des attributs prives
    // Creation d'une nouvelle valeur nommée longueur qui va prendre la place de la valeur actuelle du parametre longueur
    public void setLongueur(double longueur) {
        this.longueur = longueur;
    }
    public void setLargeur(double largeur) {
        this.largeur = largeur;
    }
}