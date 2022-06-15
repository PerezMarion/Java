package BasesJava.Poo.Exercice1;

public class Personne {

    private String firstName;
    private String lastName;
    private String pays;
    private boolean married;
    private byte nombreEnfants;

    public Personne(String firstName,String lastName,String pays,Boolean married, Byte nombreEnfants){
    this.firstName=firstName;
    this.lastName=lastName;
    this.pays=pays;
    this.married=married;
    this.nombreEnfants=nombreEnfants;
    }

    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPays() {
        return pays;
    }
    public void setPays(String pays) {
        this.pays = pays;
    }

    public boolean isMarried() {
        return married;
    }
    public void setMarried(boolean married) {
        this.married = married;
    }

    public byte getNombreEnfants() {
        return nombreEnfants;
    }
    public void setNombreEnfants(byte nombreEnfants) {
        this.nombreEnfants = nombreEnfants;
    }

    public String nomComplet() {
        return firstName+" "+lastName;
    }
}