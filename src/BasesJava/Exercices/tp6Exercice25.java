package BasesJava.Exercices;

public class tp6Exercice25 {

    static boolean isPrefix(String mot,String debutMot){
        if(debutMot.length()>=mot.length()){
            System.out.println("Erreur : le deuxième mot est plus long que le premier !");
            return false;
        }
        if(debutMot.equals(mot.substring(0,debutMot.length()))) {
            return true;
        }
            return false;
    }

    public static void main(String[] args) {

        String mot1 = "thermometre";
        String debutMot1 = "therm";
        boolean testPrefixe1 =isPrefix(mot1,debutMot1);
        System.out.println(testPrefixe1);
    }
}
