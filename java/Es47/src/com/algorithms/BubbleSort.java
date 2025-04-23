package com.algorithms;

/***
 *
 */
public class BubbleSort {

    /***
     * contructor
     */
    public BubbleSort() {

    }

    /***
     * BubbleSort Algorithm implementation method
     * @param array
     */
    public void sort(int[] array) {

        int temp = 0;

        boolean swap = true;

        int range = array.length - 1;

        // while(true) cycle
        while (swap) {

            swap = false;

            for (int i = 0; i < range; ++i) {

                if (array[i] > array[i + 1]) {

                    temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;

                    swap = true;
                }
            }

            range--;
        }
    }
}
