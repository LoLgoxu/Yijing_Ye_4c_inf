public class ContoBancario {
    private double saldo;
    public void deposito(double dep) {
        saldo = dep;
    }
    public void prelievo(double pre) {
        saldo = saldo - pre;
    }
    public void getSaldo() {
        System.out.println(saldo);
    }
}
