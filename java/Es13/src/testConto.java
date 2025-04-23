import java.util.Scanner;

public class testConto {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double sal = 0, fid = 0;

        Conto c1 = new Conto(sal, fid);

        Conto.stampaMenu();
        while(true) {

            System.out.print("Inserisci:");
            int scelta = input.nextInt();

            if (scelta == 1) {
                c1.getSaldo();
                c1.getFido();

            } else if (scelta == 2) {
                c1.stampaSaldo();

            } else if (scelta == 3) {
                c1.disponibility();

            } else if (scelta == 4) {
                c1.preleva();

            } else if (scelta == 5) {
                c1.deposita();

            } else if (scelta == 6) {
                Conto.stampaMenu();

            } else if (scelta == 9) {
                System.exit(0);

            } else {
                System.out.println("il numero inserito non e' tra le scelte\n");

            }
            System.out.println();
        }
    }
}
