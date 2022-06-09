public class tp2Exercice7 {
    public static void main(String[] args) {

        int nombre = -5;
        boolean estPair = (nombre % 2 == 0);
        boolean estPositif =(nombre>0);

        if (nombre == 0) {
            System.out.println("Le nombre est zéro et pair.");
        } else {
            System.out.printf("Le nombre est %s et %s.",estPositif?"positif":"negatif",estPair?"pair":"impair");
        }
    }
}