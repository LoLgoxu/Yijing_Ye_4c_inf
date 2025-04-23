public class Main {
    public static void main(String[] args) {
        Studente studenti[] = new Studente[5];
        studenti[0] = new Studente("Yijing", "Ye", 4044, 5.25);
        studenti[1] = new Studente("Pippo", "Calzelunghe", 4045, 6.25);
        studenti[2] = new Studente("Mario", "Gaio", 4046, 7.25);
        studenti[3] = new Studente("Marco", "Aurelio", 4047, 8.25);
        studenti[4] = new Studente("Gianni", "Rosuelo", 4048, 9.25);
        studenti[0].stampaDati();
        studenti[1].stampaDati();
        studenti[2].stampaDati();
        studenti[3].stampaDati();
        studenti[4].stampaDati();
    }
}
