package BasesJava.TP_ValidationDesAcquis;

import java.util.Locale;
import java.util.Scanner;

public class TP4 {

    //Écrire un programme Java qui demande à l’utilisateur de saisir une chaîne de caractères et va
    // mettre en majuscule toutes les premières lettres de chaque mot.

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Ecrire une phrase : ");
        String phrase = input.nextLine().toLowerCase().trim();
        String[] listeDeMots = phrase.split(" ");
        String nouvellePhrase="";

        for(int i=0; i<listeDeMots.length;i=i+1){
            String mot = listeDeMots[i];
            String nouveauMot = mot.substring(0,1).toUpperCase() + mot.substring(1);
            nouvellePhrase += " " + nouveauMot;
        }
        System.out.println("La nouvelle est : "+nouvellePhrase);
    }
}