import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();

        Scanner input = new Scanner(System.in);

        IntegerArrayListOperations obj = new IntegerArrayListOperations();

        for (int i = 0; i < 5; i++) {
            System.out.println("insert the " + (i + 1) + " number:");
            numbers.add(input.nextInt());
        }

        int sum = IntegerArrayListOperations.sum(numbers);

        System.out.println("sum = " + sum);

        double average = IntegerArrayListOperations.average(numbers);

        System.out.println("average = " + average);

        IntegerArrayListOperations.removeBelowAverage(numbers, average);

        System.out.println(numbers);
    }
}
