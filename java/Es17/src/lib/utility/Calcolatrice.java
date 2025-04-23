package lib.utility;

public class Calcolatrice {
    int a , b;

    public Calcolatrice(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public void addizione () {
        System.out.println(a + b);
    }

    public void sottrazione () {
        System.out.println(a - b);
    }
}
