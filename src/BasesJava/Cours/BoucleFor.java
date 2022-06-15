package BasesJava.Cours;

import java.util.Scanner;

public class BoucleFor {
    public static void main(String[] args) {

        // Afficher tous les nombres allant de 1 à 10 à la puissance 2 :
        // System.out.println(Math.pow(1,2));
        // System.out.println(Math.pow(2,2));
        // System.out.println(Math.pow(3,2));
        // System.out.println(Math.pow(4,2));
        // System.out.println(Math.pow(5,2));
        // System.out.println(Math.pow(6,2));
        // System.out.println(Math.pow(7,2));
        // System.out.println(Math.pow(8,2));
        // System.out.println(Math.pow(9,2));
        // System.out.println(Math.pow(10,2));
        // Non !


        // Utilisation d'une structure itérative (pour i allant de 1 à 10) :
        // Pour i=1 tant que i<= 10 avec un pas de +1, effectuer ...

        for(int i=1;i<=10;i=i+1) {
            System.out.println(Math.pow(i, 2));
        }

        // Afficher la table de multiplication d'un nombre sélectionné

        Scanner input = new Scanner(System.in);
        System.out.println("Entrer un nombre entre 1 et 10 dont vous vous voir la table de multiplication : ");
        int nombre = input.nextInt();

        for(int i=1;i<=10;i++) {
            System.out.println(nombre+" x "+i+" = "+(i*nombre));
            // ou System.out.printf("%d x %d = %d\n",nombre,i,(i*nombre));
        }

        //Afficher la table de multiplication d'un nombre sélectionné (version2)

        // Scanner input = new Scanner(System.in);
        System.out.print("Entrer un nombre entre 1 et 10 dont vous vous voir la table de multiplication : ");
        int nombreVersion2= input.nextInt();

        System.out.print("Debut : ");
        int nombreDebut= input.nextInt();
        System.out.print("Fin : ");
        int nombreFin= input.nextInt();

        for(int i=nombreDebut;i<=nombreFin;i=i+1) {
            System.out.print(nombreVersion2 + " x " + i + " = " + (i * nombreVersion2));
        }
    }
}
