package Cours;

public class Variables {
    public static void main(String[] args) {
        //calcul rectangle
        int longueur=50;
        int largeur=25;
        int surface=longueur*largeur;
        int perimetre=2*(longueur+largeur);
        System.out.println(surface);
        System.out.println(perimetre);

        //calcul de la vitesse moyenne
        float distanceParcourue=90.6f;
        float temps=12.354f;
        double vitesseMoyenne=distanceParcourue/temps;
        System.out.print(vitesseMoyenne);
    }
}
