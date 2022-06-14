package Exercices;

public class tp5Exercice23 {
    public static void main(String[] args) {

        String [] table = {
        "christian.lisangola@gmail.com",
        "jean.paul@gmail.com",
        "alain@gmail.com",
        "lydie@yahoo.fr",
        "josephine.lajoie@yahoo.com",
        "luise@hotmail.fr",
        "philemon.turion@gmail.com",
        "jules.cesar@hotmail.fr"
        };

        var gmail = 0 ;
        var yahoo = 0;
        var hotmail = 0;
        String adresseMail;

        for (int i = 0; i < table.length; i++) {
            adresseMail = table[i];
            if (adresseMail.contains("gmail")) {
                gmail = gmail + 1;
            } else if (adresseMail.contains("yahoo")) {
                yahoo = yahoo + 1;
            } else if (adresseMail.contains("hotmail")) {
                hotmail = hotmail + 1;
            }
        }

        double gmailPourcentage = (gmail/(double)table.length)*100 ;
        double yahooPourcentage = (yahoo/(double)table.length)*100 ;
        double hotmailPourcentage = (hotmail/(double)table.length)*100 ;

        System.out.println("Le pourcentage d'adresse en gmail est de : "+ gmailPourcentage +" %.");
        System.out.println("Celui de Yahoo est de "+ yahooPourcentage +" %.");
        System.out.println("Celui de Hotmail est de "+ hotmailPourcentage +" %.");
    }
}