package BasesJava.TP_ValidationDesAcquis.TP10;

public class TP10 {

    // Le but de cet exercice est de simuler une tirelire dans laquelle on stocke et retire de l’argent
    // Et que l’on souhaite utiliser pour payer un certain budget de vacances, par exemple.

    private double solde;
    public TP10(double montant) {
        this.solde = montant;
    }

    public double getSolde() {return solde;}

    public String afficher() {
        if (this.solde >0){
            return String.format("%.2f EUR dans ta tirelire.\n", this.solde);
        }
            return "Vous etes sans le sou.\n";
        }
    public void secouer() {
        if (this.solde > 0){
            System.out.println("Bling bling bliing pete de tune frere.\n");
        }
    }
    public void remplir(double montant) {
        if (montant<0){
            montant = 0;
            System.out.println("Le montant doit etre positif, tirelire non affectee.\n");
        }
        this.solde += montant;
        System.out.println("Vous avez ajoute "+montant+" EUR\n");
    }

    public void vider() {
        if (this.solde == 0){
            System.out.println("Tu ne peux rien vider tu n'as deja plus rien.\n");
        }
        this.solde = 0;
        System.out.println("Tirelire videe, tu as tout pris.\n");
    }
    public void puiser(double montant) {

        if (montant <= this.solde && montant > 0){
            this.solde -= montant;
            System.out.println("Vous avez retire "+montant+" EUR\n");
        } else if (montant > this.solde){
            this.solde = 0;
            System.out.println("Tu voulais demander plus que ce que t'avais, donc t'as plus rien et t'as pas eu plus.\n");
        } else {
            System.out.println("Mets un nombre positif a retirer (pas d'impact sur le solde).\n");
        }
    }
    public double calculerSolde(double montant) {
        if (montant<0){
            return this.solde;
        }
        if (montant > this.solde){
            System.out.println("Tu voudrais retirer "+montant+" EUR n'as pas assez d'argent, prefere la Creuse a Monaco.");
        }
        return this.solde - montant;
    }
}