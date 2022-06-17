package BasesJava.TP_ValidationDesAcquis;

import java.util.Scanner;

public class TP2 {

    // Ecrire un programme Java demande a l'utilisateur de saisir un nombre et qui ensuite
    // affiche un nombre inverse

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double number;
        System.out.print("Your number (int): ");
        number = input.nextInt();

        boolean isNegative = number<0;

        String stringToReverse = String.valueOf((int) Math.abs(number));
        String reversedString = "";

        for (int i = 0; i < stringToReverse.length(); i++) {
            reversedString = stringToReverse.charAt(i) + reversedString;
        }

        if (isNegative){
            System.out.println(-Integer.valueOf(reversedString));
        } else {
            System.out.println(Integer.valueOf(reversedString));
        }
    }
}