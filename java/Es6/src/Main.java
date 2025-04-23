public class Main {
    public static void main(String[] args) {
        Auto v1 = new Auto("BMW", "X3", 2023, 56.4, 5, true);
        v1.mostraDettagli();
        v1.calcolaCostoNoleggio(3);
        Moto v2 = new Moto("Ducati", "V4", 2024, 32.4, 900);
        v2.mostraDettagli();
        v2.calcolaCostoNoleggio(2);
        Camion v3 = new Camion("Ford", "F-550", 2021, 80.3, 700, true);
        v3.mostraDettagli();
        v3.calcolaCostoNoleggio(7);
    }
}
