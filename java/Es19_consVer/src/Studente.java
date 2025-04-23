public class Studente {
    String nome;
    String cognome;
    int matricola;
    double voto;

    public Studente(String nome, String cognome, int matricola, double voto) {
        this.nome = nome;
        this.cognome = cognome;
        this.matricola = matricola;
        this.voto = voto;
    }

    public void stampaDati() {
        System.out.println("nome:" + nome + "\ncognome" + cognome + "\nmatricola:" + matricola + "\nvoto" + voto + "\n");
    }
}
