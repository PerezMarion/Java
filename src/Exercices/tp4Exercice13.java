package Exercices;

import java.util.Scanner;

public class tp4Exercice13 {
    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);
        System.out.print("Definir une adresse mail de connexion : ");
        String adresseMail = input.nextLine();
        System.out.print("Definir un mot de passe de connexion : ");
        String motDePasse = input.nextLine();

        System.out.println("Compte cree avec succes.\n\n");
        System.out.println("Veuillez vous connecter a votre compte");

        while(true) {
            System.out.print("Entrer votre adresse mail de connexion : ");
            String adresseMailATester = input.nextLine();

            if (adresseMailATester.equals(adresseMail)) {
                System.out.println("L'adresse mail de connexion est reconnue.");
                break;
            }
            System.out.println("Erreur : l'adresse mail de connexion n'est pas reconnue.\nReessayez ou creer d'abord un compte.");
        }
        while(true){
            System.out.print("Entrer votre mot de passe de connexion : ");
            String motDePasseAtester = input.nextLine();

            if(motDePasseAtester.equals(motDePasse)) {
                System.out.println("Vous avez reussi a vous connecter avec succes.");
                break;
            }
            System.out.println("Erreur : le mot de passe de connexion est errone. Reessayer.");
        }
    }
}