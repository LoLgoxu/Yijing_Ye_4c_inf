import java.util.Random;

public class Moto extends Veicolo{
    Random rand = new Random();

    String tipoMoto;

    public Moto (double velocitaMassima, int cavalli, int numMarce, String marca, int numCilindri, String tipoMoto) {
        this.velocitaMassima = velocitaMassima;
        this.cavalli = cavalli;
        this.numMarce = numMarce;
        this.marca = marca;
        this.numCilindri = numCilindri;
        this.tipoMoto = tipoMoto;
    }

    void impennata() {
        if (rand.nextBoolean()){
            System.out.println("inpennata andata bene, ma fai attenzione");
        } else {
            System.out.println("inpennata andata male, stai in ospedale");
        }

    }
}
