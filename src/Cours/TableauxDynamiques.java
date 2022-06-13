package Cours;

import java.util.ArrayList;
import java.util.Arrays;

public class TableauxDynamiques {
    public static void main(String[] args) {

        ArrayList<Integer> notes=new ArrayList<>();
        // Les tableaux dynamiques ne peuvent contenir que des variables de type evoluees int => Integer

        ArrayList<String> langagesDeProgrammation=new ArrayList<>();
        System.out.println("Taille du tableau : "+langagesDeProgrammation.size());
        // Contrairement au tableau de taille fixe, les cellules ne sont pas automatiquement pre-remplis de 0
        // C'est la taille du tableau qui est egale a zero

        // L'ajout se fait toujours a la fin
        langagesDeProgrammation.add("Java");
        langagesDeProgrammation.add("Python");
        langagesDeProgrammation.add("C++");

        System.out.println("Taille du tableau : "+langagesDeProgrammation.size());
        // La taille du tableau est maintenant egale a trois

        System.out.printf("\nLangage de programmation %d : %s\n",0,langagesDeProgrammation.get(0));

        System.out.print("\nTableau avant suppression : "+langagesDeProgrammation);

        langagesDeProgrammation.remove(1);
        System.out.print("\n\nTableau apres suppression : "+langagesDeProgrammation);

        // Attention a la  suppression car tous les index qui suivent sont reassignes
        System.out.printf("\n\nLangage de programmation %d : %s",1,langagesDeProgrammation.get(1));

        // Renommer Java en Javascript
        langagesDeProgrammation.set(0,"Javascript");
        System.out.print("\n\nTableau apres renommage : "+langagesDeProgrammation+"\n\n");

        // Parcourir le tableau
                for(int i=0;i<langagesDeProgrammation.size();i=i+1){
                    System.out.printf("Element [%d] : %s\n",i,langagesDeProgrammation.get(i));
                }

        // Tester si le tableau est vide
        if(langagesDeProgrammation.isEmpty()){
            System.out.println("\nLe tableau est vide.");
        }else{
            System.out.println("\nLe tableau n'est pas vide.");
        }

        // Vider le tableau
        langagesDeProgrammation.clear();
        if(langagesDeProgrammation.isEmpty()){
            System.out.println("\nLe tableau est vide.");
        }else{
            System.out.println("\nLe tableau n'est pas vide.");
        }
    }
}
