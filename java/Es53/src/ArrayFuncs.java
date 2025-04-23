import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ArrayFuncs {
    private Random rand = new Random();
    private Scanner scanner = new Scanner(System.in);

    private int[] array;

    public ArrayFuncs() {
        array = new int[rand.nextInt(50)];
    }

    public void create() {
        try {
            String input; // creo una stringa usata per input
            for (int i = 0; i < array.length; ++i) { // cicla 50 volte
                System.out.println("insirisci il " + i + " numero : ");
                input = scanner.nextLine(); // Ottiene l'input come stringa
                array[i] = Integer.parseInt(input); // Converte la stringa in un numero
            }
        } catch (NumberFormatException e) { // se input non e' intero cioe' alla linea 21 non riesce a fare il parseInt della stringa e' un'eccezione di formato
            System.out.println("Invalid input");
            System.exit(0);
        }
    }

    public void sortAndPrint() {
        Arrays.sort(array);
        for (int i = 0; i < array.length; ++i) {
            System.out.println(i +  " numero " + array[i]);
        }
    }

}
