public class Impiegato {
    String nome;
    String cognome;
    double stipendio;
    String dipartimento;

    public Impiegato(String nome, String cognome, double stipendio, String dipartimento) {
        this.nome = nome;
        this.cognome = cognome;
        this.stipendio = stipendio;
        this.dipartimento = dipartimento;
    }

    void incrementaStipendio(double percentuale) {
        stipendio = stipendio + stipendio * (percentuale / 100);
    }
}
