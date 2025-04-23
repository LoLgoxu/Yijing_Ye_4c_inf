package home.yijing.com.main;

import home.yijing.com.algorithms.BubbleSort;
import home.yijing.com.algorithms.LinearSearch;
import home.yijing.com.methos.ArrayFuncs;

import java.util.Random;

/***
 * home.yijing.com.main.Main class
 */
public class Main {

    /***
     * main method(program entrance)
     * @param args
     */
    public static void main(String[] args) {
        Random rand = new Random();

        ArrayFuncs arrayFuncs = new ArrayFuncs();

        int[] array = new int[1000];

        int steps = 0;

        // Random length array and array cells creation
        for (int i = 0; i < array.length; ++i) {

            array[i] = rand.nextInt(10000);
        }
        System.out.println("Array before sort :");
        arrayFuncs.printIntArray(array);

        int target = array[rand.nextInt(999)];

        BubbleSort bubbleSort = new BubbleSort();
        bubbleSort.sort(array);
        System.out.println("\n\nArray after sort :");
        arrayFuncs.printIntArray(array);

        LinearSearch linearSearch = new LinearSearch();
        System.out.println("\n\nThe target is " + target);
        steps = linearSearch.search(array, target);
        System.out.println("\nsteps took = " + steps);
    }
}
