package BasesJava.Poo.CoursHeredite;

// A chaque fois que l'on crée une classe dans java
// Elle est automatiquement liée à la classe "objet" qui est une super classe tout en haut
// Cette classe "objet" contient automatiquement certaines méthodes dont toString
// Si on ne fait pas redéfinition de la méthode toString on obtient le nom de la classe +@ +hashcode
// Il faut donc redéfinir la méthode pour afficher ce que l'on souhaite

// Cette redéfinition n'est possible que s'il ne s'agit pas d'une méthode finale
// Une variable finale ne peut être initialisée qu'une seule fois et ne peut être réaffectée
// Une méthode finale ne peut pas être redéfinie dans une classe enfant de celle où elle été créée

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

    public void chanter(){
        System.out.println("J'aime chanter !");
    }
}