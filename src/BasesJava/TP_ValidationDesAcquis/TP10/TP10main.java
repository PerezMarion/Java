package BasesJava.TP_ValidationDesAcquis.TP10;

public class TP10main {
    public static void main(String[] args) {

        TP10 vache = new TP10(100);

        System.out.println(vache.afficher());
        vache.puiser(10);

        System.out.println(vache.afficher());
        vache.remplir(20);

        System.out.println(vache.afficher());
        vache.secouer();

        System.out.println(vache.calculerSolde(256));

        System.out.println(vache.calculerSolde(28));

        vache.vider();
        System.out.println(vache.afficher());;
    }
}