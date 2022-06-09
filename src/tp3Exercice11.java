import java.util.Scanner;

public class tp3Exercice11 {
    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);
        System.out.println("Entrer un nombre dont vous voulez calculer la factorielle : ");
        int nombre= input.nextInt();
        int factorielle = 1;

        for (int i=1;i<=nombre;i=i+1)
            factorielle = factorielle*i;
            System.out.println("La factorielle du nombre " +nombre+ " est : " +factorielle);
    }
}
