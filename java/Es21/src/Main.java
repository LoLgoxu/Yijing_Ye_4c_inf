import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double percentuale;

        Impiegato impiegati[] = new Impiegato[5];
        impiegati[0] = new Impiegato("Fabio", "Rovazzi", 2000, "hr");
        impiegati[1] = new Impiegato("Mario", "Mimmo", 1800, "finance");
        impiegati[2] = new Impiegato("Marco", "Aurelio", 1400, "marketing");
        impiegati[3] = new Impiegato("Stefano", "Chicci", 2500, "sviluppo");
        impiegati[4] = new Impiegato("Stephan", "Mend", 3000, "logistica");

        for (int i = 0; i < 5; i++) {
            System.out.println("di quanta percentuale bisogna aumentare lo stipendio di " + impiegati[i].nome + impiegati[i].cognome);
            percentuale = input.nextDouble();
            impiegati[i].incrementaStipendio(percentuale);
            System.out.println("stipendio finale = " + impiegati[i].stipendio);
        }
    }
}
