public class Main {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();
        Func.dipendenteInit(biblioteca.dipendenti);
        Func.lettoreInit(biblioteca.lettori);
        Func.scaffaleInit(biblioteca.scaffali);
    }
}
