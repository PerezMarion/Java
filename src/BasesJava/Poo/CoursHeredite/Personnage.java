package BasesJava.Poo.CoursHeredite;

// A chaque fois que l'on créer une classe dans java
// Elle est automatiquement liée à la classe "objet" qui est une super classe tout en haut
// Cette classe "objet" contient automatiquement certaines méthodes :
// toString


public abstract class Personnage {

    // Une classe abstraite est une classe qui ne peut avoir d'instance

    private String nom;
    private int dureeDeVie;

    public Personnage(String nom, int dureeDeVie) {
        this.nom = nom;
        this.dureeDeVie = dureeDeVie;
    }

    public String getNom() {return nom;}
    public void setNom(String nom) {this.nom = nom;}

    public int getDureeDeVie() {return dureeDeVie;}
    public void setDureeDeVie(int dureeDeVie) {this.dureeDeVie = dureeDeVie;}

    public abstract void rencontrer();
}