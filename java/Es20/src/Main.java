public class Main {
    public static void main(String[] args) {
        Libro libri[] = new Libro[10];
        libri[0] = new Libro("Operette morali", "Giacomo Leopardi", 200, 23.4);
        libri[1] = new Libro("I Promessi Sposi", "Alessandro Manzoni", 204, 44.4);
        libri[2] = new Libro("Confessioni di un italiano", "Ippolito Nievo", 2055, 35.4);
        libri[3] = new Libro("Giacinta", "Luigi Capuana", 234, 32.4);
        libri[4] = new Libro("I Malavoglia", "Giovanni Verga", 199, 29.4);
        libri[5] = new Libro("Malombra", "Antonio Fogazzaro", 433, 28.4);
        libri[6] = new Libro("Pinocchio", "Carlo Collodi", 180, 28.4);
        libri[7] = new Libro("Il ventre di Napoli", "Matilde Serao", 333, 27.4);
        libri[8] = new Libro("La vergine delle rocce", "Gabriele D’Annunzio", 200, 26.4);
        libri[9] = new Libro("Cuore", "Edmondo De Amicis", 2076, 25.4);

        for (int i = 0; i < 10; i++) {
            libri[i].stampaDettagli();
        }
    }
}
