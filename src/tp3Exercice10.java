import java.util.Scanner;

public class tp3Exercice10 {
    public static void main(String[] args) {

        System.out.println("Tables de multiplication");

        for(int i=2;i<=10;i=i+1) {
            System.out.printf("\nTable de "+i+" :\n\n");

            for(int j=1;j<=10;j=j+1) {
                System.out.printf("%d x %d = %d\n",j,i,(i * j));
            }
        }
    }
}
