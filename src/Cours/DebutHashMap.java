package Cours;

public class DebutHashMap {
    public static void main(String[] args) {

        // Creer une carte pour accelerer le temps de recherche :

        String phrase = "je suis dans une joie immense";

        // La clé est un caractere et les valeurs correspondantes sont des entiers
        java.util.HashMap<Character,Integer> occurenceLettres=new java.util.HashMap<>();

        System.out.println(occurenceLettres);
        // La carte est vide

        // Ajout de donnees en respectant "l'organisation" de la carte (charactere et entier)
         for(int i=0;i<phrase.length();i=i+1){
             char key=phrase.charAt(i);
             if(occurenceLettres.containsKey(key)){
                 int previousValue=occurenceLettres.get(key);
                 occurenceLettres.replace(key,previousValue+1);
             }else{
                 occurenceLettres.put(key,1);
             }
         }
        System.out.println(occurenceLettres);
    }
}