package BasesJava.TP_ValidationDesAcquis;

import java.util.Arrays;
import java.util.Scanner;

public class TP1 {

    // Écrire un programme Java permet de déclarer un tableau d'entiers en Java, et qui ensuite va afficher
    // le plus grand nombre, sa position, le plus petit nombre et sa position.
    // Dans l'affichage, il faut afficher le tableau en format [element1, element2,...,elementN],
    // a cote du plus grand nombre faire afficher le text(PG) et pour le plus petit(PP).

    public class Main {
        public static void main(String[] args) {

            int arrayLength;
            int min = 0;
            int minPosition = 0;
            int max = 0;
            int maxPosition = 0;

            Scanner input = new Scanner(System.in);
            // (note that no check for negative ints)
            System.out.printf("Array length: ");
            arrayLength = input.nextInt();
            int[] array = new int[arrayLength];

            for (int i = 0; i < array.length; i++) {
                System.out.printf("Value of index %d: ", i);
                int userInput = input.nextInt();
                array[i] = userInput;
                if (i == 0){
                    min = userInput;
                    max = userInput;
                } else {
                    min = Math.min(min, userInput);
                    max = Math.max(max, userInput);
                }
            }

            String[] resultArray = new String[arrayLength];

            for (int i = 0; i < array.length; i++) {
                resultArray[i] = String.valueOf(array[i]);
                if (array[i] == min){
                    minPosition = i;
                    resultArray[i] = String.valueOf(array[i]) + " (PP)";
                }
                if (array[i] == max){
                    maxPosition = i;
                    resultArray[i] =  String.valueOf(array[i]) + " (PG)";
                }
            }

            System.out.printf("The minimum found is %d at position %s\n", min, minPosition);
            System.out.printf("The minimum found is %d at position %s\n", max, maxPosition);
            System.out.println(Arrays.toString(resultArray));
        }
    }
}