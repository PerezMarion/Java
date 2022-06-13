package Exercices;

public class tp5Exercice23 {
    public static void main(String[] args) {

        String[] emails = {
                "christian.lisangola@gmail.com",
                "jean.paul@gmail.com",
                "alain@gmail.com",
                "lydie@yahoo.fr",
                "josephine.lajoie@yahoo.com",
                "luise@hotmail.fr",
                "philemon.turion@gmail.com",
                "jules.cesar@hotmail.fr"
        };

        for(int i=0;i<emails.length;i=i+1) {
            int position = emails[i].indexOf("@");
            String hebergeur = emails[i].substring(position);

        }
    }
}
