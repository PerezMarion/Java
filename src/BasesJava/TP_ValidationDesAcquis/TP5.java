package BasesJava.TP_ValidationDesAcquis;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class TP5 {

    // Écrire un programme Java qui demande à l’utilisateur d’entrer une phrase à partir du clavier.
    // Ensuite, le programme va retirer tous les doublons de la phrase, puis à la fin le programme va afficher:
    // La chaîne de départ fournie par l’utilisateur
    // La chaîne après suppression des doublons
    // Une liste contenant tous les doublons et le nombre de fois qu'ils figuraient dans l’ancienne chaîne

    public static void main(String[] args) {

        // Partie 1 - remove duplicate characters

        Scanner input = new Scanner(System.in);

        String userInput;
        char letter;
        HashSet<Character> hashSetChar = new HashSet<>();
        HashMap<Character, Integer> hashMapDuplicates = new HashMap<>();


        System.out.printf("Enter sentence: ");
        userInput = input.nextLine();
        String copyOfUserInput = userInput;

        for (int i = 0; i < userInput.length(); i++) {
            letter = userInput.charAt(i);

            if (hashSetChar.contains(letter)){

                int currentValueHM = ( hashMapDuplicates.get(letter)==null ? 1 : hashMapDuplicates.get(letter) );
                hashMapDuplicates.put(letter, currentValueHM + 1);
                copyOfUserInput = copyOfUserInput.replaceAll(String.valueOf(letter), "");
            }
            hashSetChar.add(letter);
        }
        System.out.printf("Original sentence: [%s]\n", userInput);
        System.out.printf("Sentence after removal of duplicates: [%s]\n", copyOfUserInput);
        System.out.printf("List of duplicate values: [%s]\n", hashMapDuplicates);

        // Partie 2 - remove duplicate words

        String[] wordArray = userInput.split(" ");
        String duplicates = "";
        String sentenceWithoutDuplicates = "";

        for (int i = 0; i < wordArray.length; i++) {
            String word = wordArray[i];

            if (sentenceWithoutDuplicates.contains(word)){
                duplicates += " " + word;
            } else {
                sentenceWithoutDuplicates += " " + word;
            }
        }

        sentenceWithoutDuplicates = sentenceWithoutDuplicates.trim();
        duplicates = duplicates.trim();

        System.out.printf("Initial sentence: %s\n", userInput);
        System.out.printf("List of duplicates: %s\n", duplicates);
        System.out.printf("Sentence without duplicates: %s\n", sentenceWithoutDuplicates);
    }
}