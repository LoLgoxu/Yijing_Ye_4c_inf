import java.util.ArrayList;

private class IntegerArrayListOperations {

    static int sum(ArrayList<Integer> list) {
        int result = 0;

        for (int i = 0; i < list.size(); i++) {
            result = result + list.get(i);
        }

        return result;

    }

    /* method for an ArrayList to do the average */
    static double average(ArrayList<Integer> list) {
        int sum = sum(list);
        double result = sum / list.size();

        return result;
    }

    /* remover method for an ArrayList that don't need numbers below the average */
    static void removeBelowAverage(ArrayList<Integer> list, double average) {

        /* Going to remove all the list elements below avarage */
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) < average){
                list.remove(i);
                i--;
            }
        }
    }

    /*public int getResult() {

       return ;
    }

    public int setResult(int result) {

    }*/
}
