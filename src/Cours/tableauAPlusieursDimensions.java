package Cours;

import java.util.Arrays;

public class tableauAPlusieursDimensions {
    public static void main(String[] args) {

        int[][] nombres={
                {1,2,6,5},
                {2,4,9},
                {7,3}
        };

        // Affichage sans boucle (mauvaise methode) :
        // Premiere ligne (1er tableau)
            System.out.println("1er tableau\n");
            System.out.println(nombres[0][0]);
            System.out.println(nombres[0][1]);
            System.out.println(nombres[0][2]);
            System.out.println(nombres[0][3]);

        // Deuxieme ligne (2eme tableau)
            System.out.println("\n2eme tableau\n");
            System.out.println(nombres[1][0]);
            System.out.println(nombres[1][1]);
            System.out.println(nombres[1][2]);

        // Troisieme ligne (3ème tableau)
            System.out.println("\n3eme tableau\n");
            System.out.println(nombres[2][0]);
            System.out.println(nombres[2][1]+"\n");

        // Affichage avec boucle :
            for(int i=0;i<nombres.length;i++) {
                System.out.println(Arrays.toString(nombres[i]));
            }
            System.out.println("");

        // ou

            for(int i=0;i<nombres.length;i++){
                for(int j=0;j<nombres[i].length;j++){
                    System.out.println(nombres[i][j]);
                }
            }

    }
}
