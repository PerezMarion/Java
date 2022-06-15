package BasesJava.Poo;

import org.w3c.dom.css.Rect;

public class Rectangle {

    private double longueur;
    private double largeur;
    double calculSurface() {
        return longueur * largeur;
    }
    double calculPerimetre() {
        return 2 * (longueur + largeur);
    }

    // Methode qui ne sert qu'a afficher quelque chose
    public void motFin(){
        System.out.println("C'est fini !");
    }

    // Constructeur par defaut par defaut
    // Appele automatiquement dans main par java quand on n'a pas mis de constructeur dans la classe

    // Constructeur
    // Surchage : possibilite d'avoir au sein d'une classe plusieurs constructeurs avec le meme nom
    // Appele si on rentre les valeurs des parametres sur main
    public Rectangle(double longueur,double largeur){
        this.longueur=longueur;
        this.largeur=largeur;
    }

    // Constructeur par defaut
    // Appele si on ne rentre aucune valeur de parametre sur main
    public Rectangle(){
        longueur=10;
        largeur=8;
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