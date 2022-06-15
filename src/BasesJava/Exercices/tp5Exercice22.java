package BasesJava.Exercices;

import java.util.ArrayList;
import java.util.Scanner;

public class tp5Exercice22 {
    public static void main(String[] args) {

        ArrayList<String> langagesDeProgrammation=new ArrayList<>();
        Scanner input = new Scanner(System.in);
        System.out.println("Lister un a un des langages de programmation.\nTaper la touche entree lorsque votre saisie est terminee.\n\n");

        System.out.print("Veuiller entrer un premier langage : ");
        while (true){
            String langageAInserer = input.nextLine();
            if(!langageAInserer.equals("")){
                langagesDeProgrammation.add(langageAInserer);
                System.out.print("Veuillez entrer un autre langage : ");
            }else {
                System.out.println("L'insertion est terminee.\n");
                break;
            }
        }
        System.out.println("Tableau avant suppression : ");
        System.out.println(langagesDeProgrammation+"\n");

        System.out.print("Veillez entrer un a un les langages que vous souhaitez retirer de la liste.\nTaper la touche entree lorsque votre saisie est terminer.\n\n");
        while(true){
            String langageARetirer = input.nextLine();
            if(langagesDeProgrammation.contains(langageARetirer)) {
                langagesDeProgrammation.remove(langageARetirer);
                System.out.println(langageARetirer + " a ete retire de la liste.");
            }else if (langageARetirer.equals("")){
                break;
            }else {
                System.out.println(langageARetirer + " n'est pas dans la liste des langages de programmation.\nReesayer.");
            }
        }
        System.out.println("Tableau apres suppression : ");
        System.out.println(langagesDeProgrammation);
    }
}