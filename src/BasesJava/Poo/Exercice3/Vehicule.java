package BasesJava.Poo.Exercice3;

import javax.swing.*;

public abstract class Vehicule {

    private int matricule;
    private static int compteur=0;
    private int anneeModele;
    private double prix;

    public Vehicule(int anneeModele,double prix){
        compteur++;
        this.matricule=compteur;
        this.anneeModele=anneeModele;
        this.prix=prix;
    }

    public int getMatricule() {return matricule;}
    public void setMatricule(int matricule) {this.matricule = matricule;}

    public int getAnneeModele() {return anneeModele;}
    public void setAnneeModele(int anneeModele) {this.anneeModele = anneeModele;}

    public double getPrix() {return prix;}
    public void setPrix(double prix) {this.prix = prix;}

    public abstract void demarrer();

    public abstract void accelerer();

    @Override
    public String toString() {
        return String.format("\nLe matricule du vehicule est : %d\nL'annee du modele est : %d\nLe prix du vehicule est de %.2f euros."
                ,this.matricule,this.anneeModele,this.prix);
    }
}