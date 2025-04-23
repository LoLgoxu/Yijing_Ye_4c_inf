import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

public class Func {
    static Random rand = new Random();

    static void randomNameGenerator(String nome) {
        try {
            String fileName = "names.txt";
            ArrayList<String> allNames = new ArrayList<String>();
            Random r = new Random();

            BufferedReader in = new BufferedReader(new FileReader(fileName));
            while (in.ready()) {
                allNames.add( in.readLine() );
            }
            in.close();
            String randomName = allNames.get(r.nextInt(allNames.size()));
            nome = randomName;
        }
        catch (IOException e) {
            System.out.println("An error has occurred.");
            e.printStackTrace();
        }
    }

    static void scaffaleInit(Scaffale[] scaffali) {
        for (int i = 0; i < scaffali.length; i++) {
            scaffali[i].totLibri = 200;
        }
    }

    static void dipendenteInit(Dipendente[] dipendenti) {
        for (int i = 0; i < dipendenti.length; i++) {
            randomNameGenerator(dipendenti[i].nome);
            dipendenti[i].eta = rand.nextInt(70);
        }
    }

    static void lettoreInit(Lettore[] lettori) {
        for (int i = 0; i < lettori.length; i++) {
            randomNameGenerator(lettori[i].nome);
            lettori[i].eta = rand.nextInt(70);
        }
    }
}
