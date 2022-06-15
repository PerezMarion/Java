package BasesJava.Poo;

public class Main {
    public static void main(String[] args) {

    // Avant getters et setters

        // Etat initial de l'objet après creation

            // Creation d'une instence/objet de la classe Rectangle
                // Rectangle terrain=new Rectangle();
            // Afficher la valeur de l'attribut longueur de l'instence/objet rectangle
                // System.out.println("La longueur : "+terrain.longueur);
                // System.out.println("La largeur : "+terrain.largeur);

        // Etat de l'objet après avoir fourni les valeurs

            // terrain.longueur=500;
            // terrain.largeur=350;
            // System.out.println("\nLa longueur : "+terrain.longueur);
            // System.out.println("La largeur : "+terrain.largeur);
            // System.out.println("La surface : "+terrain.calculSurface());
            // System.out.println("Le perimetre : "+terrain.calculPerimetre());

            // terrain.motFin();

    // Apres getters et setters

        Rectangle terrain=new Rectangle();
        terrain.setLongueur(500);
        terrain.setLargeur(350);
        System.out.println("\nLa longueur : "+terrain.getLongueur());
        System.out.println("La largeur : "+terrain.getLargeur());
        System.out.println("La surface : "+terrain.calculSurface());
        System.out.println("Le perimetre : "+terrain.calculPerimetre());

    // Apres constructeurs

        Rectangle terasse=new Rectangle();
        System.out.println("\nLa longueur : "+terasse.getLongueur());
        System.out.println("La largeur : "+terasse.getLargeur());
        System.out.println("La surface : "+terasse.calculSurface());
        System.out.println("Le perimetre : "+terasse.calculPerimetre());

        Rectangle jardin=new Rectangle(50,30);
        System.out.println("\nLa longueur : "+jardin.getLongueur());
        System.out.println("La largeur : "+jardin.getLargeur());
        System.out.println("La surface : "+jardin.calculSurface());
        System.out.println("Le perimetre : "+jardin.calculPerimetre());
    }
}
