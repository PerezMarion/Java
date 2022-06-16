package BasesJava.Poo.Exercice3;

public class Camion extends Vehicule {

    public Camion(int anneeModele, double prix) {
        super(anneeModele, prix);
    }

    @Override
    public void demarrer() {
        System.out.println("Demarrage camion : Tourner la cle en enfoncant l'embrayage puis lacher l'embrayage en accelerant.");
    }

    @Override
    public void accelerer() {
        System.out.println("Acceleration camion : Appuyer plus fort sur la pedale d'acceleration et lorsque vous passez " +
                "2000 tours/min changez de vitesse.");
    }
}