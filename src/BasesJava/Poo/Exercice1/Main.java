package BasesJava.Poo.Exercice1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Personne Marion=new Personne();
        // Scanner input = new Scanner(System.in);

        // System.out.println("Veuillez completer le formulaire suivant : ");
        //System.out.print("Prenom : ");
        // Marion.setFirstName(input.nextLine());
        //System.out.print("Nom : ");
        // Marion.setLastName(input.nextLine());
        // System.out.print("Pays : ");
        // Marion.setPays(input.nextLine());
        // System.out.print("Marie(e) (oui/non) : ");
        // String marieQuestion= input.nextLine();
           // if(marieQuestion.equals("oui")){
             //   Marion.setMarried(true);
           // }else{
             //   Marion.setMarried(false);}
        // System.out.print("Nombre d'enfant(s) : ");
        // Marion.setNombreEnfants(input.nextByte());

        // System.out.println("Vous vous appellez "+Marion.nomComplet()+".");
        // System.out.println("Vous venez de "+Marion.getPays()+".");
        // System.out.println("Vous "+(Marion.isMarried()?"etes marie(e).":"n'etes pas marie(e)."));
        // System.out.println("Vous avez "+Marion.getNombreEnfants()+" enfant(s).");


        // Après ajoute du constructeur

        Scanner input=new Scanner(System.in);

        Personne Marion=new Personne("Marion","Perez","France",true,(byte)0);

        System.out.println("Veuillez completer le formulaire suivant : ");
        System.out.print("Prenom : ");
        Marion.setFirstName(input.nextLine());
        System.out.print("Nom : ");
        Marion.setLastName(input.nextLine());
        System.out.print("Pays : ");
        Marion.setPays(input.nextLine());
        System.out.print("Marie(e) (oui/non) : ");
        String marieQuestion= input.nextLine();
        if(marieQuestion.equals("oui")){
           Marion.setMarried(true);
        }else{
           Marion.setMarried(false);}
        System.out.print("Nombre d'enfant(s) : ");
        Marion.setNombreEnfants(input.nextByte());

        System.out.println("Vous vous appellez "+Marion.nomComplet()+".");
        System.out.println("Vous venez de "+Marion.getPays()+".");
        System.out.println("Vous "+(Marion.isMarried()?"etes marie(e).":"n'etes pas marie(e)."));
        System.out.println("Vous avez "+Marion.getNombreEnfants()+" enfant(s).");
    }
}