package Exercices;

import java.util.Arrays;
import java.util.Scanner;

public class tp4Exercice16 {
    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);
        System.out.println("Outil mathematique :\nCreation de trois tableaux\nRecherche automatique des multiples de 3\nAffichage de la somme de ces nombres\n");
        System.out.print("Combien de nombres voulez vous renseigner dans le tableau 1 ? : ");
        int nombresTableau1=input.nextInt();
        System.out.print("Combien de nombres voulez vous renseigner dans le tableau 2 ? : ");
        int nombresTableau2=input.nextInt();
        System.out.print("Combien de nombres voulez vous renseigner dans le tableau 3 ? : ");
        int nombresTableau3=input.nextInt();

        int[] tableau1 = new int[nombresTableau1];
        int[] tableau2 = new int[nombresTableau2];
        int[] tableau3 = new int[nombresTableau3];

        int sommeMultiplesDe3=0;
        String multiplesDe3="";

        System.out.println("\nEntrer les nombres du tableau 1 :");
        for(int a=0;a<=tableau1.length-1;a=a+1){
            System.out.print("Nombre entier numero"+(a+1)+" : ");
            int nombreAInsere=input.nextInt();
            tableau1[a]=nombreAInsere;
            if(nombreAInsere % 3 == 0) {
                sommeMultiplesDe3 = sommeMultiplesDe3 + nombreAInsere;
                if(sommeMultiplesDe3==0) {
                    multiplesDe3 = "" + nombreAInsere;
                } else {
                    multiplesDe3 = multiplesDe3+ " + " + nombreAInsere;
                }
            }
        }
        System.out.println("Vous avez bien renseigne tous les nombres du tableau 1.\n");

        System.out.println("\nEntrer les nombres du tableau 2 :");
        for(int b=0;b<=tableau2.length-1;b=b+1){
            System.out.print("Nombre entier numero"+(b+1)+" : ");
            int nombreAInsere=input.nextInt();
            tableau2[b]=nombreAInsere;
            if(nombreAInsere % 3 == 0) {
                sommeMultiplesDe3 = sommeMultiplesDe3 + nombreAInsere;
                if(sommeMultiplesDe3==0) {
                    multiplesDe3 = "" + nombreAInsere;
                } else {
                    multiplesDe3 =multiplesDe3+ " + " + nombreAInsere;
                }
            }
        }
        System.out.println("Vous avez bien renseigne tous les nombres du tableau 2.\n");

        System.out.println("\nEntrer les nombres du tableau 3 :");
        for(int c=0;c<=tableau3.length-1;c=c+1){
            System.out.print("Nombre entier numero"+(c+1)+" : ");
            int nombreAInsere=input.nextInt();
            tableau3[c]=nombreAInsere;
            if(nombreAInsere % 3 == 0) {
                sommeMultiplesDe3 = sommeMultiplesDe3 + nombreAInsere;
                if(sommeMultiplesDe3==0) {
                    multiplesDe3 = "" + nombreAInsere;
                } else {
                    multiplesDe3 =multiplesDe3+ " + " + nombreAInsere;
                }
            }
        }
        System.out.println("Vous avez bien renseigne tous les nombres du tableau 3.\n");

        System.out.println("T1 : "+ Arrays.toString(tableau1));
        System.out.println("T2 : "+ Arrays.toString(tableau2));
        System.out.println("T3 : "+ Arrays.toString(tableau3)+"\n");

        System.out.print("S = "+multiplesDe3+" = "+sommeMultiplesDe3);
    }
}