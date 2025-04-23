import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        boolean scelta;

        Docente[] docenti = new Docente[3];

        Studente[] studenti = new Studente[10];

        Corso[] corsi = new Corso[5];

        for (int i = 0; i < 5; i++) {
            corsi[i] = new Corso();
            System.out.print("inserisci il nome della specializzazione:");
            corsi[i].specializzazione = input.nextLine();
            System.out.print("inserisci l'ID del corso:");
            corsi[i].idCorso = input.nextInt();
        }

        for (int i = 0; i < 3; i++) {
            docenti[i] = new Docente();
            System.out.print("inserisci il nome del docente:");
            docenti[i].nome = input.nextLine();
            System.out.print("inserisci il cognome del docente:");
            docenti[i].cognome = input.nextLine();
            System.out.print("inserisci l'ID del docente:");
            docenti[i].idDocente = input.nextInt();
            System.out.println("quali corsi desidera insegnare?");
            for (int j = 0; j < 5; j++) {
                System.out.println((j + 1) + " " + corsi[j].specializzazione);
                System.out.println("se si prema 1 se no prema 0");
                scelta = input.nextBoolean();
                if (scelta == true) {
                    corsi[j].insegnanteAssegnato = docenti[i].cognome;
                }
            }
        }

        for (int i = 0; i < 10; i++) {
            studenti[i] = new Studente();
            System.out.print("inserisci il nome dello studente:");
            studenti[i].nome = input.nextLine();
            System.out.print("inserisci il cognome dello studente:");
            studenti[i].cognome = input.nextLine();
            System.out.print("inserisci l'ID dello studente:");
            studenti[i].idStudente = input.nextInt();
            for (int j = 0; j < 5; j++) {
                System.out.println("Vuoi partecipare al corso di " + corsi[j].specializzazione + "? se si digita 1 se no 0");
                scelta = input.nextBoolean();
                if (scelta == true) {
                    studenti[i].iscrizione();
                }
            }
        }

    }
}
