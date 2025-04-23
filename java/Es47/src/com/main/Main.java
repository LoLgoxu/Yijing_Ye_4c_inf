package com.main;

import com.algorithms.BinarySearch;
import com.algorithms.BubbleSort;
import com.algorithms.LinearSearch;
import com.methos.ArrayFuncs;
import com.time.MethodTimeCounter;

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

        int[] array = new int[100];

        int position = 0, steps = 0;

        // Random length array and array cells creation
        for (int i = 0; i < array.length; ++i) {

            array[i] = rand.nextInt(1000);
        }
        System.out.println("Array before sort :");
        arrayFuncs.printIntArray(array);

        int target = array[rand.nextInt(99)];

        BubbleSort bubbleSort = new BubbleSort();
        bubbleSort.sort(array);
        System.out.println("\n\nArray after sort :");
        arrayFuncs.printIntArray(array);

        MethodTimeCounter binary = new MethodTimeCounter();
        long start = binary.startTimer();
        System.out.println("\nBinary Search : ");
        BinarySearch binarySearch = new BinarySearch();
        System.out.println("The target is " + target);
        position = binarySearch.search(array, target);
        System.out.println("position = " + position);
        binary.endTimer(start);

        MethodTimeCounter linear = new MethodTimeCounter();
        long start2 = linear.startTimer();
        System.out.println("\nLinear Search : ");
        LinearSearch linearSearch = new LinearSearch();
        System.out.println("The target is " + target);
        steps = linearSearch.search(array, target);
        System.out.println("steps took = " + steps);
        linear.endTimer(start2);
    }
}
