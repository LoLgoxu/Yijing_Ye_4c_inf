import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Studente studenti[] = new Studente[5];

        for (int i = 0; i < 5; i++) {
            studenti[i] = new Studente();
            System.out.println("inserisci il nome e cognome:");
            studenti[i].nome = input.nextLine();
            studenti[i].cognome = input.nextLine();
            System.out.println("inserisci il matricola:");
            studenti[i].matricola = input.nextInt();
            System.out.println("inserisci il voto:");
            studenti[i].voto = input.nextDouble();
        }

        for (int i = 0; i < 5; i++) {
            studenti[i].stampaDati();
        }
    }
}
