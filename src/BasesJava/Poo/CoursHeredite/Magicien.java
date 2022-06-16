package BasesJava.Poo.CoursHeredite;

public class Magicien extends Personnage {

        private String baguette;

        public Magicien(String nom, int dureeDeVie, String baguette) {
        super(nom,dureeDeVie);
        this.baguette = baguette;
        }

        public String getBaguette() {return baguette;}
        public void setBaguette(String baguette) {this.baguette = baguette;}

        @Override
        public void rencontrer() {
                System.out.println("Je suis un magicien, j'utilise la magie pour guerir !");
        }
}