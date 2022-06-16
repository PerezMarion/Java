package BasesJava.Poo.CoursHeredite;

public class Main {
    public static void main(String[] args) {

        Guerrier guerrier1=new Guerrier("Spartacus",80,"Lance");

        Sorcier sorcier1=new Sorcier("Merlin",900,"Ivoire","Bois d'olivier");

        Voleur voleur1=new Voleur("Chipeur",15,"Griffes");

        Magicien magicien1=new Magicien("Oz",300,"Metal et emeraudes");

        guerrier1.rencontrer();
        sorcier1.rencontrer();
        voleur1.rencontrer();
        magicien1.rencontrer();
    }
}