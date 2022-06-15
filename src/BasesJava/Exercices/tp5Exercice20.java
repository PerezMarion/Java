package BasesJava.Exercices;

import java.util.Scanner;

public class tp5Exercice20 {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        int[][] matrice = new int[4][4];
        int sommeDiagonale = 0;

        for(int i=0;i<matrice.length;i=i+1){
            for(int j=0;j<matrice[i].length;j=j+1){
                System.out.printf("matrice[%d][%d] : ",i,j);
                matrice[i][j]= input.nextInt();
                if(i==j){
                    sommeDiagonale = sommeDiagonale + matrice[i][j];
                }
            }
        }
        System.out.println("La somme de la diagonale matricielle est : "+sommeDiagonale);
    }
}
