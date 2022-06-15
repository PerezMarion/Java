package BasesJava.Cours;

public class DoWhile {
    public static void main(String[] args) {
        int age=23;

        // while(age<18){
        // On ne va jamais entrer dans la boucle dans ce cas car la condition initiale n'est pas satisfaite.
        // System.out.print("...")

        do{
            System.out.println("...");
        }while(age<18);

        // Ici la boucle va toujours s'exécuter au moins une fois même si la condition initiale n'est pas satisfaite.
    }
}
