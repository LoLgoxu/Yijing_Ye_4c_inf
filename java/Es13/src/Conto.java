import java.util.Scanner;

public class Conto {
    Scanner input = new Scanner(System.in);

    double saldo, fido;

    public Conto(double saldo, double fido) {
        this.saldo = saldo;
        this.fido = fido;
    }

    static void stampaMenu() {
        System.out.println(
                        "1 - creazione conto corrente (istanzia il conto)\n" +
                        "2 - visualizzazione saldo attuale\n" +
                        "3 - visualizza disponibilità\n" +
                        "4 - prelievo\n" +
                        "5 - deposito\n" +
                        "9 - esci\n");
    }

    void getSaldo() {
        System.out.print("Inserisci il tuo saldo:");
        saldo = input.nextDouble();
    }

    void getFido() {
        System.out.print("Inserisci il tuo fido:");
        fido = input.nextDouble();
    }

    void stampaSaldo() {
        System.out.println("Saldo:" + saldo + "$");
    }

    void disponibility() {
        System.out.println("Cifra massima prelevabile:" + (saldo + fido) + "$");
    }

    void preleva() {
        System.out.print("Inserisci la cifra che vuoi prelevare:");
        double prelievo = input.nextDouble();
        if (prelievo > (saldo + fido)) {
            System.out.println("hai supera il CAP prelievo non effettuabile.");
        } else if (prelievo > saldo) {
            fido = (saldo + fido ) - prelievo;
        } else if (prelievo <= saldo) {
            saldo = saldo - prelievo;
        }
    }

    void deposita() {
        System.out.print("Inserisci la cifra che vuoi depositare:");
        double deposito = input.nextDouble();
        saldo = saldo + deposito;
    }
}

