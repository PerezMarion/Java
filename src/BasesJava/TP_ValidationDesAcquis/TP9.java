package BasesJava.TP_ValidationDesAcquis;

public class TP9 {

    // Recherche de caractères identiques dans une rangée
    // On vous donne une chaîne de caractères d'un seul mot comme argument.
    // Vous retournerez true si elle contient deux caractères identiques dans une rangée
    // C’est-à-dire qui se suivent, sinon elle retournera false.

    public static void main(String[] args) {
        System.out.println(hasDoubles("terrific"));
        System.out.println(hasDoubles("chats"));
        System.out.println(hasDoubles("chats !!"));
    }
    public static boolean hasDoubles(String str) {

        char letter;
        boolean result = false;
        for (int i = 1; i < str.length(); i++) {
            letter = str.charAt(i);
            if (letter == str.charAt(i - 1)) {
                result = true;
            }
        }
        return result;
    }
}