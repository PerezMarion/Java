package BasesJava.Cours;

import java.util.Scanner;

public class TableauTailleFixe {
    public static void main(String[] args) {

        // création d'un tableau de taille 5 et rempli dès l'initialisation du tableau :
        float[] notesPhysique={17.5f,18.25f,19,9,12};

        // création d'un tableau de taille 5 non rempli pour l'instant :
        // float[] notesMaths=new float[5];

        // création par un utilisateur d'un tableau de taille choisie et remplissage :
        Scanner input= new Scanner(System.in);
        System.out.print("Combien de notes voulez vous inserer ? : ");
        int notesAInserer=input.nextInt();
        float[] notesMaths=new float[notesAInserer];

        for(int i=0;i<= notesMaths.length-1;i=i+1) {
            while (true) {
                System.out.printf("Notes[%d] : ", i);
                float valeurAInserer = input.nextFloat();
                if (valeurAInserer >= 0 && valeurAInserer <= 20) {
                    notesMaths[i] = valeurAInserer;
                    break;
                }
                System.out.println("Erreur : veuillez saisir une valeur comprise entre 0 et 20.\n");
            }
        }
        System.out.println("Vous avez bien renseigne toutes les notes.\n");

        // afficher les notes du le premier tableau (mauvaise méthode) :
        System.out.println("Les differentes notes en Physique sont : ");
        System.out.println(notesPhysique[0]);
        System.out.println(notesPhysique[1]);
        System.out.println(notesPhysique[2]);
        System.out.println(notesPhysique[3]);
        System.out.printf(notesPhysique[4]+"\n\n");

        // afficher les notes du premier tableau avec une boucle :
        System.out.println("Les differentes notes en Physique sont : ");
        for(int i=0;i<=notesPhysique.length-1;i=i+1){
            System.out.printf(notesPhysique[i]+" ");
        }

        // calcul de la moyenne des notes :
        float sommeDesNotes=0;

        for(int i=0; i<=notesPhysique.length-1;i=i+1){
            sommeDesNotes=sommeDesNotes+notesPhysique[i];
        }
        float moyenneDesNotes=sommeDesNotes/notesPhysique.length;
        System.out.println("\n\nLa moyenne des notes en Physique est de "+moyenneDesNotes+"/20.");
    }
}