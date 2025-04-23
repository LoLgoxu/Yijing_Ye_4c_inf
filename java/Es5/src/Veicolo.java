public class Veicolo {
    String marca;
    String modello;
}

class Moto extends Veicolo {
    int cilindrata;
    void mostraDettagli() {
        System.out.println("la moto e' una " + marca + " " + modello + " di cilindrata pari a " + cilindrata + "cm³");
    }
}

