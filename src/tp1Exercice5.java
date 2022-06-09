import java.util.Scanner;

public class tp1Exercice5 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("age de l'utilisateur ?");
        int age = sc.nextInt();
        int anneeDeNaissance=2022-age;
        System.out.println ("Vous avez "+age+" ans. Votre annee de naissance est "+anneeDeNaissance+".");
    }
}
