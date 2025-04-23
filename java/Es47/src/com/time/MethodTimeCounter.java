package com.time;

public class MethodTimeCounter {

    /***
     * contructor
     */
    public MethodTimeCounter() {

    }

    /***
     *
     * @return startTimer ms
     */
    public long startTimer() {
        return System.currentTimeMillis();
    }

    /***
     *
     * @param start
     */
    public void endTimer(long start) {
        long end = System.currentTimeMillis();
        System.out.println("Doing the search used " +
                (end - start) + "ms");
    }
}
