public class Affichage {
    public static void main(String[] args) {

        String nom="Perez";
        String prenom="Marion";
        char genre='F';
        byte age=25;
        float taille=1.65f;
        boolean estMarie=true;

        System.out.println("Vous vous appelez "+nom+" "+prenom+", vous avez "+age+" ans et vous mesurez "+taille+" metre.");
        System.out.printf("Vous vous appelez %s %s,vous avez %d ans et vous mesurez %.2f metre.\n",nom,prenom,age,taille);
        System.out.printf("Nom : %s\nPrenom : %s\nAge : %d\n",nom,prenom,age);

    //Avec operateur ternaire
        System.out.printf("Vous vous appelez %s %s,vous avez %d ans et vous %s\n",nom,prenom,age,estMarie?"etes marie.":"n'etes pas marie.");

    //Sans operateur ternaire
        String etatMaritalAAfficher=estMarie?"etes marie.":"n'etes pas marie.";
        System.out.printf("Vous vous appelez %s %s,vous avez %d ans et vous %s\n",nom,prenom,age,etatMaritalAAfficher);
    }
}
