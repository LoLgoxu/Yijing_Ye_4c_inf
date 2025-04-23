public class Matematica {
    static final double PI_GRECO = 3.141592653589793;

    double raggio;

    void areaCerchio(double raggio) {
        this.raggio = raggio;
        System.out.println("area =" + raggio * 2 * PI_GRECO);
    }
}
