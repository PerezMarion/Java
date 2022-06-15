package BasesJava.Cours;

import java.util.Scanner;

public class BoucleWhileVersionAttendue {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        String codePin;
        System.out.println("Veuillez definir un code PIN a quatre chiffres.");

        while(true) {
            System.out.print("Code PIN : ");
            codePin = input.nextLine();
            if(codePin.length()==4){
                System.out.println("Code PIN defini avec succes.");
                break;
            }
            System.out.println("Erreur : le code PIN doit etre compose de quatre chiffres.");
        }

        System.out.println("Telephone verrouille.");

        String codeATester;
        while(true) {
            System.out.print("Entrez votre code PIN pour deverouiller l'appareil : ");
            codeATester= input.nextLine();
            if(codeATester.equals(codePin)){
                System.out.println("L'appareil est deverrouille.");
                break;
            }
            System.out.println("Code PIN errone. Veuillez recommencer.");

        }
    }
}