package BasesJava.Poo.Exercice2;

public class Main {
    public static void main(String[] args) {

        Patient patient1= new Patient();

        Patient patient2=new Patient();

        patient2.setNom("Dupont");
        patient2.setPrenom("Antoine");
        patient2.setAge((byte)25);
        patient2.setPoids(84);
        patient2.setTaille(1.75f);

        Patient patient3=new Patient("Pan","Peter",(byte)12,48f,1.41f);

        System.out.println(patient1);
        System.out.println(patient2);
        System.out.println(patient3);
    }
}