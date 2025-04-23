package home.yijing.com.methos;

/***
 * Array functions for java implementations
 */
public class ArrayFuncs {

    /***
     * contructor
     */
    public ArrayFuncs() {

    }

    /***
     *
     * @param array
     */
    public void printIntArray(int[] array) {

        int counter = 0;

        for (int i = 0; i < array.length; ++i){

            ++counter;
            System.out.print( array[i] + " ");
            if (counter == 19) {
                System.out.println();
                counter = 0;
            }
        }
    }
}
