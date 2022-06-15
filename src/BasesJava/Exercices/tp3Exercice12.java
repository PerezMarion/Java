package BasesJava.Exercices;

import java.util.Scanner;

public class tp3Exercice12 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Entrer un nombre pour connaitre la suite : ");
        int nombre = input.nextInt() + 1;

        for (int i = nombre; i < (nombre + 10); i = i + 1) {
            System.out.println(i);
        }
    }
}
