package BasesJava.Exercices;

import java.util.Scanner;

public class tp2Exercice9 {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        System.out.print("Le numero du mois est : ");
        int nbMois= input.nextInt();
        String nomMois;

        if(nbMois<1 || nbMois>12) {
            System.out.println("Le numero du mois n'est pas valide.");
        }else {
            switch (nbMois) {
                case 1:
                    nomMois = "Janvier";
                    break;
                case 2:
                    nomMois = "Fevrier";
                    break;
                case 3:
                    nomMois = "Mars";
                    break;
                case 4:
                    nomMois = "Avril";
                    break;
                case 5:
                    nomMois = "Mai";
                    break;
                case 6:
                    nomMois = "Juin";
                    break;
                case 7:
                    nomMois = "Juillet";
                    break;
                case 8:
                    nomMois = "Aout";
                    break;
                case 9:
                    nomMois = "Septembre";
                    break;
                case 10:
                    nomMois = "Octobre";
                    break;
                case 11:
                    nomMois = "Novembre";
                    break;
                case 12:
                    nomMois = "Decembre";
                    break;
                default:
                    nomMois = "Invalide";
            }
                System.out.printf("Le mois correspondant est : " + nomMois);
        }
    }
}
