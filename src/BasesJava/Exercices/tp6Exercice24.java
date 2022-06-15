package BasesJava.Exercices;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class tp6Exercice24 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] numeroJour = new int [7];
        String[] nomJour = new String [7];
        HashMap<Integer,String> relation=new HashMap<>();

        System.out.println("Veuillez remplir le premier tableau avec les numeros des jours de la semaine :");
        for(int i=0; i<numeroJour.length;i=i+1) {
            int numeroJourAInserer=input.nextInt();
            numeroJour[i]=numeroJourAInserer;
        }
        System.out.println("Veuillez remplir le deuxieme tableau avec les noms des jours de la semaine :");
        for(int i=0; i<nomJour.length;i=i+1) {
            String nomJourAInserer=input.next();
            nomJour[i]=nomJourAInserer;
        }

        for(int i=0;i<numeroJour.length;i=i+1){
            relation.put(numeroJour[i],nomJour[i]);
        }

        System.out.print("Veuillez entre le numero du jour que vous souhaitez rechercher : ");
        int numeroJourRecherche = input.nextInt();

        for(Map.Entry<Integer,String> entry:relation.entrySet()) {
            if(entry.getKey()==numeroJourRecherche) {
                System.out.println((entry.getKey() + " = " + entry.getValue()));
            }
        }
    }
}
