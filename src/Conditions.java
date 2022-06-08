public class Conditions {
    public static void main(String[] args) {
        // declaration de la variable age
        byte age=31;

        // test  condition
        // si age >=18 alors
        // afficher "vous etes majeur donc vous pouvez participer"
        // fin si
        // sinon
        // afficher "vous etes mineur, vous ne pouvez pas participer"
        // fin si

        if(age>=18){
            System.out.println("vous etes majeur donc vous pouvez participer");
        }else{
            System.out.println("vous etes mineur, vous ne pouvez pas participer");
        }

        String pays="Chine";
        if(pays=="France"){
            System.out.println("Bonjour");
        }else if(pays=="Allemagne"){
            System.out.println("Guten Tag");
        }else if(pays=="Espagne"){
            System.out.println("Holla");
        }else if(pays=="Chine"){
            System.out.println("Ninhau");
        }else{
            System.out.println("Le pays fourni n'est pas supporte");
        }
}
}

