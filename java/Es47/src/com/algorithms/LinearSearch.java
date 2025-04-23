package com.algorithms;

/***
 * A class that implements the Linear searching method algorithm
 */
public class LinearSearch {

    /***
     * contructor
     */
    public LinearSearch() {

    }

    /***
     * method to see the steps that need to take to the target cell
     * @param array
     * @param target
     * @return
     */
    public int search(int[] array, int target) {

        // for (int i = 0; i < 100000000; i++);
        for (int steps = 0; steps < array.length; ++steps) {

            // if statement to see if the cell of the iteration is the target
            if (array[steps] == target) {

                // returning the steps needed
                return steps + 1;
            }
        }

        // return an error int
        return -1;
    }
}
