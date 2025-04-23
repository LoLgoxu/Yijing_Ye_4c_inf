import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> valori = new ArrayList<Integer>();
        valori.add(42);
        valori.add(15);
        valori.add(8);
        valori.add(23);
        valori.add(4);

        System.out.println(valori);

        Collections.sort(valori);

        System.out.println(valori);
    }
}
