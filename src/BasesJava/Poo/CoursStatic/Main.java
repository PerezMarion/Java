package BasesJava.Poo.CoursStatic;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println(Math.pow(3,2));
        System.out.println(Math.sqrt(625));

        System.out.println("Url de la base de données : "+AppConfigurations.DATABASE_URL);
        System.out.println("Utilisateur de la base de données : "+AppConfigurations.DATABASE_USER);

        // Simuler un formulaire
        Scanner input=new Scanner(System.in);

        while (true){
            System.out.print("Email : ");
            var email=input.nextLine();

            System.out.print("Mot de passe : ");
            var motDePasse=input.nextLine();

            if(!Validation.isEmail(email)){
                System.out.println("L'email saisi n'est oas valide");
                continue;
            }

            if(!Validation.minMax(motDePasse,AppConfigurations.MAX_PASSWORD,AppConfigurations.MAX_PASSWORD)){
                System.out.println("Le mot de doit avoir entre 8 et 15 caractères");
            }

            if(Validation.isEmail(email) && Validation.minMax(motDePasse,AppConfigurations.MIN_PASSWORD,AppConfigurations.MAX_PASSWORD)){
                System.out.println("Welcome");
                break;
            }
        }
    }
}
