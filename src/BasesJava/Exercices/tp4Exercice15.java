package BasesJava.Exercices;

import java.util.Scanner;
import java.util.regex.Pattern;

public class tp4Exercice15 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String codePin;

        System.out.print("Definir un code PIN a quatre chiffres : ");

        while (true) {
           codePin = input.nextLine();

            if (Pattern.matches("[0-9]{4}", codePin)) {
                break;
            }
            System.out.print("Erreur : le code PIN doit etre compose de quatre chiffres.\nVeuillez reesayez : ");
        }
        System.out.println("Le code PIN a ete cree avec succes.\n");

        System.out.print("Entrer votre code PIN pour deverrouiller le telephone : ");

        while (true) {
            String codePinATester = input.nextLine();

            if (codePinATester.equals(codePin)) {
                System.out.println("Telephone deverouille.");
                break;
            }
            System.out.print("Code PIN incorrect.\nVeuillez reessayer : ");
        }
    }
}
