import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] array = new int[50];

        Random rand = new Random();

        for (int i = 0; i < array.length; ++i) {
            array[i] = rand.nextInt(100);
        }
        Arrays.sort(array);

        BinarySearch binary = new BinarySearch();

        System.out.println("indice = " + binary.search(array, rand.nextInt(100)));

    }

}
