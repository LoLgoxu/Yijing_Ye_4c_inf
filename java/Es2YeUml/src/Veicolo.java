import java.util.Scanner;

public abstract class Veicolo {
    Scanner input = new Scanner(System.in);

    double velocitaMassima;
    int cavalli;
    int numMarce;
    String marca;
    int numCilindri;
    int marcia = 0;
    boolean statoMotore;

    void getVelocitaMassima() {
        System.out.println(velocitaMassima + "km/h");
    }

    void getCavalli() {
        System.out.println(cavalli + "CV");
    }

    void getNumMarce() {
        System.out.println(numMarce + " marce");
    }

    void getMarca() {
        System.out.println(marca);
    }

    void getNumCilindri() {
        System.out.println(numCilindri + " cilindri");
    }

    void avviaMotore() {
        System.out.println("motore avviato");
        statoMotore = true;
    }

    void cambiaMarcia(int marcia){
        if (statoMotore){
            System.out.println("se vuoi aumentare digitare true se vuoi diminuire digitare false: ");
            boolean choice = input.nextBoolean();

            if (choice){
                marcia++;
            } else if (choice == false){
                marcia--;
            }
        }else {
            System.out.println("il motore e' spento");
        }
    }

    void spegniMotore() {
        System.out.println("motore spento");
        statoMotore = false;
    }
}
