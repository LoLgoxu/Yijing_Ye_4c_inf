public class ContatoreFinal {
    static int contatore = 0;
    int id;

    public ContatoreFinal(final int ID){
        this.id = ID;
        contatore = contatore + 1;
    }

    void stampaDettagli() {
        System.out.println("ID:" + id + "\ncontatore:" + contatore);
    }
}
