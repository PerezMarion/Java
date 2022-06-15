package BasesJava.Exercices;

import java.util.Scanner;

public class tp4Exercice17 {
    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);
        System.out.println("Entrer un a un 10 nombres entiers (un meme nombre peut etre entre plusieurs fois : ");
        int[] tableau = new int[10];

        for(int i=0;i<=tableau.length-1;i=i+1) {
            System.out.print("Nombre entier numero" + (i + 1) + " : ");
            int nombreAInsere = input.nextInt();
            tableau[i] = nombreAInsere;
        }

        System.out.print("\nEntrer un nombre a rechercher dans le tableau : ");
        int nombreRecherche = input.nextInt();
        int occurence=0;

        for(int i=0;i<= tableau.length-1;i=i+1){
            if(tableau[i]==nombreRecherche){
                occurence=occurence+1;
            }
        }

        if(occurence==0){
            System.out.print("\nLe nombre "+nombreRecherche+" n'existe pas dans le tableau.");
        }else{
            System.out.print("\nLe nombre "+nombreRecherche+" existe dans le tableau et il s'y trouve "+occurence+" fois.");
        }
    }
}
