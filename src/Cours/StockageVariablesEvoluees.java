package Cours;

import java.util.Arrays;
import java.util.Scanner;

public class StockageVariablesEvoluees {
    public static void main(String[] args) {

        // Dans Java, les variables evoluees commence par une majuscule contrairement aux variables simples

        int[] tableauExemple=new int[5];
        System.out.print("Affichage de l'adresse stockee dans le tableau : ");
        System.out.println(tableauExemple);

        System.out.println("Affichage du tableau : "+ Arrays.toString(tableauExemple));

        // Dans un tableau de nombres entiers (int/byte/short...) initialisation des toutes les cellules par O
        // Dans un tableau de nombres decimaux (float/double) initialisation de toutes les cellules par 0.0
        // Dans un tableau de valeurs boolennes, initialisation de toutes les cellules par "false"
        // Dans un tableau de string, initialisation de toutes les cellules par "null"

        int[] nombres=new int[3];
        nombres[0]=12;
        nombres[1]=15;
        nombres[2]=20;
        System.out.println("Affichage du tableau nombres : "+Arrays.toString(nombres));
        int[] nombres2=nombres;
        nombres2[0]=33;
        System.out.println("Affichage du tableau nombres apres creation du nombre 2 : "+Arrays.toString(nombres));

        // Les deux tableaux ont le meme emplacement de stockage (adresse) dans la memoire

        if(nombres==nombres2){
            System.out.println("Les deux tableaux pointent vers un meme tableau");
        }

        // C'est l'emplacement memoire qui est comparee : le si est satisfait
        // Si on creer un troisieme tableau comprenant les memes valeurs mais pas le meme emplacement : le si ne sera pas satisfait

        java.lang.String nom1="Marion";
        java.lang.String nom2="Marion";
        if(nom1==nom2){
            System.out.println("Nom1 pointe vers le meme string que nom2");
        }else {
            System.out.println("Nom1 ne pointe pas vers le meme string que nom2");
        }
         // La aussi c'est l'emplacement memoire qui est comparee
         // Automatiquement, comme la valeur du string est la meme, le programme utilise le meme emplacement de stockage dans la memoire
         // Stockage automatique dans le pool des litteraux : le si est satisfait

        Scanner input=new Scanner(System.in);
            System.out.println("Entrer un nom : ");
            java.lang.String nom3=input.nextLine();
            if(nom1==nom3){
                System.out.println("Nom1 pointe vers le meme string que nom3");
            }else {
                System.out.println("Nom1 ne pointe pas vers le meme string que nom3");
            }
        // Encore une fois c'est l'emplacement memoire qui est comparee
        // Il n'y a pas d'emplacement optimise pour les donnees saisies a partir du clavier
        // Pas de stockage automatique dans le pool des litteraux : le si n'est pas satisfait

            if(nom1.equals(nom3)){
                System.out.println("Nom1 contient le meme string que nom3");
            }else{
                System.out.println("Nom1 ne contient pas le meme string que nom3");
            }
        //Ici c'est les valeurs stockees par les deux strings qui sont comparees
        //Methode a utiliser plutot que if(...=...)

            nom3=nom3.intern();
            if(nom1==nom3){
                System.out.println("Nom1 pointe vers le meme string que nom3");
            }else {
                System.out.println("Nom1 ne pointe pas vers le meme string que nom3");
            }
        // On peut manuellement entrainer le stockage dans le pool de litteraux : le si est maintenant satisfait
        // Cette manipulation fonctionne avec les strings mais pas les tableaux
    }
}