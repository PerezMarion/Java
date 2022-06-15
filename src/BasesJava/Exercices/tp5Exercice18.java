package BasesJava.Exercices;

import java.util.Scanner;

public class tp5Exercice18 {
    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);
        System.out.print("Ecrivez un mot ou une courte phrase : ");
        String texte = input.nextLine();
        String texteInverse = "";
        char lettre;

        for(int i=0;i<texte.length();i=i+1) {
            lettre = texte.charAt(i);
            texteInverse = lettre + texteInverse;
        }
        System.out.println("Le texte inversé est : "+texteInverse);
    }
}