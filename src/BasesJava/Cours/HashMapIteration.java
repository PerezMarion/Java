package BasesJava.Cours;

import java.util.HashMap;
import java.util.Map;

public class HashMapIteration {
    public static void main(String[] args) {

        HashMap<String,String> identite=new HashMap<>();
        identite.put("nom","Marion");
        identite.put("prenom","Perez");
        identite.put("pays","France");

        // A ne pas retenir mais a savoir rechercher
        for(Map.Entry<String,String> maVariable:identite.entrySet()){
            System.out.println((maVariable.getKey()+" = "+maVariable.getValue()));
        }

        int[] nombres={1,2,3,4,5,6,7,8,9,10};
        // Bouche forEach
        for(int nombre:nombres){
            System.out.println(nombre);
        }
    }
}
