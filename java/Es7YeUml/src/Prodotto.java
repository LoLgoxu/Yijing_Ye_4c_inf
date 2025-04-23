import java.util.Random;

public class Prodotto{
    Random rand = new Random();

    double prezzoVendita;
    int barcode = rand.nextInt(999999999);
    String[] tipo = new String[100];
}
