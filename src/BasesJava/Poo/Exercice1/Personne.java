package BasesJava.Poo.Exercice1;

public class Personne {

    String firstName;
    String lastName;
    String pays;
    boolean married;
    Byte nombreEnfants;

    String nomComplet() {
        return firstName+" "+lastName;
    }
}
