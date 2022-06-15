package BasesJava.Exercices;

import java.util.Scanner;

public class tp5Exercice19 {
    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);
        System.out.print("Ecrivez un mot : ");
        String texte = input.nextLine();
        String texteInverse = "";
        char lettre;

        for(int i=0;i<texte.length();i=i+1) {
            lettre = texte.charAt(i);
            texteInverse = lettre + texteInverse;
        }
        if(texte.equals(texteInverse)) {
            System.out.println("Le mot " +texte + " est un palindrome.");
        }else{
            System.out.println("Le mot " +texte+ " n'est pas un palindrome.");
        }
    }
}
