package BasesJava.Cours;

import java.util.Scanner;

public class BoucleWhileVersion1 {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        String codePin="";
        System.out.println("Veuillez definir un code PIN a quatre chiffres.");

        while(codePin.length()!=4) {
            System.out.print("Code PIN : ");
            codePin = input.nextLine();
            if(codePin.length()!=4){
                System.out.println("Erreur : le code PIN doit etre compose de quatre chiffres");
            }else{
                System.out.println("Code PIN defini avec succes.");
            }
        }
        System.out.println("Telephone verrouille.");

        String codeATester="0";
        while(!codeATester.equals(codePin)) {
            System.out.print("Entrez votre code PIN pour deverouiller l'appareil : ");
            codeATester= input.nextLine();
            if(codeATester.equals(codePin)){
                System.out.println("L'appareil est deverrouille.");
            }else{
                System.out.println("Code PIN errone. Veuillez recommencer.");
            }
        }
    }
}
