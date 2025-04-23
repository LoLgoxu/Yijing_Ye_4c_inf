import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> numeri = new ArrayList<Integer>();
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> temp = new ArrayList<Integer>();
        int sum = 0;
        for (int i = 0; i < 5; i++) {
            System.out.println("inserisci il " + (i + 1) + " numero:");
            numeri.add(input.nextInt());
        }

        for (int i = 0; i < numeri.size(); i++) {
            sum = sum + numeri.get(i);
        }

        double media = sum / numeri.size();
        System.out.println("media:" + media);

        for (int i = 0; i < numeri.size(); i++) {
            if (numeri.get(i) < media){
                temp.add(i);
            }
        }

        for (int i = 0; i < temp.size(); i++) {
            System.out.println(temp.get(i));
            numeri.remove(temp.get(i));
        }

        System.out.println(numeri);
    }
}
