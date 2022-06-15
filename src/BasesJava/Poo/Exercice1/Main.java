package BasesJava.Poo.Exercice1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Personne Marion=new Personne();
        Scanner input = new Scanner(System.in);

        System.out.println("Veuillez completer le formulaire suivant : ");
        System.out.print("Prenom : ");
        Marion.firstName=input.nextLine();
        System.out.print("Nom : ");
        Marion.lastName=input.nextLine();
        System.out.print("Pays : ");
        Marion.pays= input.nextLine();
        System.out.print("Marie(e) (oui/non) : ");
        String marieQuestion= input.nextLine();
            if(marieQuestion.equals("oui")){
                Marion.married=true;
            }else{
                Marion.married=false;
            }
        System.out.print("Nombre d'enfant(s) : ");
        Marion.nombreEnfants= input.nextByte();

        System.out.println("Vous vous appellez "+Marion.nomComplet()+".");
        System.out.println("Vous venez de "+Marion.pays+".");
        System.out.println("Vous "+(Marion.married?"etes marie(e).":"n'etes pas marie(e)."));
        System.out.println("Vous avez "+Marion.nombreEnfants+" enfant(s).");
    }
}