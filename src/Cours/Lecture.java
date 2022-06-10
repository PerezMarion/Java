package Cours;

import java.util.Scanner;

public class Lecture {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.print("Votre nom : ");
        String nom=input.nextLine();

        System.out.print("Votre prenom : ");
        String prenom=input.next();

        System.out.print("Votre genre : ");
        char genre=input.next().charAt(0);

        System.out.print("Votre age : ");
        byte age=input.nextByte();

        System.out.printf("Nom : %s\nPrenom : %s\nGenre : %c\nAge : %d ans\n",prenom,nom,genre,age);
    }
}
