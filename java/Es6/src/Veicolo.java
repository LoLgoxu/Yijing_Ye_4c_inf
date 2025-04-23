public class Veicolo {
    String marca;
    String modello;
    int anno;
    double prezzoNoleggioGiornaliero;
    double costoTotale;

    public Veicolo(String marca, String modello, int anno, double prezzoNoleggioGiornaliero) {
        this.marca = marca;
        this.modello = modello;
        this.anno = anno;
        this.prezzoNoleggioGiornaliero = prezzoNoleggioGiornaliero;
    }

    void calcolaCostoNoleggio(int giorni) {
        costoTotale = giorni * prezzoNoleggioGiornaliero;
    }
    void mostraDettagli() {
        System.out.println(marca + " " + modello + " " + anno);
    }
}

class Auto extends Veicolo {
    int numeroPosti;
    boolean cambioAutomatico;

    public Auto(String marca, String modello, int anno, double prezzoNoleggioGiornaliero, int numeroPosti, boolean cambioAutomatico){
        super(marca, modello, anno, prezzoNoleggioGiornaliero);
        this.numeroPosti = numeroPosti;
        this.cambioAutomatico = cambioAutomatico;
    }

    @Override
    void calcolaCostoNoleggio(int giorni) {
        super.calcolaCostoNoleggio(giorni);
        if (cambioAutomatico){
            costoTotale = costoTotale + (costoTotale * 0.1);
        }
        System.out.println(costoTotale+" euro");
    }
}

class Moto extends Veicolo {
    int cilindrata;

    public Moto(String marca, String modello, int anno, double prezzoNoleggioGiornaliero, int cilindrata){
        super(marca, modello, anno, prezzoNoleggioGiornaliero);
        this.cilindrata = cilindrata;
    }

    @Override
    void calcolaCostoNoleggio(int giorni) {
        super.calcolaCostoNoleggio(giorni);
        if (cilindrata > 600){
            costoTotale = costoTotale + (costoTotale * 0.15);
        }
        System.out.println(costoTotale+" euro");
    }
}

class Camion extends Veicolo {
    double capacitaCarico;
    boolean rimorchio;

    public Camion(String marca, String modello, int anno, double prezzoNoleggioGiornaliero, double capacitaCarico, boolean rimorchio){
        super(marca, modello, anno, prezzoNoleggioGiornaliero);
        this.capacitaCarico = capacitaCarico;
        this.rimorchio = rimorchio;
    }

    @Override
    void calcolaCostoNoleggio(int giorni) {
        super.calcolaCostoNoleggio(giorni);
        if (rimorchio){
            costoTotale = costoTotale + 50;
        }
        System.out.println(costoTotale+" euro");
    }
}
