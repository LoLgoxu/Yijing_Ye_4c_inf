import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        try {
            // Chiede all'utente di inserire quanti numeri vuole ordinare
            System.out.print("Quanti numeri vuoi inserire? ");
            int n = input.nextInt(); // Converte la stringa in un numero

            // Inizializza un array per memorizzare i numeri inseriti
            int[] numeri = new int[n];

            // Richiede all'utente di inserire i numeri
            System.out.println("Inserisci " + n + " numeri:");
            for (int i = 0; i < n; i++) {
                numeri[i] = input.nextInt(); // Converte la stringa in un numero
            }

            // Ordina l'array in ordine crescente
            Arrays.sort(numeri);

            // Stampa i numeri ordinati
            System.out.println("Numeri ordinati in ordine crescente:");
            for (int numero : numeri) {
                System.out.println(numero);
            }
        } catch (NumberFormatException e) {
            System.out.println("Input non valido");
        }
    }
}
