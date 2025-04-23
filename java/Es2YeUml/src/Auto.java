import java.util.Random;

public class Auto extends Veicolo{
    Random rand = new Random();

    int numPorte;
    String tipoAuto;
    int numPosti;

    public Auto (double velocitaMassima, int cavalli, int numMarce, String marca, int numCilindri, int numPorte, String tipoAuto, int numPosti) {
        this.velocitaMassima = velocitaMassima;
        this.cavalli = cavalli;
        this.numMarce = numMarce;
        this.marca = marca;
        this.numCilindri = numCilindri;
        this.numPorte = numPorte;
        this.tipoAuto = tipoAuto;
        this.numPosti = numPosti;
    }

    void driifting() {
        if (rand.nextBoolean()){
            System.out.println("drift andata bene, ma fai attenzione");
        } else {
            System.out.println("drift andata male, sei svenuto dall'inpatto dell'airbag");
        }
    }

}
