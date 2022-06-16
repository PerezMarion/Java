package BasesJava.Poo.CoursHeredite;

public class Sorcier extends Magicien {

        private String batonMagique;

        public Sorcier(String nom, int dureeDeVie, String baguette,String batonMagique) {
        super(nom,dureeDeVie,baguette);
        this.batonMagique=batonMagique;
        }

        public String getBatonMagique() {return batonMagique;}
        public void setBatonMagique(String batonMagique) {this.batonMagique = batonMagique;}

        @Override
        public void rencontrer() {
                System.out.println("Je suis un sorcier, j'utilise la sorcellerie pour rependre le mal !");
        }
}