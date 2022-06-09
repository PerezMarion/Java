public class Boolean {
    public static void main(String[] args) {

        // byte age=12;
        // if(age>=18){
        //    System.out.println("Vous etes majeur.");
        // }else{
        //    System.out.println("Vous n'etes pas majeur.");

        byte age=19;
        boolean estMajeur=age>=18;

        if(estMajeur){
            System.out.println("Vous etes majeur.");
        }else{
            System.out.println("Vous n'etes pas majeur.");
        }
    }
}
