package Exercices;

import java.util.Scanner;

public class tp5Exercice21 {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        int[][] matrice = new int[4][4];
        int sommeDiagonale1 = 0;
        int sommeDiagonale2 = 0;

        for(int i=0;i<matrice.length;i=i+1){
            for(int j=0;j<matrice[i].length;j=j+1){
                System.out.printf("matrice[%d][%d] : ",i,j);
                matrice[i][j]= input.nextInt();
                if(i==j){
                    sommeDiagonale1 = sommeDiagonale1 + matrice[i][j];
                }if((i+j)==(matrice.length-1)){
                    sommeDiagonale2 = sommeDiagonale2 + matrice[i][j];
                }
            }
        }
        System.out.println("La somme des deux diagonales matricielles est : "+(sommeDiagonale1+sommeDiagonale2));
    }
}
