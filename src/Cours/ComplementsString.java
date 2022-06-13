package Cours;

public class ComplementsString {
    public static void main(String[] args) {

        String nom="Marion";

        // Acceder au caractere passe en argument a la position souhaite
            System.out.println(nom.charAt(2));

        // Parcourir un string caractère par caractère
            for(int i=0;i<nom.length();i++){
                System.out.println(nom.charAt(i));
            }
        // Retourner la premiere occurence de l'index du caractere passe en argument
            System.out.println(nom.indexOf('r'));

        // Remplacer des caracteres
            String nom2="abracadabra";
            System.out.println(nom2.replace('a','*'));

        // Extraire une sous-chaine
            String chaine="Marion Perez";
            String chaine2=chaine.substring(3,6);
            System.out.println(chaine2);
    }
}
