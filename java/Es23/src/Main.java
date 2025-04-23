import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> numeri = new ArrayList<Integer>();
        ArrayList<Integer> numeriPari = new ArrayList<Integer>();
        ArrayList<Integer> numeriDispari = new ArrayList<Integer>();

        Scanner input = new Scanner(System.in);

        for(int i = 0; i < 10; i++) {
            System.out.println("inserisci il " + (i + 1) + " numero:");
            numeri.add(input.nextInt());
            if (numeri.get(i) % 2 == 0){
                numeriPari.add(numeri.get(i));
            } else if (numeri.get(i) % 2 != 0){
                numeriDispari.add(numeri.get(i));
            } else {
                System.out.println("Errore");
            }
        }

        System.out.println("numeri pari:" + numeriPari);
        System.out.println("numeri dispari" + numeriDispari);

    }
}
