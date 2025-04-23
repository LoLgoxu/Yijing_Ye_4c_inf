package com.algorithms;

/***
 * A class that implements the Binary searching method algorithm
 */
public class BinarySearch {

    /***
     * contructor
     */
    public BinarySearch() {

    }

    /***
     *
     * @param array
     * @param target
     * @return
     */
    public int search(int[] array, int target) {

            int left = 0, right = array.length - 1, i;

            for (i = 0; left <= right; ++i) {
                int mid = left + (right - left) / 2;

                if (array[mid] == target) {
                    System.out.println("steps used = " + i + 1);
                    return mid;
                }
                if (array[mid] < target) {

                    left = mid + 1;
                } else {

                    right = mid - 1;
                }
            }
            System.out.println("division did = " + i + 1);
            return -1;
    }
}
