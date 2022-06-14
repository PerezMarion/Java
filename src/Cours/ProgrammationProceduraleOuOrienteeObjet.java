package Cours;

public class ProgrammationProceduraleOuOrienteeObjet {

    // Pour calculer la surface est le perimetre d'un rectangle on doit :
    // Connaitre la longueur et la largeur
    // Connaitre le type de données pour les deux dimensions
    // Connaitre le type de données qui sera produit à l'issue du traitement

    static float calculAire(float longueur, float largeur){
        return(longueur*largeur);
    }
    static float calculPerimetre(float longueur,float largeur){
        return (longueur+largeur)*2;
    }

    public static void main(String[] args) {

    // Programmation procédurale

        // Rectangle 1
        float longueur1=500.5f;
        float largeur1=250f;

        float surface=longueur1*largeur1;
        float perimetre=(longueur1+largeur1)*2;

        // Rectangle 2
        float longueur2=33f;
        float largeur2=45f;

        float surface2=longueur2*largeur2;
        float perimetre2=(longueur2+largeur2)*2;

    // Programmation orientée objet

        // Rectangle 3
        float longueur3=150f;
        float largeur3=125.5f;

        float surface3=calculAire(longueur3,largeur3);
        float perimetre3=calculPerimetre(longueur3,largeur3);

        System.out.println("Rectangle 1 : A = "+surface+" et P = "+perimetre);
        System.out.println("Rectangle 2 : A = "+surface2+" et P = "+perimetre2);
        System.out.println("Rectangle 3 : A = "+surface3+" et P = "+perimetre3);
    }
}