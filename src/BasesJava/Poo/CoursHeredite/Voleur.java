package BasesJava.Poo.CoursHeredite;

public class Voleur extends Personnage {

        private String arme;

        public Voleur(String nom, int dureeDeVie, String arme) {
        super(nom,dureeDeVie);
        this.arme = arme;
        }

        public String getArme() {return arme;}
        public void setArme(String arme) {this.arme = arme;}

        public void voler(){
            System.out.println("Cache bien ton téléphone");
        }

        @Override
        public void rencontrer() {
                System.out.println("Je suis un voleur, je vais te chiper !");
        }
}