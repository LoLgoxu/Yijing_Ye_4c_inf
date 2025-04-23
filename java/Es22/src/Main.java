import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> nomi = new ArrayList<String>();
        nomi.add("Marco");
        nomi.add("Anna");
        nomi.add("Luca");
        nomi.add("Giulia");
        System.out.println(nomi);
        nomi.remove(2);
        //nomi.remove("Luca");
        for (int i = 0; i < nomi.size(); i++){
            if (nomi.get(i) == "Giulia"){
                System.out.println("esiste");
                break;
            }
        }
        System.out.println(nomi.size());
    }
}
