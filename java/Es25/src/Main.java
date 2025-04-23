import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        //input obj
        Scanner input = new Scanner(System.in);

        //creazione di una Arraylist
        /*List is a child interface of Collection.
        It is an ordered collection of objects in which duplicate values can be stored.
        Since List preserves the insertion order, it allows positional access and insertion of elements.
        List interface is implemented by the classes of ArrayList, LinkedList, Vector, and Stack.
        List is an interface, and the instances of List can be created by implementing various classes.*/
        List<String> parole = new ArrayList<>();

        //input di tutte le celle dell'Arraylist
        for (int i = 0; i < 5; i++) {
            System.out.println("inserisci la " + (i + 1) + " parola");
            parole.add(input.nextLine());
        }

        System.out.println("ArrayList with duplicates: "
                + parole);

        List<String> nuovaLista = parole.stream()
                .distinct()
                .collect(Collectors.toList());

        System.out.println("ArrayList with duplicates removed: "
                + nuovaLista);
    }
}
