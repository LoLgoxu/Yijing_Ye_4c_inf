public class Main {
    public static void main(String[] args) {
        Auto auto1 = new Auto(200, 300, 6, "BMW", 6, 4, "coupe'", 4);
        Moto moto1 = new Moto(300, 210, 5, "Ducati", 4, "sportiva");
        auto1.getNumCilindri();
        moto1.getNumCilindri();
        auto1.avviaMotore();
        auto1.cambiaMarcia(auto1.marcia);
        auto1.spegniMotore();
        auto1.cambiaMarcia(auto1.marcia);
    }
}
