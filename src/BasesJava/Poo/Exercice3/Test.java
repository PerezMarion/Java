package BasesJava.Poo.Exercice3;

public class Test {

    public static void main(String[] args) {

        Voiture peugeot = new Voiture(2022,14690);
        System.out.println(peugeot);

        peugeot.demarrer();
        peugeot.accelerer();

        Voiture dacia = new Voiture(2018,11999.99);
        System.out.println(dacia);

        dacia.demarrer();
        dacia.accelerer();

        Voiture tesla = new Voiture(2021,35780);
        System.out.println(tesla);

        tesla.demarrer();
        tesla.accelerer();

        Camion mercedes = new Camion(2019,38200);
        System.out.println(mercedes);

        mercedes.demarrer();
        mercedes.accelerer();
    }
}